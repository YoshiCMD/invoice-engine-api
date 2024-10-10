
package bo.gob.impuestos.siat.api.servicio.facturacion.electronica;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for solicitudRecepcionAnexosSuministroEnergia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solicitudRecepcionAnexosSuministroEnergia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://siat.impuestos.gob.bo/}solicitudRecepcion"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anexosList" type="{https://siat.impuestos.gob.bo/}suministroEnergiaAnexo" maxOccurs="unbounded"/&gt;
 *         &lt;element name="giftCard" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudRecepcionAnexosSuministroEnergia", propOrder = {
    "anexosList",
    "giftCard"
})
public class SolicitudRecepcionAnexosSuministroEnergia
    extends SolicitudRecepcion
{

    @XmlElement(required = true)
    protected List<SuministroEnergiaAnexo> anexosList;
    protected long giftCard;

    /**
     * Gets the value of the anexosList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the anexosList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnexosList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuministroEnergiaAnexo }
     * 
     * 
     */
    public List<SuministroEnergiaAnexo> getAnexosList() {
        if (anexosList == null) {
            anexosList = new ArrayList<SuministroEnergiaAnexo>();
        }
        return this.anexosList;
    }

    /**
     * Gets the value of the giftCard property.
     * 
     */
    public long getGiftCard() {
        return giftCard;
    }

    /**
     * Sets the value of the giftCard property.
     * 
     */
    public void setGiftCard(long value) {
        this.giftCard = value;
    }

}
