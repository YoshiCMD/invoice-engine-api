package bo.codexd.invoice.engine.api.service.data.synchronization;

import bo.codexd.invoice.engine.api.enumeration.Environment;
import bo.codexd.invoice.engine.api.exception.SiatException;
import bo.codexd.invoice.engine.api.mapper.siat.data.synchonization.ParametricMapper;
import bo.codexd.invoice.engine.api.request.DataSyncRequest;
import bo.codexd.invoice.engine.api.service.data.synchronization.dto.ParametricDTO;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaParametricas;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.ServicioFacturacionSincronizacion;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.SolicitudSincronizacion;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static bo.codexd.invoice.engine.api.util.ObjectFactoryUtil.convert;

/**
 * Created by yoshi on 12 October 2023
 */
@Slf4j
@AllArgsConstructor
public class DataSyncServiceMessageService {

    private final DataSyncProxy dataSyncProxy = new DataSyncProxy();

    public List<ParametricDTO> sync(String token, Environment environment, DataSyncRequest request) {
        log.info("Sync Service Messages environment: {}, request: {}", environment, request);
        ServicioFacturacionSincronizacion proxy = dataSyncProxy.createProxyInstance(token, environment.getCode());

        SolicitudSincronizacion solicitudSincronizacion = new SolicitudSincronizacion();
        solicitudSincronizacion.setCodigoAmbiente(environment.getCode());
        solicitudSincronizacion.setCuis(request.getCuis());
        solicitudSincronizacion.setNit(request.getNit());
        solicitudSincronizacion.setCodigoSistema(request.getSystemCode());
        solicitudSincronizacion.setCodigoSucursal(request.getBranchCode());
        solicitudSincronizacion.setCodigoPuntoVenta(convert(request.getPointOfSaleCode()));

        RespuestaListaParametricas listaParametricas = proxy.sincronizarListaMensajesServicios(solicitudSincronizacion);
        if (listaParametricas.isTransaccion()) {
            return ParametricMapper.INSTANCE.toDto(listaParametricas.getListaCodigos());
        } else {
            throw new SiatException("siat sync service messages error", "data.sync.service.messages", listaParametricas.getMensajesList());
        }
    }
}
