package bo.codexd.invoice.engine.api.service.code;

import bo.codexd.invoice.engine.api.enumeration.Environment;
import bo.codexd.invoice.engine.api.enumeration.OnlineMode;
import bo.codexd.invoice.engine.api.exception.SiatException;
import bo.codexd.invoice.engine.api.mapper.siat.code.CuisMassiveMapper;
import bo.codexd.invoice.engine.api.request.CodeCuisMassiveSyncRequest;
import bo.codexd.invoice.engine.api.request.CufdDataRequest;
import bo.codexd.invoice.engine.api.service.code.dto.CuisMassiveDTO;
import bo.gob.impuestos.siat.api.facturacion.codigos.RespuestaCuisMasivo;
import bo.gob.impuestos.siat.api.facturacion.codigos.ServicioFacturacionCodigos;
import bo.gob.impuestos.siat.api.facturacion.codigos.SolicitudCuisMasivoSistemas;
import bo.gob.impuestos.siat.api.facturacion.codigos.SolicitudListaCuisDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Created by yoshi on 12 October 2023
 */
@Slf4j
@AllArgsConstructor
public class CodeSyncCuisMassiveService {

    private final CodeSyncProxy codeSyncProxy = new CodeSyncProxy();

    public List<CuisMassiveDTO> createCuisMassive(String token, Environment environment, OnlineMode onlineMode, CodeCuisMassiveSyncRequest request) {
        log.info("Create Cuis Massive environment: {}, onlineMode: {}, request: {}", environment, onlineMode, request);
        ServicioFacturacionCodigos proxy = codeSyncProxy.createProxyInstance(token, environment.getCode());

        SolicitudCuisMasivoSistemas solicitudCuisMasivoSistemas = new SolicitudCuisMasivoSistemas();
        solicitudCuisMasivoSistemas.setCodigoModalidad(onlineMode.getCode());
        solicitudCuisMasivoSistemas.setCodigoAmbiente(environment.getCode());
        solicitudCuisMasivoSistemas.setNit(request.getNit());
        solicitudCuisMasivoSistemas.setCodigoSistema(request.getSystemCode());

        for (CufdDataRequest branchData : request.getCuisData()) {
            SolicitudListaCuisDto solicitudListaCuisDto = new SolicitudListaCuisDto();
            solicitudListaCuisDto.setCodigoSucursal(branchData.getBranchCode());
            solicitudListaCuisDto.setCodigoPuntoVenta(branchData.getPointOfSaleCode());
            solicitudCuisMasivoSistemas.getDatosSolicitud().add(solicitudListaCuisDto);
        }

        RespuestaCuisMasivo respuestaCufdMasivo = proxy.cuisMasivo(solicitudCuisMasivoSistemas);
        if (respuestaCufdMasivo.isTransaccion()) {
            return CuisMassiveMapper.INSTANCE.toDto(respuestaCufdMasivo.getListaRespuestasCuis());
        } else {
            if ((respuestaCufdMasivo.getMensajesList() == null || respuestaCufdMasivo.getMensajesList().isEmpty()) && !respuestaCufdMasivo.getListaRespuestasCuis().isEmpty()) {
                return CuisMassiveMapper.INSTANCE.toDto(respuestaCufdMasivo.getListaRespuestasCuis());
            } else {
                throw new SiatException("siat create cuis error", "data.code.create.cuis", respuestaCufdMasivo.getMensajesList());
            }
        }
    }
}
