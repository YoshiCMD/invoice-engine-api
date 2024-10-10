package bo.codexd.invoice.engine.api.service.code;

import bo.codexd.invoice.engine.api.enumeration.Environment;
import bo.codexd.invoice.engine.api.enumeration.OnlineMode;
import bo.codexd.invoice.engine.api.exception.SiatException;
import bo.codexd.invoice.engine.api.mapper.siat.code.CufdMassiveMapper;
import bo.codexd.invoice.engine.api.request.CodeCufdMassiveSyncRequest;
import bo.codexd.invoice.engine.api.request.CufdDataRequest;
import bo.codexd.invoice.engine.api.service.code.dto.CufdMassiveDTO;
import bo.gob.impuestos.siat.api.facturacion.codigos.RespuestaCufdMasivo;
import bo.gob.impuestos.siat.api.facturacion.codigos.ServicioFacturacionCodigos;
import bo.gob.impuestos.siat.api.facturacion.codigos.SolicitudCufdMasivo;
import bo.gob.impuestos.siat.api.facturacion.codigos.SolicitudListaCufdDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Created by yoshi on 12 October 2023
 */
@Slf4j
@AllArgsConstructor
public class CodeSyncCufdMassiveService {

    private final CodeSyncProxy codeSyncProxy = new CodeSyncProxy();

    public List<CufdMassiveDTO> createCufdMassive(String token, Environment environment, OnlineMode onlineMode, CodeCufdMassiveSyncRequest request) {
        log.info("Create Cufd Massive environment: {}, onlineMode: {}, request: {}", environment, onlineMode, request);
        ServicioFacturacionCodigos proxy = codeSyncProxy.createProxyInstance(token, environment.getCode());

        SolicitudCufdMasivo solicitudCufdMasivo = new SolicitudCufdMasivo();
        solicitudCufdMasivo.setCodigoModalidad(onlineMode.getCode());
        solicitudCufdMasivo.setCodigoAmbiente(environment.getCode());
        solicitudCufdMasivo.setNit(request.getNit());
        solicitudCufdMasivo.setCodigoSistema(request.getSystemCode());

        for (CufdDataRequest branchData : request.getCufdData()) {
            SolicitudListaCufdDto solicitudListaCufdDto = new SolicitudListaCufdDto();
            solicitudListaCufdDto.setCuis(branchData.getCuis());
            solicitudListaCufdDto.setCodigoSucursal(branchData.getBranchCode());
            solicitudListaCufdDto.setCodigoPuntoVenta(branchData.getPointOfSaleCode());
            solicitudCufdMasivo.getDatosSolicitud().add(solicitudListaCufdDto);
        }

        RespuestaCufdMasivo respuestaCufd = proxy.cufdMasivo(solicitudCufdMasivo);
        if (respuestaCufd.isTransaccion()) {
            return CufdMassiveMapper.INSTANCE.toDto(respuestaCufd.getListaRespuestasCufd());
        } else {
            if ((respuestaCufd.getMensajesList() == null || respuestaCufd.getMensajesList().isEmpty()) && !respuestaCufd.getListaRespuestasCufd().isEmpty()) {
                return CufdMassiveMapper.INSTANCE.toDto(respuestaCufd.getListaRespuestasCufd());
            } else {
                throw new SiatException("siat create cufd error", "data.code.create.cufd", respuestaCufd.getMensajesList());
            }
        }
    }
}
