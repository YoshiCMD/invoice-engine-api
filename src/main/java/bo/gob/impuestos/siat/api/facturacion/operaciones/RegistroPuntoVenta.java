
package bo.gob.impuestos.siat.api.facturacion.operaciones;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registroPuntoVenta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registroPuntoVenta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SolicitudRegistroPuntoVenta" type="{https://siat.impuestos.gob.bo/}solicitudRegistroPuntoVenta"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registroPuntoVenta", propOrder = {
    "solicitudRegistroPuntoVenta"
})
public class RegistroPuntoVenta {

    @XmlElement(name = "SolicitudRegistroPuntoVenta", required = true)
    protected SolicitudRegistroPuntoVenta solicitudRegistroPuntoVenta;

    /**
     * Gets the value of the solicitudRegistroPuntoVenta property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitudRegistroPuntoVenta }
     *     
     */
    public SolicitudRegistroPuntoVenta getSolicitudRegistroPuntoVenta() {
        return solicitudRegistroPuntoVenta;
    }

    /**
     * Sets the value of the solicitudRegistroPuntoVenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitudRegistroPuntoVenta }
     *     
     */
    public void setSolicitudRegistroPuntoVenta(SolicitudRegistroPuntoVenta value) {
        this.solicitudRegistroPuntoVenta = value;
    }

}
