package bo.codexd.invoice.engine.api.exception;

import bo.codexd.invoice.engine.api.util.SiatExceptionUtil;
import lombok.Getter;
import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class BadRequestAlertException extends AbstractThrowableProblem {

    private final String entityName;

    private final String errorKey;

    private final List<SiatExceptionUtil.CodeMessage> siatErrors;

    public BadRequestAlertException(String title, String entityName, String errorKey) {
        super(DEFAULT_TYPE, title, Status.BAD_REQUEST, null, null, null, getAlertParameters(entityName, errorKey));
        this.entityName = entityName;
        this.errorKey = errorKey;
        this.siatErrors = null;
    }

    public BadRequestAlertException(String title, String entityName, String errorKey, List<SiatExceptionUtil.CodeMessage> siatErrors) {
        super(DEFAULT_TYPE, title, Status.BAD_REQUEST, null, null, null);
        this.entityName = entityName;
        this.errorKey = errorKey;
        this.siatErrors = siatErrors;
    }

    private static Map<String, Object> getAlertParameters(String entityName, String errorKey) {
        Map<String, Object> params = new HashMap<>();
        params.put("message", "error." + errorKey);
        params.put("params", entityName);
        return params;
    }
}
