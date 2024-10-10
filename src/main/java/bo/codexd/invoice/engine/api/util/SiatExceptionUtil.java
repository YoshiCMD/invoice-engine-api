package bo.codexd.invoice.engine.api.util;

import bo.codexd.invoice.engine.api.mapper.siat.data.synchonization.MessageMapper;
import bo.codexd.invoice.engine.api.mapper.siat.data.synchonization.MessageMapperImpl;
import bo.codexd.invoice.engine.api.service.data.synchronization.dto.MessageDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by yoshi on 15 October 2023
 */
public class SiatExceptionUtil implements Serializable {

    public static <T> List<CodeMessage> convertMessages(List<T> mensajesList) {
        return mensajesList.stream()
                .map(mensajeServicio -> new CodeMessage(getCode(mensajeServicio), getDescription(mensajeServicio)))
                .collect(Collectors.toList());
    }

    public static Integer getCode(Object object) {
        if (object instanceof bo.gob.impuestos.siat.api.facturacion.sincronizacion.MensajeServicio) {
            return ((bo.gob.impuestos.siat.api.facturacion.sincronizacion.MensajeServicio) object).getCodigo();
        } else if (object instanceof bo.gob.impuestos.siat.api.facturacion.codigos.MensajeServicio) {
            return ((bo.gob.impuestos.siat.api.facturacion.codigos.MensajeServicio) object).getCodigo();
        } else {
            return null;
        }
    }

    public static String getDescription(Object object) {
        if (object instanceof bo.gob.impuestos.siat.api.facturacion.sincronizacion.MensajeServicio) {
            return ((bo.gob.impuestos.siat.api.facturacion.sincronizacion.MensajeServicio) object).getDescripcion();
        } else if (object instanceof bo.gob.impuestos.siat.api.facturacion.codigos.MensajeServicio) {
            return ((bo.gob.impuestos.siat.api.facturacion.codigos.MensajeServicio) object).getDescripcion();
        } else {
            return null;
        }
    }

    public static Boolean getTransaction(Object object) {
        if (object instanceof bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaComunicacion) {
            return ((bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaComunicacion) object).isTransaccion();
        } else if (object instanceof bo.gob.impuestos.siat.api.facturacion.codigos.RespuestaComunicacion) {
            return ((bo.gob.impuestos.siat.api.facturacion.codigos.RespuestaComunicacion) object).isTransaccion();
        } else {
            return null;
        }
    }

    public static List<MessageDTO> getMessages(Object object) {
        MessageMapper messageMapper = new MessageMapperImpl();
        if (object instanceof bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaComunicacion) {
            return ((bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaComunicacion) object).getMensajesList().stream().map(messageMapper::toDto).collect(Collectors.toList());
        } else if (object instanceof bo.gob.impuestos.siat.api.facturacion.codigos.RespuestaComunicacion) {
            return ((bo.gob.impuestos.siat.api.facturacion.codigos.RespuestaComunicacion) object).getMensajesList().stream().map(messageMapper::toDto).collect(Collectors.toList());
        } else {
            return null;
        }
    }

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    public static class CodeMessage {
        private Integer code;

        private String message;
    }
}
