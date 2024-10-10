package bo.codexd.invoice.engine.api.mapper.siat.data.synchonization;

import bo.codexd.invoice.engine.api.service.data.synchronization.dto.CommunicationDTO;
import bo.codexd.invoice.engine.api.service.data.synchronization.dto.MessageDTO;
import bo.codexd.invoice.engine.api.util.SiatExceptionUtil;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by yoshi on 19 October 2023
 */
@Mapper
public interface CommunicationMapper {

    CommunicationMapper INSTANCE = Mappers.getMapper(CommunicationMapper.class);

    @Mapping(source = "object", target = "transaction", qualifiedByName = "transaction")
    @Mapping(source = "object", target = "messages", qualifiedByName = "messages")
    CommunicationDTO toDto(Object object);

    @Named("transaction")
    default Boolean getTransaction(Object object) {
        return SiatExceptionUtil.getTransaction(object);
    }

    @Named("messages")
    default List<MessageDTO> getMessages(Object object) {
        return SiatExceptionUtil.getMessages(object);
    }

}
