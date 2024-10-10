
package bo.gob.impuestos.siat.api.servicio.recepcion.compras;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaComprasResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaComprasResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RespuestaServicioFacturacion" type="{https://siat.impuestos.gob.bo/}respuestaConsultaCompras" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaComprasResponse", propOrder = {
    "respuestaServicioFacturacion"
})
public class ConsultaComprasResponse {

    @XmlElement(name = "RespuestaServicioFacturacion")
    protected RespuestaConsultaCompras respuestaServicioFacturacion;

    /**
     * Gets the value of the respuestaServicioFacturacion property.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaConsultaCompras }
     *     
     */
    public RespuestaConsultaCompras getRespuestaServicioFacturacion() {
        return respuestaServicioFacturacion;
    }

    /**
     * Sets the value of the respuestaServicioFacturacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaConsultaCompras }
     *     
     */
    public void setRespuestaServicioFacturacion(RespuestaConsultaCompras value) {
        this.respuestaServicioFacturacion = value;
    }

}
