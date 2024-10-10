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
import java.util.function.Function;

import static bo.codexd.invoice.engine.api.util.ObjectFactoryUtil.convert;

/**
 * Created by yoshi on 12 October 2023
 */
@Slf4j
@AllArgsConstructor
public class DataSyncParametricService {

    private final DataSyncProxy dataSyncProxy = new DataSyncProxy();

    public List<ParametricDTO> sync(Function<Void, RespuestaListaParametricas> function) {
        RespuestaListaParametricas listaParametricas = function.apply(null);
        if (listaParametricas.isTransaccion()) {
            return ParametricMapper.INSTANCE.toDto(listaParametricas.getListaCodigos());
        } else {
            throw new SiatException("siat sync parametrics error", "data.sync.parametrics", listaParametricas.getMensajesList());
        }
    }

    private SolicitudSincronizacion crearSolicitudSincronizacion(Environment environment, DataSyncRequest request) {
        log.info("Sync Parametrics environment: {}, request: {}", environment, request);
        SolicitudSincronizacion solicitudSincronizacion = new SolicitudSincronizacion();
        solicitudSincronizacion.setCodigoAmbiente(environment.getCode());
        solicitudSincronizacion.setCuis(request.getCuis());
        solicitudSincronizacion.setNit(request.getNit());
        solicitudSincronizacion.setCodigoSistema(request.getSystemCode());
        solicitudSincronizacion.setCodigoSucursal(request.getBranchCode());
        solicitudSincronizacion.setCodigoPuntoVenta(convert(request.getPointOfSaleCode()));
        return solicitudSincronizacion;

    }

    public RespuestaListaParametricas syncSignificantEvent(String token, Environment environment, DataSyncRequest request) {
        ServicioFacturacionSincronizacion proxy = dataSyncProxy.createProxyInstance(token, environment.getCode());
        return proxy.sincronizarParametricaEventosSignificativos(crearSolicitudSincronizacion(environment, request));
    }

    public RespuestaListaParametricas syncReasonsCancellation(String token, Environment environment, DataSyncRequest request) {
        ServicioFacturacionSincronizacion proxy = dataSyncProxy.createProxyInstance(token, environment.getCode());
        return proxy.sincronizarParametricaMotivoAnulacion(crearSolicitudSincronizacion(environment, request));
    }

    public RespuestaListaParametricas syncOriginCountries(String token, Environment environment, DataSyncRequest request) {
        ServicioFacturacionSincronizacion proxy = dataSyncProxy.createProxyInstance(token, environment.getCode());
        return proxy.sincronizarParametricaPaisOrigen(crearSolicitudSincronizacion(environment, request));
    }

    public RespuestaListaParametricas syncDocumentTypes(String token, Environment environment, DataSyncRequest request) {
        ServicioFacturacionSincronizacion proxy = dataSyncProxy.createProxyInstance(token, environment.getCode());
        return proxy.sincronizarParametricaTipoDocumentoIdentidad(crearSolicitudSincronizacion(environment, request));
    }

    public RespuestaListaParametricas syncDocumentSectorTypes(String token, Environment environment, DataSyncRequest request) {
        ServicioFacturacionSincronizacion proxy = dataSyncProxy.createProxyInstance(token, environment.getCode());
        return proxy.sincronizarParametricaTipoDocumentoSector(crearSolicitudSincronizacion(environment, request));
    }

    public RespuestaListaParametricas syncEmissionTypes(String token, Environment environment, DataSyncRequest request) {
        ServicioFacturacionSincronizacion proxy = dataSyncProxy.createProxyInstance(token, environment.getCode());
        return proxy.sincronizarParametricaTipoEmision(crearSolicitudSincronizacion(environment, request));
    }

    public RespuestaListaParametricas syncRoomTypes(String token, Environment environment, DataSyncRequest request) {
        ServicioFacturacionSincronizacion proxy = dataSyncProxy.createProxyInstance(token, environment.getCode());
        return proxy.sincronizarParametricaTipoHabitacion(crearSolicitudSincronizacion(environment, request));
    }

    public RespuestaListaParametricas syncPaymentMethodTypes(String token, Environment environment, DataSyncRequest request) {
        ServicioFacturacionSincronizacion proxy = dataSyncProxy.createProxyInstance(token, environment.getCode());
        return proxy.sincronizarParametricaTipoMetodoPago(crearSolicitudSincronizacion(environment, request));
    }

    public RespuestaListaParametricas syncCurrentTypes(String token, Environment environment, DataSyncRequest request) {
        ServicioFacturacionSincronizacion proxy = dataSyncProxy.createProxyInstance(token, environment.getCode());
        return proxy.sincronizarParametricaTipoMoneda(crearSolicitudSincronizacion(environment, request));
    }

    public RespuestaListaParametricas syncPointOfSaleTypes(String token, Environment environment, DataSyncRequest request) {
        ServicioFacturacionSincronizacion proxy = dataSyncProxy.createProxyInstance(token, environment.getCode());
        return proxy.sincronizarParametricaTipoPuntoVenta(crearSolicitudSincronizacion(environment, request));
    }

    public RespuestaListaParametricas syncInvoiceTypes(String token, Environment environment, DataSyncRequest request) {
        ServicioFacturacionSincronizacion proxy = dataSyncProxy.createProxyInstance(token, environment.getCode());
        return proxy.sincronizarParametricaTiposFactura(crearSolicitudSincronizacion(environment, request));
    }

    public RespuestaListaParametricas syncUnitMeasurements(String token, Environment environment, DataSyncRequest request) {
        ServicioFacturacionSincronizacion proxy = dataSyncProxy.createProxyInstance(token, environment.getCode());
        return proxy.sincronizarParametricaUnidadMedida(crearSolicitudSincronizacion(environment, request));
    }
}
