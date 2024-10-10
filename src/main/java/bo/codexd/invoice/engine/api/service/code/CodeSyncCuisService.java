package bo.codexd.invoice.engine.api.service.code;

import bo.codexd.invoice.engine.api.enumeration.Environment;
import bo.codexd.invoice.engine.api.enumeration.OnlineMode;
import bo.codexd.invoice.engine.api.exception.SiatException;
import bo.codexd.invoice.engine.api.mapper.siat.code.CuisMapper;
import bo.codexd.invoice.engine.api.request.CodeSyncRequest;
import bo.codexd.invoice.engine.api.service.code.dto.CuisDTO;
import bo.gob.impuestos.siat.api.facturacion.codigos.RespuestaCuis;
import bo.gob.impuestos.siat.api.facturacion.codigos.ServicioFacturacionCodigos;
import bo.gob.impuestos.siat.api.facturacion.codigos.SolicitudCuis;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import static bo.codexd.invoice.engine.api.util.ObjectFactoryUtil.convert;

/**
 * Created by yoshi on 12 October 2023
 */
@Slf4j
@AllArgsConstructor
public class CodeSyncCuisService {

    private final CodeSyncProxy codeSyncProxy = new CodeSyncProxy();

    public CuisDTO createCuis(String token, Environment environment, OnlineMode onlineMode, CodeSyncRequest request) {
        log.info("Create Cuis environment: {}, onlineMode: {}, request: {}", environment, onlineMode, request);
        ServicioFacturacionCodigos proxy = codeSyncProxy.createProxyInstance(token, environment.getCode());

        SolicitudCuis solicitudCuis = new SolicitudCuis();
        solicitudCuis.setCodigoModalidad(onlineMode.getCode());
        solicitudCuis.setCodigoAmbiente(environment.getCode());
        solicitudCuis.setNit(request.getNit());
        solicitudCuis.setCodigoSistema(request.getSystemCode());
        solicitudCuis.setCodigoSucursal(request.getBranchCode());
        solicitudCuis.setCodigoPuntoVenta(convert(request.getPointOfSaleCode()));

        RespuestaCuis respuestaCuis = proxy.cuis(solicitudCuis);
        if (respuestaCuis.isTransaccion()) {
            return CuisMapper.INSTANCE.toDto(respuestaCuis);
        } else {
            if (respuestaCuis.getCodigo() != null) {
                return CuisMapper.INSTANCE.toDto(respuestaCuis);
            } else {
                throw new SiatException("siat create cuis error", "data.code.create.cuis", respuestaCuis.getMensajesList());
            }
        }
    }
}
