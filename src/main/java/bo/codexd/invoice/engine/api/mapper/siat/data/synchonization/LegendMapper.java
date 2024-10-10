package bo.codexd.invoice.engine.api.mapper.siat.data.synchonization;

import bo.codexd.invoice.engine.api.mapper.EntityMapper;
import bo.codexd.invoice.engine.api.service.data.synchronization.dto.LegendDTO;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.ParametricaLeyendasDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by yoshi on 19 October 2023
 */
@Mapper
public interface LegendMapper extends EntityMapper<LegendDTO, ParametricaLeyendasDto> {

    LegendMapper INSTANCE = Mappers.getMapper(LegendMapper.class);

    @Mapping(target = "activityCode", source = "codigoActividad")
    @Mapping(target = "description", source = "descripcionLeyenda")
    @Override
    LegendDTO toDto(ParametricaLeyendasDto entity);

}
