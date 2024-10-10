package bo.codexd.invoice.engine.api.mapper.siat.code;

import bo.codexd.invoice.engine.api.mapper.EntityMapper;
import bo.codexd.invoice.engine.api.service.code.dto.CufdDTO;
import bo.gob.impuestos.siat.api.facturacion.codigos.RespuestaCufd;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by yoshi on 19 October 2023
 */
@Mapper
public interface CufdMapper extends EntityMapper<CufdDTO, RespuestaCufd> {

    CufdMapper INSTANCE = Mappers.getMapper(CufdMapper.class);

    @Mapping(target = "code", source = "codigo")
    @Mapping(target = "controlCode", source = "codigoControl")
    @Mapping(target = "address", source = "direccion")
    @Mapping(target = "limitDate", source = "fechaVigencia")
    @Override
    CufdDTO toDto(RespuestaCufd entity);

}
