package bo.codexd.invoice.engine.api.mapper.siat.data.synchonization;

import bo.codexd.invoice.engine.api.mapper.EntityMapper;
import bo.codexd.invoice.engine.api.service.data.synchronization.dto.SectorDocumentDTO;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.ActividadesDocumentoSectorDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by yoshi on 19 October 2023
 */
@Mapper
public interface SectorDocumentMapper extends EntityMapper<SectorDocumentDTO, ActividadesDocumentoSectorDto> {

    SectorDocumentMapper INSTANCE = Mappers.getMapper(SectorDocumentMapper.class);

    @Mapping(target = "activityCode", source = "codigoActividad")
    @Mapping(target = "code", source = "codigoDocumentoSector")
    @Mapping(target = "type", source = "tipoDocumentoSector")
    @Override
    SectorDocumentDTO toDto(ActividadesDocumentoSectorDto entity);

}
