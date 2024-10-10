package bo.codexd.invoice.engine.api.exception;

/**
 * Created by yoshi on 12 October 2023
 */
public class SiatAuthorizationException extends UnauthorizedAlertException {

    public static final String entityName = "SIAT";

    public SiatAuthorizationException(String detail) {
        super(detail, entityName, "siat.default");
    }

    public SiatAuthorizationException(String detail, String errorKey) {
        super(detail, entityName, "siat." + errorKey);
    }

}
