package bo.codexd.invoice.engine.api.service.data.synchronization;

import bo.codexd.invoice.engine.api.enumeration.Environment;
import bo.codexd.invoice.engine.api.exception.SiatException;
import bo.codexd.invoice.engine.api.mapper.siat.data.synchonization.CommunicationMapper;
import bo.codexd.invoice.engine.api.mapper.siat.data.synchonization.DataTimeMapper;
import bo.codexd.invoice.engine.api.request.DataSyncRequest;
import bo.codexd.invoice.engine.api.service.data.synchronization.dto.CommunicationDTO;
import bo.codexd.invoice.engine.api.service.data.synchronization.dto.DataTimeDTO;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaComunicacion;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaFechaHora;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.ServicioFacturacionSincronizacion;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.SolicitudSincronizacion;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import static bo.codexd.invoice.engine.api.util.ObjectFactoryUtil.convert;

/**
 * Created by yoshi on 12 October 2023
 */
@Slf4j
@AllArgsConstructor
public class DataSyncService {

    public CommunicationDTO verifyCommunication(String token, Environment environment) {
        log.info("Verify Communication environment: {}", environment);
        ServicioFacturacionSincronizacion proxy = new DataSyncProxy().createProxyInstance(token, environment.getCode());
        RespuestaComunicacion respuestaComunicacion = proxy.verificarComunicacion();
        if (respuestaComunicacion.isTransaccion()) {
            return CommunicationMapper.INSTANCE.toDto(respuestaComunicacion);
        } else {
            throw new SiatException("siat sync verify communication", "data.sync.verify.communication", respuestaComunicacion.getMensajesList());
        }
    }

    public DataTimeDTO syncDataTime(String token, Environment environment, DataSyncRequest request) {
        log.info("Sync Data Time Messages environment: {}, request: {}", environment, request);
        ServicioFacturacionSincronizacion proxy = new DataSyncProxy().createProxyInstance(token, environment.getCode());

        SolicitudSincronizacion solicitudSincronizacion = new SolicitudSincronizacion();
        solicitudSincronizacion.setCodigoAmbiente(environment.getCode());
        solicitudSincronizacion.setCuis(request.getCuis());
        solicitudSincronizacion.setNit(request.getNit());
        solicitudSincronizacion.setCodigoSistema(request.getSystemCode());
        solicitudSincronizacion.setCodigoSucursal(request.getBranchCode());
        solicitudSincronizacion.setCodigoPuntoVenta(convert(request.getPointOfSaleCode()));

        RespuestaFechaHora respuestaFechaHora = proxy.sincronizarFechaHora(solicitudSincronizacion);
        if (respuestaFechaHora.isTransaccion()) {
            return DataTimeMapper.INSTANCE.toDto(respuestaFechaHora);
        } else {
            throw new SiatException("siat sync verify communication", "data.sync.verify.communication", respuestaFechaHora.getMensajesList());
        }
    }
}
