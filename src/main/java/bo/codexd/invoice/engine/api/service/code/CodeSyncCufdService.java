package bo.codexd.invoice.engine.api.service.code;

import bo.codexd.invoice.engine.api.enumeration.Environment;
import bo.codexd.invoice.engine.api.enumeration.OnlineMode;
import bo.codexd.invoice.engine.api.exception.SiatException;
import bo.codexd.invoice.engine.api.mapper.siat.code.CufdMapper;
import bo.codexd.invoice.engine.api.request.DataSyncRequest;
import bo.codexd.invoice.engine.api.service.code.dto.CufdDTO;
import bo.gob.impuestos.siat.api.facturacion.codigos.RespuestaCufd;
import bo.gob.impuestos.siat.api.facturacion.codigos.ServicioFacturacionCodigos;
import bo.gob.impuestos.siat.api.facturacion.codigos.SolicitudCufd;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import static bo.codexd.invoice.engine.api.util.ObjectFactoryUtil.convert;

/**
 * Created by yoshi on 12 October 2023
 */
@Slf4j
@AllArgsConstructor
public class CodeSyncCufdService {

    private final CodeSyncProxy codeSyncProxy = new CodeSyncProxy();


    public CufdDTO createCufd(String token, Environment environment, OnlineMode onlineMode, DataSyncRequest request) {
        log.info("Create Cufd environment: {}, onlineMode: {}, request: {}", environment, onlineMode, request);
        ServicioFacturacionCodigos proxy = codeSyncProxy.createProxyInstance(token, environment.getCode());

        SolicitudCufd solicitudCufd = new SolicitudCufd();
        solicitudCufd.setCodigoModalidad(onlineMode.getCode());
        solicitudCufd.setCodigoAmbiente(environment.getCode());
        solicitudCufd.setNit(request.getNit());
        solicitudCufd.setCodigoSistema(request.getSystemCode());
        solicitudCufd.setCodigoSucursal(request.getBranchCode());
        solicitudCufd.setCodigoPuntoVenta(convert(request.getPointOfSaleCode()));
        solicitudCufd.setCuis(request.getCuis());

        RespuestaCufd respuestaCufd = proxy.cufd(solicitudCufd);
        if (respuestaCufd.isTransaccion()) {
            return CufdMapper.INSTANCE.toDto(respuestaCufd);
        } else {
            throw new SiatException("siat create cufd error", "data.code.create.cufd", respuestaCufd.getMensajesList());
        }
    }
}
