package bo.codexd.invoice.engine.api.mapper.siat.data.synchonization;

import bo.codexd.invoice.engine.api.mapper.EntityMapper;
import bo.codexd.invoice.engine.api.service.data.synchronization.dto.ParametricDTO;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.ParametricasDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by yoshi on 19 October 2023
 */
@Mapper
public interface ParametricMapper extends EntityMapper<ParametricDTO, ParametricasDto> {

    ParametricMapper INSTANCE = Mappers.getMapper(ParametricMapper.class);

    @Mapping(target = "classifierCode", source = "codigoClasificador")
    @Mapping(target = "description", source = "descripcion")
    @Override
    ParametricDTO toDto(ParametricasDto entity);

}
