package bo.codexd.invoice.engine.api.service.data.synchronization;

import bo.codexd.invoice.engine.api.enumeration.Environment;
import bo.codexd.invoice.engine.api.exception.SiatException;
import bo.codexd.invoice.engine.api.mapper.siat.data.synchonization.ActivityMapper;
import bo.codexd.invoice.engine.api.request.DataSyncRequest;
import bo.codexd.invoice.engine.api.service.data.synchronization.dto.ActivityDTO;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaActividades;
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
public class DataSyncActivityService {

    private final DataSyncProxy dataSyncProxy = new DataSyncProxy();

    public List<ActivityDTO> sync(String token, Environment environment, DataSyncRequest request) {
        log.info("Sync Activities environment: {}, request: {}", environment, request);
        ServicioFacturacionSincronizacion proxy = dataSyncProxy.createProxyInstance(token, environment.getCode());

        SolicitudSincronizacion solicitudSincronizacion = new SolicitudSincronizacion();
        solicitudSincronizacion.setCodigoAmbiente(environment.getCode());
        solicitudSincronizacion.setCuis(request.getCuis());
        solicitudSincronizacion.setNit(request.getNit());
        solicitudSincronizacion.setCodigoSistema(request.getSystemCode());
        solicitudSincronizacion.setCodigoSucursal(request.getBranchCode());
        solicitudSincronizacion.setCodigoPuntoVenta(convert(request.getPointOfSaleCode()));

        RespuestaListaActividades listaActividades = proxy.sincronizarActividades(solicitudSincronizacion);
        if (listaActividades.isTransaccion()) {
            return ActivityMapper.INSTANCE.toDto(listaActividades.getListaActividades());
        } else {
            throw new SiatException("siat sync activities error", "data.sync.activities", listaActividades.getMensajesList());
        }
    }
}
