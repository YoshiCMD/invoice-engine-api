
package bo.gob.impuestos.siat.api.facturacion.codigos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cufdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cufdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RespuestaCufd" type="{https://siat.impuestos.gob.bo/}respuestaCufd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cufdResponse", propOrder = {
    "respuestaCufd"
})
public class CufdResponse {

    @XmlElement(name = "RespuestaCufd")
    protected RespuestaCufd respuestaCufd;

    /**
     * Gets the value of the respuestaCufd property.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaCufd }
     *     
     */
    public RespuestaCufd getRespuestaCufd() {
        return respuestaCufd;
    }

    /**
     * Sets the value of the respuestaCufd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaCufd }
     *     
     */
    public void setRespuestaCufd(RespuestaCufd value) {
        this.respuestaCufd = value;
    }

}
