
package bo.gob.impuestos.siat.api.servicio.recepcion.compras;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ServicioFacturacion", targetNamespace = "https://siat.impuestos.gob.bo/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioFacturacion {


    /**
     * 
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.recepcion.compras.RespuestaComunicacion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verificarComunicacion", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.recepcion.compras.VerificarComunicacion")
    @ResponseWrapper(localName = "verificarComunicacionResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.recepcion.compras.VerificarComunicacionResponse")
    public RespuestaComunicacion verificarComunicacion();

    /**
     * 
     * @param solicitudValidacionRecepcionCompras
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.recepcion.compras.RespuestaRecepcion
     */
    @WebMethod
    @WebResult(name = "RespuestaServicioFacturacion", targetNamespace = "")
    @RequestWrapper(localName = "validacionRecepcionPaqueteCompras", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.recepcion.compras.ValidacionRecepcionPaqueteCompras")
    @ResponseWrapper(localName = "validacionRecepcionPaqueteComprasResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.recepcion.compras.ValidacionRecepcionPaqueteComprasResponse")
    public RespuestaRecepcion validacionRecepcionPaqueteCompras(
        @WebParam(name = "SolicitudValidacionRecepcionCompras", targetNamespace = "")
        SolicitudValidacionRecepcionCompras solicitudValidacionRecepcionCompras);

    /**
     * 
     * @param solicitudRecepcionCompras
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.recepcion.compras.RespuestaRecepcion
     */
    @WebMethod
    @WebResult(name = "RespuestaServicioFacturacion", targetNamespace = "")
    @RequestWrapper(localName = "recepcionPaqueteCompras", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.recepcion.compras.RecepcionPaqueteCompras")
    @ResponseWrapper(localName = "recepcionPaqueteComprasResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.recepcion.compras.RecepcionPaqueteComprasResponse")
    public RespuestaRecepcion recepcionPaqueteCompras(
        @WebParam(name = "SolicitudRecepcionCompras", targetNamespace = "")
        SolicitudRecepcionCompras solicitudRecepcionCompras);

    /**
     * 
     * @param solicitudAnulacionCompra
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.recepcion.compras.RespuestaRecepcion
     */
    @WebMethod
    @WebResult(name = "RespuestaServicioFacturacion", targetNamespace = "")
    @RequestWrapper(localName = "anulacionCompra", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.recepcion.compras.AnulacionCompra")
    @ResponseWrapper(localName = "anulacionCompraResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.recepcion.compras.AnulacionCompraResponse")
    public RespuestaRecepcion anulacionCompra(
        @WebParam(name = "SolicitudAnulacionCompra", targetNamespace = "")
        SolicitudAnulacionCompra solicitudAnulacionCompra);

    /**
     * 
     * @param solicitudConfirmacionCompras
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.recepcion.compras.RespuestaRecepcion
     */
    @WebMethod
    @WebResult(name = "RespuestaServicioFacturacion", targetNamespace = "")
    @RequestWrapper(localName = "confirmacionCompras", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.recepcion.compras.ConfirmacionCompras")
    @ResponseWrapper(localName = "confirmacionComprasResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.recepcion.compras.ConfirmacionComprasResponse")
    public RespuestaRecepcion confirmacionCompras(
        @WebParam(name = "SolicitudConfirmacionCompras", targetNamespace = "")
        SolicitudRecepcionCompras solicitudConfirmacionCompras);

    /**
     * 
     * @param solicitudConsultaCompras
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.recepcion.compras.RespuestaConsultaCompras
     */
    @WebMethod
    @WebResult(name = "RespuestaServicioFacturacion", targetNamespace = "")
    @RequestWrapper(localName = "consultaCompras", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.recepcion.compras.ConsultaCompras")
    @ResponseWrapper(localName = "consultaComprasResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.recepcion.compras.ConsultaComprasResponse")
    public RespuestaConsultaCompras consultaCompras(
        @WebParam(name = "SolicitudConsultaCompras", targetNamespace = "")
        SolicitudConsultaCompras solicitudConsultaCompras);

}
