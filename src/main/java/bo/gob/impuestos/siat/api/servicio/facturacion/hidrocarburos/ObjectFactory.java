
package bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnulacionFactura_QNAME = new QName("https://siat.impuestos.gob.bo/", "anulacionFactura");
    private final static QName _AnulacionFacturaResponse_QNAME = new QName("https://siat.impuestos.gob.bo/", "anulacionFacturaResponse");
    private final static QName _RecepcionFactura_QNAME = new QName("https://siat.impuestos.gob.bo/", "recepcionFactura");
    private final static QName _RecepcionFacturaResponse_QNAME = new QName("https://siat.impuestos.gob.bo/", "recepcionFacturaResponse");
    private final static QName _RecepcionMasivaContratosYPFB_QNAME = new QName("https://siat.impuestos.gob.bo/", "recepcionMasivaContratosYPFB");
    private final static QName _RecepcionMasivaContratosYPFBResponse_QNAME = new QName("https://siat.impuestos.gob.bo/", "recepcionMasivaContratosYPFBResponse");
    private final static QName _RecepcionMasivaFactura_QNAME = new QName("https://siat.impuestos.gob.bo/", "recepcionMasivaFactura");
    private final static QName _RecepcionMasivaFacturaResponse_QNAME = new QName("https://siat.impuestos.gob.bo/", "recepcionMasivaFacturaResponse");
    private final static QName _RecepcionPaqueteFactura_QNAME = new QName("https://siat.impuestos.gob.bo/", "recepcionPaqueteFactura");
    private final static QName _RecepcionPaqueteFacturaResponse_QNAME = new QName("https://siat.impuestos.gob.bo/", "recepcionPaqueteFacturaResponse");
    private final static QName _ReversionAnulacionFactura_QNAME = new QName("https://siat.impuestos.gob.bo/", "reversionAnulacionFactura");
    private final static QName _ReversionAnulacionFacturaResponse_QNAME = new QName("https://siat.impuestos.gob.bo/", "reversionAnulacionFacturaResponse");
    private final static QName _ValidacionRecepcionMasivaFactura_QNAME = new QName("https://siat.impuestos.gob.bo/", "validacionRecepcionMasivaFactura");
    private final static QName _ValidacionRecepcionMasivaFacturaResponse_QNAME = new QName("https://siat.impuestos.gob.bo/", "validacionRecepcionMasivaFacturaResponse");
    private final static QName _ValidacionRecepcionMasivaFacturaYPFB_QNAME = new QName("https://siat.impuestos.gob.bo/", "validacionRecepcionMasivaFacturaYPFB");
    private final static QName _ValidacionRecepcionMasivaFacturaYPFBResponse_QNAME = new QName("https://siat.impuestos.gob.bo/", "validacionRecepcionMasivaFacturaYPFBResponse");
    private final static QName _ValidacionRecepcionPaqueteFactura_QNAME = new QName("https://siat.impuestos.gob.bo/", "validacionRecepcionPaqueteFactura");
    private final static QName _ValidacionRecepcionPaqueteFacturaResponse_QNAME = new QName("https://siat.impuestos.gob.bo/", "validacionRecepcionPaqueteFacturaResponse");
    private final static QName _VerificacionEstadoFactura_QNAME = new QName("https://siat.impuestos.gob.bo/", "verificacionEstadoFactura");
    private final static QName _VerificacionEstadoFacturaResponse_QNAME = new QName("https://siat.impuestos.gob.bo/", "verificacionEstadoFacturaResponse");
    private final static QName _VerificarComunicacion_QNAME = new QName("https://siat.impuestos.gob.bo/", "verificarComunicacion");
    private final static QName _VerificarComunicacionResponse_QNAME = new QName("https://siat.impuestos.gob.bo/", "verificarComunicacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bo.gob.impuestos.siat.api.servicio.facturacion.hidrocarburos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnulacionFactura }
     * 
     */
    public AnulacionFactura createAnulacionFactura() {
        return new AnulacionFactura();
    }

    /**
     * Create an instance of {@link AnulacionFacturaResponse }
     * 
     */
    public AnulacionFacturaResponse createAnulacionFacturaResponse() {
        return new AnulacionFacturaResponse();
    }

    /**
     * Create an instance of {@link RecepcionFactura }
     * 
     */
    public RecepcionFactura createRecepcionFactura() {
        return new RecepcionFactura();
    }

    /**
     * Create an instance of {@link RecepcionFacturaResponse }
     * 
     */
    public RecepcionFacturaResponse createRecepcionFacturaResponse() {
        return new RecepcionFacturaResponse();
    }

    /**
     * Create an instance of {@link RecepcionMasivaContratosYPFB }
     * 
     */
    public RecepcionMasivaContratosYPFB createRecepcionMasivaContratosYPFB() {
        return new RecepcionMasivaContratosYPFB();
    }

    /**
     * Create an instance of {@link RecepcionMasivaContratosYPFBResponse }
     * 
     */
    public RecepcionMasivaContratosYPFBResponse createRecepcionMasivaContratosYPFBResponse() {
        return new RecepcionMasivaContratosYPFBResponse();
    }

    /**
     * Create an instance of {@link RecepcionMasivaFactura }
     * 
     */
    public RecepcionMasivaFactura createRecepcionMasivaFactura() {
        return new RecepcionMasivaFactura();
    }

    /**
     * Create an instance of {@link RecepcionMasivaFacturaResponse }
     * 
     */
    public RecepcionMasivaFacturaResponse createRecepcionMasivaFacturaResponse() {
        return new RecepcionMasivaFacturaResponse();
    }

    /**
     * Create an instance of {@link RecepcionPaqueteFactura }
     * 
     */
    public RecepcionPaqueteFactura createRecepcionPaqueteFactura() {
        return new RecepcionPaqueteFactura();
    }

    /**
     * Create an instance of {@link RecepcionPaqueteFacturaResponse }
     * 
     */
    public RecepcionPaqueteFacturaResponse createRecepcionPaqueteFacturaResponse() {
        return new RecepcionPaqueteFacturaResponse();
    }

    /**
     * Create an instance of {@link ReversionAnulacionFactura }
     * 
     */
    public ReversionAnulacionFactura createReversionAnulacionFactura() {
        return new ReversionAnulacionFactura();
    }

    /**
     * Create an instance of {@link ReversionAnulacionFacturaResponse }
     * 
     */
    public ReversionAnulacionFacturaResponse createReversionAnulacionFacturaResponse() {
        return new ReversionAnulacionFacturaResponse();
    }

    /**
     * Create an instance of {@link ValidacionRecepcionMasivaFactura }
     * 
     */
    public ValidacionRecepcionMasivaFactura createValidacionRecepcionMasivaFactura() {
        return new ValidacionRecepcionMasivaFactura();
    }

    /**
     * Create an instance of {@link ValidacionRecepcionMasivaFacturaResponse }
     * 
     */
    public ValidacionRecepcionMasivaFacturaResponse createValidacionRecepcionMasivaFacturaResponse() {
        return new ValidacionRecepcionMasivaFacturaResponse();
    }

    /**
     * Create an instance of {@link ValidacionRecepcionMasivaFacturaYPFB }
     * 
     */
    public ValidacionRecepcionMasivaFacturaYPFB createValidacionRecepcionMasivaFacturaYPFB() {
        return new ValidacionRecepcionMasivaFacturaYPFB();
    }

    /**
     * Create an instance of {@link ValidacionRecepcionMasivaFacturaYPFBResponse }
     * 
     */
    public ValidacionRecepcionMasivaFacturaYPFBResponse createValidacionRecepcionMasivaFacturaYPFBResponse() {
        return new ValidacionRecepcionMasivaFacturaYPFBResponse();
    }

    /**
     * Create an instance of {@link ValidacionRecepcionPaqueteFactura }
     * 
     */
    public ValidacionRecepcionPaqueteFactura createValidacionRecepcionPaqueteFactura() {
        return new ValidacionRecepcionPaqueteFactura();
    }

    /**
     * Create an instance of {@link ValidacionRecepcionPaqueteFacturaResponse }
     * 
     */
    public ValidacionRecepcionPaqueteFacturaResponse createValidacionRecepcionPaqueteFacturaResponse() {
        return new ValidacionRecepcionPaqueteFacturaResponse();
    }

    /**
     * Create an instance of {@link VerificacionEstadoFactura }
     * 
     */
    public VerificacionEstadoFactura createVerificacionEstadoFactura() {
        return new VerificacionEstadoFactura();
    }

    /**
     * Create an instance of {@link VerificacionEstadoFacturaResponse }
     * 
     */
    public VerificacionEstadoFacturaResponse createVerificacionEstadoFacturaResponse() {
        return new VerificacionEstadoFacturaResponse();
    }

    /**
     * Create an instance of {@link VerificarComunicacion }
     * 
     */
    public VerificarComunicacion createVerificarComunicacion() {
        return new VerificarComunicacion();
    }

    /**
     * Create an instance of {@link VerificarComunicacionResponse }
     * 
     */
    public VerificarComunicacionResponse createVerificarComunicacionResponse() {
        return new VerificarComunicacionResponse();
    }

    /**
     * Create an instance of {@link SolicitudRecepcionPaquete }
     * 
     */
    public SolicitudRecepcionPaquete createSolicitudRecepcionPaquete() {
        return new SolicitudRecepcionPaquete();
    }

    /**
     * Create an instance of {@link SolicitudRecepcionFactura }
     * 
     */
    public SolicitudRecepcionFactura createSolicitudRecepcionFactura() {
        return new SolicitudRecepcionFactura();
    }

    /**
     * Create an instance of {@link SolicitudRecepcion }
     * 
     */
    public SolicitudRecepcion createSolicitudRecepcion() {
        return new SolicitudRecepcion();
    }

    /**
     * Create an instance of {@link RespuestaRecepcion }
     * 
     */
    public RespuestaRecepcion createRespuestaRecepcion() {
        return new RespuestaRecepcion();
    }

    /**
     * Create an instance of {@link MensajeRecepcion }
     * 
     */
    public MensajeRecepcion createMensajeRecepcion() {
        return new MensajeRecepcion();
    }

    /**
     * Create an instance of {@link MensajeServicio }
     * 
     */
    public MensajeServicio createMensajeServicio() {
        return new MensajeServicio();
    }

    /**
     * Create an instance of {@link RespuestaComunicacion }
     * 
     */
    public RespuestaComunicacion createRespuestaComunicacion() {
        return new RespuestaComunicacion();
    }

    /**
     * Create an instance of {@link SolicitudValidacionRecepcion }
     * 
     */
    public SolicitudValidacionRecepcion createSolicitudValidacionRecepcion() {
        return new SolicitudValidacionRecepcion();
    }

    /**
     * Create an instance of {@link SolicitudReversionAnulacion }
     * 
     */
    public SolicitudReversionAnulacion createSolicitudReversionAnulacion() {
        return new SolicitudReversionAnulacion();
    }

    /**
     * Create an instance of {@link SolicitudRecepcionMasiva }
     * 
     */
    public SolicitudRecepcionMasiva createSolicitudRecepcionMasiva() {
        return new SolicitudRecepcionMasiva();
    }

    /**
     * Create an instance of {@link SolicitudVerificacionEstado }
     * 
     */
    public SolicitudVerificacionEstado createSolicitudVerificacionEstado() {
        return new SolicitudVerificacionEstado();
    }

    /**
     * Create an instance of {@link SolicitudAnulacion }
     * 
     */
    public SolicitudAnulacion createSolicitudAnulacion() {
        return new SolicitudAnulacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnulacionFactura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnulacionFactura }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "anulacionFactura")
    public JAXBElement<AnulacionFactura> createAnulacionFactura(AnulacionFactura value) {
        return new JAXBElement<AnulacionFactura>(_AnulacionFactura_QNAME, AnulacionFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnulacionFacturaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnulacionFacturaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "anulacionFacturaResponse")
    public JAXBElement<AnulacionFacturaResponse> createAnulacionFacturaResponse(AnulacionFacturaResponse value) {
        return new JAXBElement<AnulacionFacturaResponse>(_AnulacionFacturaResponse_QNAME, AnulacionFacturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcionFactura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecepcionFactura }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "recepcionFactura")
    public JAXBElement<RecepcionFactura> createRecepcionFactura(RecepcionFactura value) {
        return new JAXBElement<RecepcionFactura>(_RecepcionFactura_QNAME, RecepcionFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcionFacturaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecepcionFacturaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "recepcionFacturaResponse")
    public JAXBElement<RecepcionFacturaResponse> createRecepcionFacturaResponse(RecepcionFacturaResponse value) {
        return new JAXBElement<RecepcionFacturaResponse>(_RecepcionFacturaResponse_QNAME, RecepcionFacturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcionMasivaContratosYPFB }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecepcionMasivaContratosYPFB }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "recepcionMasivaContratosYPFB")
    public JAXBElement<RecepcionMasivaContratosYPFB> createRecepcionMasivaContratosYPFB(RecepcionMasivaContratosYPFB value) {
        return new JAXBElement<RecepcionMasivaContratosYPFB>(_RecepcionMasivaContratosYPFB_QNAME, RecepcionMasivaContratosYPFB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcionMasivaContratosYPFBResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecepcionMasivaContratosYPFBResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "recepcionMasivaContratosYPFBResponse")
    public JAXBElement<RecepcionMasivaContratosYPFBResponse> createRecepcionMasivaContratosYPFBResponse(RecepcionMasivaContratosYPFBResponse value) {
        return new JAXBElement<RecepcionMasivaContratosYPFBResponse>(_RecepcionMasivaContratosYPFBResponse_QNAME, RecepcionMasivaContratosYPFBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcionMasivaFactura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecepcionMasivaFactura }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "recepcionMasivaFactura")
    public JAXBElement<RecepcionMasivaFactura> createRecepcionMasivaFactura(RecepcionMasivaFactura value) {
        return new JAXBElement<RecepcionMasivaFactura>(_RecepcionMasivaFactura_QNAME, RecepcionMasivaFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcionMasivaFacturaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecepcionMasivaFacturaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "recepcionMasivaFacturaResponse")
    public JAXBElement<RecepcionMasivaFacturaResponse> createRecepcionMasivaFacturaResponse(RecepcionMasivaFacturaResponse value) {
        return new JAXBElement<RecepcionMasivaFacturaResponse>(_RecepcionMasivaFacturaResponse_QNAME, RecepcionMasivaFacturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcionPaqueteFactura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecepcionPaqueteFactura }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "recepcionPaqueteFactura")
    public JAXBElement<RecepcionPaqueteFactura> createRecepcionPaqueteFactura(RecepcionPaqueteFactura value) {
        return new JAXBElement<RecepcionPaqueteFactura>(_RecepcionPaqueteFactura_QNAME, RecepcionPaqueteFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcionPaqueteFacturaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecepcionPaqueteFacturaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "recepcionPaqueteFacturaResponse")
    public JAXBElement<RecepcionPaqueteFacturaResponse> createRecepcionPaqueteFacturaResponse(RecepcionPaqueteFacturaResponse value) {
        return new JAXBElement<RecepcionPaqueteFacturaResponse>(_RecepcionPaqueteFacturaResponse_QNAME, RecepcionPaqueteFacturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReversionAnulacionFactura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReversionAnulacionFactura }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "reversionAnulacionFactura")
    public JAXBElement<ReversionAnulacionFactura> createReversionAnulacionFactura(ReversionAnulacionFactura value) {
        return new JAXBElement<ReversionAnulacionFactura>(_ReversionAnulacionFactura_QNAME, ReversionAnulacionFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReversionAnulacionFacturaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReversionAnulacionFacturaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "reversionAnulacionFacturaResponse")
    public JAXBElement<ReversionAnulacionFacturaResponse> createReversionAnulacionFacturaResponse(ReversionAnulacionFacturaResponse value) {
        return new JAXBElement<ReversionAnulacionFacturaResponse>(_ReversionAnulacionFacturaResponse_QNAME, ReversionAnulacionFacturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidacionRecepcionMasivaFactura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidacionRecepcionMasivaFactura }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "validacionRecepcionMasivaFactura")
    public JAXBElement<ValidacionRecepcionMasivaFactura> createValidacionRecepcionMasivaFactura(ValidacionRecepcionMasivaFactura value) {
        return new JAXBElement<ValidacionRecepcionMasivaFactura>(_ValidacionRecepcionMasivaFactura_QNAME, ValidacionRecepcionMasivaFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidacionRecepcionMasivaFacturaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidacionRecepcionMasivaFacturaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "validacionRecepcionMasivaFacturaResponse")
    public JAXBElement<ValidacionRecepcionMasivaFacturaResponse> createValidacionRecepcionMasivaFacturaResponse(ValidacionRecepcionMasivaFacturaResponse value) {
        return new JAXBElement<ValidacionRecepcionMasivaFacturaResponse>(_ValidacionRecepcionMasivaFacturaResponse_QNAME, ValidacionRecepcionMasivaFacturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidacionRecepcionMasivaFacturaYPFB }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidacionRecepcionMasivaFacturaYPFB }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "validacionRecepcionMasivaFacturaYPFB")
    public JAXBElement<ValidacionRecepcionMasivaFacturaYPFB> createValidacionRecepcionMasivaFacturaYPFB(ValidacionRecepcionMasivaFacturaYPFB value) {
        return new JAXBElement<ValidacionRecepcionMasivaFacturaYPFB>(_ValidacionRecepcionMasivaFacturaYPFB_QNAME, ValidacionRecepcionMasivaFacturaYPFB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidacionRecepcionMasivaFacturaYPFBResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidacionRecepcionMasivaFacturaYPFBResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "validacionRecepcionMasivaFacturaYPFBResponse")
    public JAXBElement<ValidacionRecepcionMasivaFacturaYPFBResponse> createValidacionRecepcionMasivaFacturaYPFBResponse(ValidacionRecepcionMasivaFacturaYPFBResponse value) {
        return new JAXBElement<ValidacionRecepcionMasivaFacturaYPFBResponse>(_ValidacionRecepcionMasivaFacturaYPFBResponse_QNAME, ValidacionRecepcionMasivaFacturaYPFBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidacionRecepcionPaqueteFactura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidacionRecepcionPaqueteFactura }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "validacionRecepcionPaqueteFactura")
    public JAXBElement<ValidacionRecepcionPaqueteFactura> createValidacionRecepcionPaqueteFactura(ValidacionRecepcionPaqueteFactura value) {
        return new JAXBElement<ValidacionRecepcionPaqueteFactura>(_ValidacionRecepcionPaqueteFactura_QNAME, ValidacionRecepcionPaqueteFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidacionRecepcionPaqueteFacturaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidacionRecepcionPaqueteFacturaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "validacionRecepcionPaqueteFacturaResponse")
    public JAXBElement<ValidacionRecepcionPaqueteFacturaResponse> createValidacionRecepcionPaqueteFacturaResponse(ValidacionRecepcionPaqueteFacturaResponse value) {
        return new JAXBElement<ValidacionRecepcionPaqueteFacturaResponse>(_ValidacionRecepcionPaqueteFacturaResponse_QNAME, ValidacionRecepcionPaqueteFacturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificacionEstadoFactura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificacionEstadoFactura }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "verificacionEstadoFactura")
    public JAXBElement<VerificacionEstadoFactura> createVerificacionEstadoFactura(VerificacionEstadoFactura value) {
        return new JAXBElement<VerificacionEstadoFactura>(_VerificacionEstadoFactura_QNAME, VerificacionEstadoFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificacionEstadoFacturaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificacionEstadoFacturaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "verificacionEstadoFacturaResponse")
    public JAXBElement<VerificacionEstadoFacturaResponse> createVerificacionEstadoFacturaResponse(VerificacionEstadoFacturaResponse value) {
        return new JAXBElement<VerificacionEstadoFacturaResponse>(_VerificacionEstadoFacturaResponse_QNAME, VerificacionEstadoFacturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarComunicacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificarComunicacion }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "verificarComunicacion")
    public JAXBElement<VerificarComunicacion> createVerificarComunicacion(VerificarComunicacion value) {
        return new JAXBElement<VerificarComunicacion>(_VerificarComunicacion_QNAME, VerificarComunicacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarComunicacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificarComunicacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://siat.impuestos.gob.bo/", name = "verificarComunicacionResponse")
    public JAXBElement<VerificarComunicacionResponse> createVerificarComunicacionResponse(VerificarComunicacionResponse value) {
        return new JAXBElement<VerificarComunicacionResponse>(_VerificarComunicacionResponse_QNAME, VerificarComunicacionResponse.class, null, value);
    }

}
