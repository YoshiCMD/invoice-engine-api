package bo.codexd.invoice.engine.api.exception;

import java.util.List;

import static bo.codexd.invoice.engine.api.util.SiatExceptionUtil.convertMessages;

/**
 * Created by yoshi on 12 October 2023
 */
public class SiatException extends BadRequestAlertException {

    public static final String entityName = "SIAT";

    public SiatException(String detail) {
        super(detail, entityName, "siat.default");
    }

    public SiatException(String detail, String errorKey) {
        super(detail, entityName, "siat." + errorKey);
    }

    public <T> SiatException(String detail, String errorKey, List<T> mensajesList) {
        super(detail, entityName, "siat." + errorKey, convertMessages(mensajesList));
    }

}
