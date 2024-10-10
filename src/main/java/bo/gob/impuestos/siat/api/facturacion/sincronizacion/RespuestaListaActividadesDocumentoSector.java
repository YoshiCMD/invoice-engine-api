
package bo.gob.impuestos.siat.api.facturacion.sincronizacion;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for respuestaListaActividadesDocumentoSector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respuestaListaActividadesDocumentoSector"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://siat.impuestos.gob.bo/}respuestaConfiguracion"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaActividadesDocumentoSector" type="{https://siat.impuestos.gob.bo/}actividadesDocumentoSectorDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaListaActividadesDocumentoSector", propOrder = {
    "listaActividadesDocumentoSector"
})
public class RespuestaListaActividadesDocumentoSector
    extends RespuestaConfiguracion
{

    @XmlElement(nillable = true)
    protected List<ActividadesDocumentoSectorDto> listaActividadesDocumentoSector;

    /**
     * Gets the value of the listaActividadesDocumentoSector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the listaActividadesDocumentoSector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaActividadesDocumentoSector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActividadesDocumentoSectorDto }
     * 
     * 
     */
    public List<ActividadesDocumentoSectorDto> getListaActividadesDocumentoSector() {
        if (listaActividadesDocumentoSector == null) {
            listaActividadesDocumentoSector = new ArrayList<ActividadesDocumentoSectorDto>();
        }
        return this.listaActividadesDocumentoSector;
    }

}
