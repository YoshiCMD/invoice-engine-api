
package bo.gob.impuestos.siat.api.facturacion.codigos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verificarComunicacionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verificarComunicacionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RespuestaComunicacion" type="{https://siat.impuestos.gob.bo/}respuestaComunicacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificarComunicacionResponse", propOrder = {
    "respuestaComunicacion"
})
public class VerificarComunicacionResponse {

    @XmlElement(name = "RespuestaComunicacion")
    protected RespuestaComunicacion respuestaComunicacion;

    /**
     * Gets the value of the respuestaComunicacion property.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaComunicacion }
     *     
     */
    public RespuestaComunicacion getRespuestaComunicacion() {
        return respuestaComunicacion;
    }

    /**
     * Sets the value of the respuestaComunicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaComunicacion }
     *     
     */
    public void setRespuestaComunicacion(RespuestaComunicacion value) {
        this.respuestaComunicacion = value;
    }

}
