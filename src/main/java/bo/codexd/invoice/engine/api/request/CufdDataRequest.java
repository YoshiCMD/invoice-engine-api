package bo.codexd.invoice.engine.api.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by yoshi on 17 November 2023
 */
@Data
public class CufdDataRequest {

    @NotNull
    private Integer branchCode;

    private Integer pointOfSaleCode;

    private String cuis;

}
