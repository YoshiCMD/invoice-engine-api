
package bo.gob.impuestos.siat.api.facturacion.sincronizacion;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sincronizarParametricaEventosSignificativos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sincronizarParametricaEventosSignificativos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SolicitudSincronizacion" type="{https://siat.impuestos.gob.bo/}solicitudSincronizacion"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sincronizarParametricaEventosSignificativos", propOrder = {
    "solicitudSincronizacion"
})
public class SincronizarParametricaEventosSignificativos {

    @XmlElement(name = "SolicitudSincronizacion", required = true)
    protected SolicitudSincronizacion solicitudSincronizacion;

    /**
     * Gets the value of the solicitudSincronizacion property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitudSincronizacion }
     *     
     */
    public SolicitudSincronizacion getSolicitudSincronizacion() {
        return solicitudSincronizacion;
    }

    /**
     * Sets the value of the solicitudSincronizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitudSincronizacion }
     *     
     */
    public void setSolicitudSincronizacion(SolicitudSincronizacion value) {
        this.solicitudSincronizacion = value;
    }

}
