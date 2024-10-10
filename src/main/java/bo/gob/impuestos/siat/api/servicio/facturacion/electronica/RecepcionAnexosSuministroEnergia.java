
package bo.gob.impuestos.siat.api.servicio.facturacion.electronica;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recepcionAnexosSuministroEnergia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recepcionAnexosSuministroEnergia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SolicitudRecepcionSuministroAnexos" type="{https://siat.impuestos.gob.bo/}solicitudRecepcionAnexosSuministroEnergia"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recepcionAnexosSuministroEnergia", propOrder = {
    "solicitudRecepcionSuministroAnexos"
})
public class RecepcionAnexosSuministroEnergia {

    @XmlElement(name = "SolicitudRecepcionSuministroAnexos", required = true)
    protected SolicitudRecepcionAnexosSuministroEnergia solicitudRecepcionSuministroAnexos;

    /**
     * Gets the value of the solicitudRecepcionSuministroAnexos property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitudRecepcionAnexosSuministroEnergia }
     *     
     */
    public SolicitudRecepcionAnexosSuministroEnergia getSolicitudRecepcionSuministroAnexos() {
        return solicitudRecepcionSuministroAnexos;
    }

    /**
     * Sets the value of the solicitudRecepcionSuministroAnexos property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitudRecepcionAnexosSuministroEnergia }
     *     
     */
    public void setSolicitudRecepcionSuministroAnexos(SolicitudRecepcionAnexosSuministroEnergia value) {
        this.solicitudRecepcionSuministroAnexos = value;
    }

}
