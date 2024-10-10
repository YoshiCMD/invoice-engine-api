
package bo.gob.impuestos.siat.api.facturacion.sincronizacion;

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
@WebService(name = "ServicioFacturacionSincronizacion", targetNamespace = "https://siat.impuestos.gob.bo/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioFacturacionSincronizacion {


    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaParametricas
     */
    @WebMethod
    @WebResult(name = "RespuestaListaParametricas", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarParametricaMotivoAnulacion", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaMotivoAnulacion")
    @ResponseWrapper(localName = "sincronizarParametricaMotivoAnulacionResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaMotivoAnulacionResponse")
    public RespuestaListaParametricas sincronizarParametricaMotivoAnulacion(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaActividades
     */
    @WebMethod
    @WebResult(name = "RespuestaListaActividades", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarActividades", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarActividades")
    @ResponseWrapper(localName = "sincronizarActividadesResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarActividadesResponse")
    public RespuestaListaActividades sincronizarActividades(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaFechaHora
     */
    @WebMethod
    @WebResult(name = "RespuestaFechaHora", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarFechaHora", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarFechaHora")
    @ResponseWrapper(localName = "sincronizarFechaHoraResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarFechaHoraResponse")
    public RespuestaFechaHora sincronizarFechaHora(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaParametricasLeyendas
     */
    @WebMethod
    @WebResult(name = "RespuestaListaParametricasLeyendas", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarListaLeyendasFactura", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarListaLeyendasFactura")
    @ResponseWrapper(localName = "sincronizarListaLeyendasFacturaResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarListaLeyendasFacturaResponse")
    public RespuestaListaParametricasLeyendas sincronizarListaLeyendasFactura(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaParametricas
     */
    @WebMethod
    @WebResult(name = "RespuestaListaParametricas", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarParametricaTipoHabitacion", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaTipoHabitacion")
    @ResponseWrapper(localName = "sincronizarParametricaTipoHabitacionResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaTipoHabitacionResponse")
    public RespuestaListaParametricas sincronizarParametricaTipoHabitacion(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaActividadesDocumentoSector
     */
    @WebMethod
    @WebResult(name = "RespuestaListaActividadesDocumentoSector", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarListaActividadesDocumentoSector", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarListaActividadesDocumentoSector")
    @ResponseWrapper(localName = "sincronizarListaActividadesDocumentoSectorResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarListaActividadesDocumentoSectorResponse")
    public RespuestaListaActividadesDocumentoSector sincronizarListaActividadesDocumentoSector(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaParametricas
     */
    @WebMethod
    @WebResult(name = "RespuestaListaParametricas", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarParametricaTipoDocumentoIdentidad", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaTipoDocumentoIdentidad")
    @ResponseWrapper(localName = "sincronizarParametricaTipoDocumentoIdentidadResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaTipoDocumentoIdentidadResponse")
    public RespuestaListaParametricas sincronizarParametricaTipoDocumentoIdentidad(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaParametricas
     */
    @WebMethod
    @WebResult(name = "RespuestaListaParametricas", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarParametricaUnidadMedida", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaUnidadMedida")
    @ResponseWrapper(localName = "sincronizarParametricaUnidadMedidaResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaUnidadMedidaResponse")
    public RespuestaListaParametricas sincronizarParametricaUnidadMedida(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaParametricas
     */
    @WebMethod
    @WebResult(name = "RespuestaListaParametricas", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarParametricaTipoDocumentoSector", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaTipoDocumentoSector")
    @ResponseWrapper(localName = "sincronizarParametricaTipoDocumentoSectorResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaTipoDocumentoSectorResponse")
    public RespuestaListaParametricas sincronizarParametricaTipoDocumentoSector(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaParametricas
     */
    @WebMethod
    @WebResult(name = "RespuestaListaParametricas", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarParametricaTiposFactura", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaTiposFactura")
    @ResponseWrapper(localName = "sincronizarParametricaTiposFacturaResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaTiposFacturaResponse")
    public RespuestaListaParametricas sincronizarParametricaTiposFactura(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaComunicacion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verificarComunicacion", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.VerificarComunicacion")
    @ResponseWrapper(localName = "verificarComunicacionResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.VerificarComunicacionResponse")
    public RespuestaComunicacion verificarComunicacion();

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaParametricas
     */
    @WebMethod
    @WebResult(name = "RespuestaListaParametricas", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarListaMensajesServicios", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarListaMensajesServicios")
    @ResponseWrapper(localName = "sincronizarListaMensajesServiciosResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarListaMensajesServiciosResponse")
    public RespuestaListaParametricas sincronizarListaMensajesServicios(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaParametricas
     */
    @WebMethod
    @WebResult(name = "RespuestaListaParametricas", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarParametricaTipoMetodoPago", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaTipoMetodoPago")
    @ResponseWrapper(localName = "sincronizarParametricaTipoMetodoPagoResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaTipoMetodoPagoResponse")
    public RespuestaListaParametricas sincronizarParametricaTipoMetodoPago(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaParametricas
     */
    @WebMethod
    @WebResult(name = "RespuestaListaParametricas", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarParametricaEventosSignificativos", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaEventosSignificativos")
    @ResponseWrapper(localName = "sincronizarParametricaEventosSignificativosResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaEventosSignificativosResponse")
    public RespuestaListaParametricas sincronizarParametricaEventosSignificativos(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaParametricas
     */
    @WebMethod
    @WebResult(name = "RespuestaListaParametricas", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarParametricaTipoPuntoVenta", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaTipoPuntoVenta")
    @ResponseWrapper(localName = "sincronizarParametricaTipoPuntoVentaResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaTipoPuntoVentaResponse")
    public RespuestaListaParametricas sincronizarParametricaTipoPuntoVenta(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaProductos
     */
    @WebMethod
    @WebResult(name = "RespuestaListaProductos", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarListaProductosServicios", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarListaProductosServicios")
    @ResponseWrapper(localName = "sincronizarListaProductosServiciosResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarListaProductosServiciosResponse")
    public RespuestaListaProductos sincronizarListaProductosServicios(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaParametricas
     */
    @WebMethod
    @WebResult(name = "RespuestaListaParametricas", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarParametricaTipoEmision", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaTipoEmision")
    @ResponseWrapper(localName = "sincronizarParametricaTipoEmisionResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaTipoEmisionResponse")
    public RespuestaListaParametricas sincronizarParametricaTipoEmision(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaParametricas
     */
    @WebMethod
    @WebResult(name = "RespuestaListaParametricas", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarParametricaPaisOrigen", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaPaisOrigen")
    @ResponseWrapper(localName = "sincronizarParametricaPaisOrigenResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaPaisOrigenResponse")
    public RespuestaListaParametricas sincronizarParametricaPaisOrigen(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

    /**
     * 
     * @param solicitudSincronizacion
     * @return
     *     returns bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaParametricas
     */
    @WebMethod
    @WebResult(name = "RespuestaListaParametricas", targetNamespace = "")
    @RequestWrapper(localName = "sincronizarParametricaTipoMoneda", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaTipoMoneda")
    @ResponseWrapper(localName = "sincronizarParametricaTipoMonedaResponse", targetNamespace = "https://siat.impuestos.gob.bo/", className = "bo.gob.impuestos.siat.api.facturacion.sincronizacion.SincronizarParametricaTipoMonedaResponse")
    public RespuestaListaParametricas sincronizarParametricaTipoMoneda(
        @WebParam(name = "SolicitudSincronizacion", targetNamespace = "")
        SolicitudSincronizacion solicitudSincronizacion);

}
