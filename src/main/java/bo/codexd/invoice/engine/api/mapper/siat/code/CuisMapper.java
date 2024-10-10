package bo.codexd.invoice.engine.api.mapper.siat.code;

import bo.codexd.invoice.engine.api.mapper.EntityMapper;
import bo.codexd.invoice.engine.api.mapper.siat.data.synchonization.MessageMapper;
import bo.codexd.invoice.engine.api.service.code.dto.CuisDTO;
import bo.gob.impuestos.siat.api.facturacion.codigos.RespuestaCuis;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by yoshi on 19 October 2023
 */
@Mapper(uses = MessageMapper.class)
public interface CuisMapper extends EntityMapper<CuisDTO, RespuestaCuis> {

    CuisMapper INSTANCE = Mappers.getMapper(CuisMapper.class);

    @Mapping(target = "limitDate", source = "fechaVigencia")
    @Mapping(target = "code", source = "codigo")
    @Mapping(target = "transaction", source = "transaccion")
    @Mapping(target = "messages", source = "mensajesList")
    @Override
    CuisDTO toDto(RespuestaCuis entity);

}
