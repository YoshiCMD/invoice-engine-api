package bo.codexd.invoice.engine.api.util;

import bo.gob.impuestos.siat.api.facturacion.sincronizacion.ObjectFactory;
import jakarta.xml.bind.JAXBElement;


/**
 * Created by yoshi on 20 October 2023
 */
public class ObjectFactoryUtil {
    public static JAXBElement<Integer> convert(Integer value, Integer defaultValue) {
        ObjectFactory objectFactory = new ObjectFactory();
        return objectFactory.createSolicitudSincronizacionCodigoPuntoVenta(value != null ? value : defaultValue);
    }

    public static JAXBElement<Integer> convert(Integer value) {
        return convert(value, 0);
    }
}
