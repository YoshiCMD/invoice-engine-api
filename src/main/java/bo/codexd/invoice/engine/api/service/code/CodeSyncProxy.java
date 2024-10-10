package bo.codexd.invoice.engine.api.service.code;

import bo.codexd.invoice.engine.api.enumeration.Environment;
import bo.codexd.invoice.engine.api.exception.SiatException;
import bo.codexd.invoice.engine.api.handler.TokenHandler;
import bo.codexd.invoice.engine.api.property.SiatProperties;
import bo.codexd.invoice.engine.api.service.Constants;
import bo.gob.impuestos.siat.api.facturacion.codigos.ServicioFacturacionCodigos;
import bo.gob.impuestos.siat.api.facturacion.codigos.ServicioFacturacionCodigos_Service;
import jakarta.xml.ws.BindingProvider;
import lombok.extern.slf4j.Slf4j;

import java.net.URL;

/**
 * Created by yoshi on 12 October 2023
 */
@Slf4j
public class CodeSyncProxy {

    public ServicioFacturacionCodigos createProxyInstance(String token, Integer environment) {

        SiatProperties siatProperties = new SiatProperties();

        ServicioFacturacionCodigos proxy;

        String endpoint;

        if (environment.equals(Environment.PRODUCTION.code)) {
            endpoint = siatProperties.getApi().getProduction().getCode();
        } else {
            endpoint = siatProperties.getApi().getTest().getCode();
        }

        try {
            ServicioFacturacionCodigos_Service port = new ServicioFacturacionCodigos_Service(new URL(endpoint));

            port.setHandlerResolver(new TokenHandler(token));

            proxy = port.getServicioFacturacionCodigosPort();

            ((BindingProvider) proxy).getRequestContext().put(Constants.REQUEST_TIMEOUT, siatProperties.getTimeoutRequest());
            ((BindingProvider) proxy).getRequestContext().put(Constants.CONNECT_TIMEOUT, siatProperties.getTimeoutConnect());
            return proxy;
        } catch (Exception e) {
            throw new SiatException(e.getMessage(), "code.proxy");
        }
    }
}
