package bo.codexd.invoice.engine.api.service.code.dto;

import bo.codexd.invoice.engine.api.service.data.synchronization.dto.MessageDTO;
import lombok.Getter;
import lombok.Setter;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

/**
 * Created by yoshi on 19 October 2023
 */
@Getter
@Setter
public class CuisDTO {

    private String code;

    private XMLGregorianCalendar limitDate;

    private List<MessageDTO> messages;

    private boolean transaction;

}
