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
public class CufdMassiveDTO {

    private Integer branchCode;

    private Integer pointOfSaleCode;

    private String cuis;

    private String code;

    private String controlCode;

    private String address;

    private ZonedDateTime limitDate;

    private List<MessageDTO> messages;

    private boolean transaction;

}
