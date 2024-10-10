package bo.codexd.invoice.engine.api.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by yoshi on 19 October 2023
 */
@Data
public class CodeSyncRequest {

    @NotNull
    private String systemCode;

    @NotNull
    private Integer branchCode;

    private Integer pointOfSaleCode;

    @NotNull
    private Long nit;

}
