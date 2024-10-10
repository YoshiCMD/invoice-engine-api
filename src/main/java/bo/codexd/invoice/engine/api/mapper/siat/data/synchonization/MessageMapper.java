package bo.codexd.invoice.engine.api.mapper.siat.data.synchonization;


import bo.codexd.invoice.engine.api.service.data.synchronization.dto.MessageDTO;
import bo.codexd.invoice.engine.api.util.SiatExceptionUtil;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

/**
 * Created by yoshi on 19 October 2023
 */
@Mapper
public interface MessageMapper {

    MessageMapper INSTANCE = Mappers.getMapper(MessageMapper.class);

    @Mapping(source = "object", target = "code", qualifiedByName = "code")
    @Mapping(source = "object", target = "description", qualifiedByName = "description")
    MessageDTO toDto(Object object);

    @Named("code")
    default Integer getCode(Object object) {
        return SiatExceptionUtil.getCode(object);
    }

    @Named("description")
    default String getDescription(Object object) {
        return SiatExceptionUtil.getDescription(object);
    }
}
