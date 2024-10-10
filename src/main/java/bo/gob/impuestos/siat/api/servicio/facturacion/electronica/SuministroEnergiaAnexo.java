
package bo.gob.impuestos.siat.api.servicio.facturacion.electronica;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for suministroEnergiaAnexo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="suministroEnergiaAnexo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://siat.impuestos.gob.bo/}modelDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cufFactSuministro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaRecarga" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="montoRecarga" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suministroEnergiaAnexo", propOrder = {
    "cufFactSuministro",
    "fechaRecarga",
    "montoRecarga"
})
public class SuministroEnergiaAnexo
    extends ModelDto
{

    @XmlElement(required = true)
    protected String cufFactSuministro;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRecarga;
    @XmlElement(required = true)
    protected BigDecimal montoRecarga;

    /**
     * Gets the value of the cufFactSuministro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCufFactSuministro() {
        return cufFactSuministro;
    }

    /**
     * Sets the value of the cufFactSuministro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCufFactSuministro(String value) {
        this.cufFactSuministro = value;
    }

    /**
     * Gets the value of the fechaRecarga property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRecarga() {
        return fechaRecarga;
    }

    /**
     * Sets the value of the fechaRecarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRecarga(XMLGregorianCalendar value) {
        this.fechaRecarga = value;
    }

    /**
     * Gets the value of the montoRecarga property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoRecarga() {
        return montoRecarga;
    }

    /**
     * Sets the value of the montoRecarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoRecarga(BigDecimal value) {
        this.montoRecarga = value;
    }

}
