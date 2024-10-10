package bo.codexd.invoice.engine.api.mapper.siat.data.synchonization;

import bo.codexd.invoice.engine.api.mapper.EntityMapper;
import bo.codexd.invoice.engine.api.service.data.synchronization.dto.ProductDTO;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.ProductosDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by yoshi on 19 October 2023
 */
@Mapper
public interface ProductMapper extends EntityMapper<ProductDTO, ProductosDto> {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "activityCode", source = "codigoActividad")
    @Mapping(target = "code", source = "codigoProducto")
    @Mapping(target = "description", source = "descripcionProducto")
    @Override
    ProductDTO toDto(ProductosDto entity);

}
