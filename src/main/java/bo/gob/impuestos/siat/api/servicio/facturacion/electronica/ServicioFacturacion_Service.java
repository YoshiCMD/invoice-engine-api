
package bo.gob.impuestos.siat.api.servicio.facturacion.electronica;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "ServicioFacturacion", targetNamespace = "https://siat.impuestos.gob.bo/ServicioFacturacionElectronica", wsdlLocation = "https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioFacturacionElectronica?wsdl")
public class ServicioFacturacion_Service
    extends Service
{

    private final static URL SERVICIOFACTURACION_WSDL_LOCATION;
    private final static WebServiceException SERVICIOFACTURACION_EXCEPTION;
    private final static QName SERVICIOFACTURACION_QNAME = new QName("https://siat.impuestos.gob.bo/ServicioFacturacionElectronica", "ServicioFacturacion");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioFacturacionElectronica?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOFACTURACION_WSDL_LOCATION = url;
        SERVICIOFACTURACION_EXCEPTION = e;
    }

    public ServicioFacturacion_Service() {
        super(__getWsdlLocation(), SERVICIOFACTURACION_QNAME);
    }

    public ServicioFacturacion_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOFACTURACION_QNAME, features);
    }

    public ServicioFacturacion_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOFACTURACION_QNAME);
    }

    public ServicioFacturacion_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOFACTURACION_QNAME, features);
    }

    public ServicioFacturacion_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioFacturacion_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioFacturacion
     */
    @WebEndpoint(name = "ServicioFacturacionPort")
    public ServicioFacturacion getServicioFacturacionPort() {
        return super.getPort(new QName("https://siat.impuestos.gob.bo/ServicioFacturacionElectronica", "ServicioFacturacionPort"), ServicioFacturacion.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioFacturacion
     */
    @WebEndpoint(name = "ServicioFacturacionPort")
    public ServicioFacturacion getServicioFacturacionPort(WebServiceFeature... features) {
        return super.getPort(new QName("https://siat.impuestos.gob.bo/ServicioFacturacionElectronica", "ServicioFacturacionPort"), ServicioFacturacion.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOFACTURACION_EXCEPTION!= null) {
            throw SERVICIOFACTURACION_EXCEPTION;
        }
        return SERVICIOFACTURACION_WSDL_LOCATION;
    }

}
