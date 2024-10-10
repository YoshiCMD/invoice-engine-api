
package bo.gob.impuestos.siat.api.servicio.facturacion.telecomunicaciones;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for solicitudAnulacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solicitudAnulacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://siat.impuestos.gob.bo/}solicitudRecepcion"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoMotivo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cuf" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudAnulacion", propOrder = {
    "codigoMotivo",
    "cuf"
})
public class SolicitudAnulacion
    extends SolicitudRecepcion
{

    protected int codigoMotivo;
    @XmlElement(required = true)
    protected String cuf;

    /**
     * Gets the value of the codigoMotivo property.
     * 
     */
    public int getCodigoMotivo() {
        return codigoMotivo;
    }

    /**
     * Sets the value of the codigoMotivo property.
     * 
     */
    public void setCodigoMotivo(int value) {
        this.codigoMotivo = value;
    }

    /**
     * Gets the value of the cuf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuf() {
        return cuf;
    }

    /**
     * Sets the value of the cuf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuf(String value) {
        this.cuf = value;
    }

}
