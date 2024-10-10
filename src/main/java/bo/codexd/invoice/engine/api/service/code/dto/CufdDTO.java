package bo.codexd.invoice.engine.api.service.code.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

/**
 * Created by yoshi on 19 October 2023
 */
@Getter
@Setter
public class CufdDTO {

    private String code;

    private String controlCode;

    private String address;

    private ZonedDateTime limitDate;

}
