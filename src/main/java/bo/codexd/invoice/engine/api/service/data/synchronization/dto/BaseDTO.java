package bo.codexd.invoice.engine.api.service.data.synchronization.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by yoshi on 19 October 2023
 */
@Getter
@Setter
public class BaseDTO {

    private Boolean transaction;

    private List<MessageDTO> messages;

}
