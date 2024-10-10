package bo.codexd.invoice.engine.api.mapper.siat.data.synchonization;

import bo.codexd.invoice.engine.api.mapper.EntityMapper;
import bo.codexd.invoice.engine.api.mapper.siat.code.CuisMassiveMapper;
import bo.codexd.invoice.engine.api.service.data.synchronization.dto.ActivityDTO;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.ActividadesDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by yoshi on 19 October 2023
 */
@Mapper
public interface ActivityMapper extends EntityMapper<ActivityDTO, ActividadesDto> {

    ActivityMapper INSTANCE = Mappers.getMapper(ActivityMapper.class);

    @Mapping(target = "caebCode", source = "codigoCaeb")
    @Mapping(target = "description", source = "descripcion")
    @Mapping(target = "type", source = "tipoActividad")
    @Override
    ActivityDTO toDto(ActividadesDto entity);

}
