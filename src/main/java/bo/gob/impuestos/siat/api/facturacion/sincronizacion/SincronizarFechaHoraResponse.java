
package bo.gob.impuestos.siat.api.facturacion.sincronizacion;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sincronizarFechaHoraResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sincronizarFechaHoraResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RespuestaFechaHora" type="{https://siat.impuestos.gob.bo/}respuestaFechaHora" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sincronizarFechaHoraResponse", propOrder = {
    "respuestaFechaHora"
})
public class SincronizarFechaHoraResponse {

    @XmlElement(name = "RespuestaFechaHora")
    protected RespuestaFechaHora respuestaFechaHora;

    /**
     * Gets the value of the respuestaFechaHora property.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaFechaHora }
     *     
     */
    public RespuestaFechaHora getRespuestaFechaHora() {
        return respuestaFechaHora;
    }

    /**
     * Sets the value of the respuestaFechaHora property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaFechaHora }
     *     
     */
    public void setRespuestaFechaHora(RespuestaFechaHora value) {
        this.respuestaFechaHora = value;
    }

}
