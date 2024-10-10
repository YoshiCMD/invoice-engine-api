package bo.codexd.invoice.engine.api.mapper.siat.data.synchonization;

import bo.codexd.invoice.engine.api.mapper.EntityMapper;
import bo.codexd.invoice.engine.api.service.data.synchronization.dto.DataTimeDTO;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaFechaHora;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by yoshi on 19 October 2023
 */
@Mapper( uses = MessageMapper.class)
public interface DataTimeMapper extends EntityMapper<DataTimeDTO, RespuestaFechaHora> {

    DataTimeMapper INSTANCE = Mappers.getMapper(DataTimeMapper.class);

    @Mapping(target = "transaction", source = "transaccion")
    @Mapping(target = "messages", source = "mensajesList")
    @Mapping(target = "dataTime", source = "fechaHora")
    @Override
    DataTimeDTO toDto(RespuestaFechaHora entity);

}
