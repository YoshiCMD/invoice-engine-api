package bo.codexd.invoice.engine.api.exception;

import lombok.Getter;
import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

import java.util.HashMap;
import java.util.Map;

@Getter
public class UnauthorizedAlertException extends AbstractThrowableProblem {

    private final String entityName;

    private final String errorKey;

    public UnauthorizedAlertException(String title, String entityName, String errorKey) {
        super(DEFAULT_TYPE, title, Status.UNAUTHORIZED, null, null, null, getAlertParameters(entityName, errorKey));
        this.entityName = entityName;
        this.errorKey = errorKey;
    }

    private static Map<String, Object> getAlertParameters(String entityName, String errorKey) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("message", "error." + errorKey);
        parameters.put("params", entityName);
        return parameters;
    }
}
