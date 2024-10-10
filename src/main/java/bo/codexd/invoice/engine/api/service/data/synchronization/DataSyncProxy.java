package bo.codexd.invoice.engine.api.service.data.synchronization;

import bo.codexd.invoice.engine.api.enumeration.Environment;
import bo.codexd.invoice.engine.api.exception.SiatException;
import bo.codexd.invoice.engine.api.handler.TokenHandler;
import bo.codexd.invoice.engine.api.property.SiatProperties;
import bo.codexd.invoice.engine.api.service.Constants;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.ServicioFacturacionSincronizacion;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.ServicioFacturacionSincronizacion_Service;
import jakarta.xml.ws.BindingProvider;
import lombok.extern.slf4j.Slf4j;

import java.net.URL;

/**
 * Created by yoshi on 12 October 2023
 */
@Slf4j
public class DataSyncProxy {

    public ServicioFacturacionSincronizacion createProxyInstance(String token, Integer environment) {

        SiatProperties siatProperties = new SiatProperties();

        ServicioFacturacionSincronizacion proxy;

        String endpoint;

        if (environment.equals(Environment.PRODUCTION.code)) {
            endpoint = siatProperties.getApi().getProduction().getDataSynchronization();
        } else {
            endpoint = siatProperties.getApi().getTest().getDataSynchronization();
        }

        try {
            ServicioFacturacionSincronizacion_Service port = new ServicioFacturacionSincronizacion_Service(new URL(endpoint));

            port.setHandlerResolver(new TokenHandler(token));

            proxy = port.getServicioFacturacionSincronizacionPort();

            ((BindingProvider) proxy).getRequestContext().put(Constants.REQUEST_TIMEOUT, siatProperties.getTimeoutRequest());
            ((BindingProvider) proxy).getRequestContext().put(Constants.CONNECT_TIMEOUT, siatProperties.getTimeoutConnect());
            return proxy;
        } catch (Exception e) {
            log.error("error ==>", e);
            throw new SiatException(e.getMessage(), "data.sync.proxy");
        }
    }
}
