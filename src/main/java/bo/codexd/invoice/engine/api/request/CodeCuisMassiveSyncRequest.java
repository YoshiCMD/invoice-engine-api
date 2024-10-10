package bo.codexd.invoice.engine.api.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by yoshi on 19 October 2023
 */
@Data
public class CodeCuisMassiveSyncRequest {

    @NotNull
    private String systemCode;

    @NotNull
    private Long nit;

    private List<CufdDataRequest> cuisData;

}
