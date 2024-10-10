package bo.codexd.invoice.engine.api.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by yoshi on 17 November 2023
 */
@Data
public class CuisDataRequest {

    @NotNull
    private Integer branchCode;

    private Integer pointOfSaleCode;

}
