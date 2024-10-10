package bo.codexd.invoice.engine.api.service.code.dto;

import bo.codexd.invoice.engine.api.service.data.synchronization.dto.MessageDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * Created by yoshi on 19 October 2023
 */
@Getter
@Setter
public class CuisMassiveDTO {

    private Integer branchCode;

    private Integer pointOfSaleCode;

    private String code;

    private ZonedDateTime limitDate;

    private List<MessageDTO> messages;

    private boolean transaction;

}
