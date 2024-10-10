
package bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos;

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
     * @param solicitudServicioRecepcionPaquete
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RespuestaRecepcion
     */
    @WebMethod
    @WebResult(name = "RespuestaServicioFacturacion", targetNamespace = "")
    @RequestWrapper(localName = "recepcionPaqueteFactura", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RecepcionPaqueteFactura")
    @ResponseWrapper(localName = "recepcionPaqueteFacturaResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RecepcionPaqueteFacturaResponse")
    public RespuestaRecepcion recepcionPaqueteFactura(
        @WebParam(name = "SolicitudServicioRecepcionPaquete", targetNamespace = "")
        SolicitudRecepcionPaquete solicitudServicioRecepcionPaquete);

    /**
     * 
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RespuestaComunicacion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verificarComunicacion", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.VerificarComunicacion")
    @ResponseWrapper(localName = "verificarComunicacionResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.VerificarComunicacionResponse")
    public RespuestaComunicacion verificarComunicacion();

    /**
     * 
     * @param solicitudServicioRecepcionFactura
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RespuestaRecepcion
     */
    @WebMethod
    @WebResult(name = "RespuestaServicioFacturacion", targetNamespace = "")
    @RequestWrapper(localName = "recepcionFactura", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RecepcionFactura")
    @ResponseWrapper(localName = "recepcionFacturaResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RecepcionFacturaResponse")
    public RespuestaRecepcion recepcionFactura(
        @WebParam(name = "SolicitudServicioRecepcionFactura", targetNamespace = "")
        SolicitudRecepcionFactura solicitudServicioRecepcionFactura);

    /**
     * 
     * @param solicitudServicioValidacionRecepcionMasiva
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RespuestaRecepcion
     */
    @WebMethod
    @WebResult(name = "RespuestaServicioFacturacion", targetNamespace = "")
    @RequestWrapper(localName = "validacionRecepcionMasivaFacturaYPFB", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.ValidacionRecepcionMasivaFacturaYPFB")
    @ResponseWrapper(localName = "validacionRecepcionMasivaFacturaYPFBResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.ValidacionRecepcionMasivaFacturaYPFBResponse")
    public RespuestaRecepcion validacionRecepcionMasivaFacturaYPFB(
        @WebParam(name = "SolicitudServicioValidacionRecepcionMasiva", targetNamespace = "")
        SolicitudValidacionRecepcion solicitudServicioValidacionRecepcionMasiva);

    /**
     * 
     * @param solicitudServicioReversionAnulacionFactura
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RespuestaRecepcion
     */
    @WebMethod
    @WebResult(name = "RespuestaServicioFacturacion", targetNamespace = "")
    @RequestWrapper(localName = "reversionAnulacionFactura", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.ReversionAnulacionFactura")
    @ResponseWrapper(localName = "reversionAnulacionFacturaResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.ReversionAnulacionFacturaResponse")
    public RespuestaRecepcion reversionAnulacionFactura(
        @WebParam(name = "SolicitudServicioReversionAnulacionFactura", targetNamespace = "")
        SolicitudReversionAnulacion solicitudServicioReversionAnulacionFactura);

    /**
     * 
     * @param solicitudServicioRecepcionMasiva
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RespuestaRecepcion
     */
    @WebMethod
    @WebResult(name = "RespuestaServicioFacturacion", targetNamespace = "")
    @RequestWrapper(localName = "recepcionMasivaContratosYPFB", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RecepcionMasivaContratosYPFB")
    @ResponseWrapper(localName = "recepcionMasivaContratosYPFBResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RecepcionMasivaContratosYPFBResponse")
    public RespuestaRecepcion recepcionMasivaContratosYPFB(
        @WebParam(name = "SolicitudServicioRecepcionMasiva", targetNamespace = "")
        SolicitudRecepcionMasiva solicitudServicioRecepcionMasiva);

    /**
     * 
     * @param solicitudServicioValidacionRecepcionMasiva
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RespuestaRecepcion
     */
    @WebMethod
    @WebResult(name = "RespuestaServicioFacturacion", targetNamespace = "")
    @RequestWrapper(localName = "validacionRecepcionMasivaFactura", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.ValidacionRecepcionMasivaFactura")
    @ResponseWrapper(localName = "validacionRecepcionMasivaFacturaResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.ValidacionRecepcionMasivaFacturaResponse")
    public RespuestaRecepcion validacionRecepcionMasivaFactura(
        @WebParam(name = "SolicitudServicioValidacionRecepcionMasiva", targetNamespace = "")
        SolicitudValidacionRecepcion solicitudServicioValidacionRecepcionMasiva);

    /**
     * 
     * @param solicitudServicioRecepcionMasiva
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RespuestaRecepcion
     */
    @WebMethod
    @WebResult(name = "RespuestaServicioFacturacion", targetNamespace = "")
    @RequestWrapper(localName = "recepcionMasivaFactura", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RecepcionMasivaFactura")
    @ResponseWrapper(localName = "recepcionMasivaFacturaResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RecepcionMasivaFacturaResponse")
    public RespuestaRecepcion recepcionMasivaFactura(
        @WebParam(name = "SolicitudServicioRecepcionMasiva", targetNamespace = "")
        SolicitudRecepcionMasiva solicitudServicioRecepcionMasiva);

    /**
     * 
     * @param solicitudServicioVerificacionEstadoFactura
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RespuestaRecepcion
     */
    @WebMethod
    @WebResult(name = "RespuestaServicioFacturacion", targetNamespace = "")
    @RequestWrapper(localName = "verificacionEstadoFactura", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.VerificacionEstadoFactura")
    @ResponseWrapper(localName = "verificacionEstadoFacturaResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.VerificacionEstadoFacturaResponse")
    public RespuestaRecepcion verificacionEstadoFactura(
        @WebParam(name = "SolicitudServicioVerificacionEstadoFactura", targetNamespace = "")
        SolicitudVerificacionEstado solicitudServicioVerificacionEstadoFactura);

    /**
     * 
     * @param solicitudServicioValidacionRecepcionPaquete
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RespuestaRecepcion
     */
    @WebMethod
    @WebResult(name = "RespuestaServicioFacturacion", targetNamespace = "")
    @RequestWrapper(localName = "validacionRecepcionPaqueteFactura", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.ValidacionRecepcionPaqueteFactura")
    @ResponseWrapper(localName = "validacionRecepcionPaqueteFacturaResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.ValidacionRecepcionPaqueteFacturaResponse")
    public RespuestaRecepcion validacionRecepcionPaqueteFactura(
        @WebParam(name = "SolicitudServicioValidacionRecepcionPaquete", targetNamespace = "")
        SolicitudValidacionRecepcion solicitudServicioValidacionRecepcionPaquete);

    /**
     * 
     * @param solicitudServicioAnulacionFactura
     * @return
     *     returns bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.RespuestaRecepcion
     */
    @WebMethod
    @WebResult(name = "RespuestaServicioFacturacion", targetNamespace = "")
    @RequestWrapper(localName = "anulacionFactura", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.AnulacionFactura")
    @ResponseWrapper(localName = "anulacionFacturaResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos.AnulacionFacturaResponse")
    public RespuestaRecepcion anulacionFactura(
        @WebParam(name = "SolicitudServicioAnulacionFactura", targetNamespace = "")
        SolicitudAnulacion solicitudServicioAnulacionFactura);

}
