package bo.codexd.invoice.engine.api.mapper.siat.code;

import bo.codexd.invoice.engine.api.mapper.EntityMapper;
import bo.codexd.invoice.engine.api.mapper.siat.data.synchonization.MessageMapper;
import bo.codexd.invoice.engine.api.service.code.dto.CuisMassiveDTO;
import bo.gob.impuestos.siat.api.facturacion.codigos.RespuestaListaRegistroCuisSoapDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by yoshi on 19 October 2023
 */
@Mapper(uses = MessageMapper.class)
public interface CuisMassiveMapper extends EntityMapper<CuisMassiveDTO, RespuestaListaRegistroCuisSoapDto> {

    CuisMassiveMapper INSTANCE = Mappers.getMapper(CuisMassiveMapper.class);

    @Mapping(target = "code", source = "codigo")
    @Mapping(target = "limitDate", source = "fechaVigencia")
    @Mapping(target = "branchCode", source = "codigoSucursal")
    @Mapping(target = "pointOfSaleCode", source = "codigoPuntoVenta")
    @Mapping(target = "transaction", source = "transaccion")
    @Mapping(target = "messages", source = "mensajeServicioList")
    @Override
    CuisMassiveDTO toDto(RespuestaListaRegistroCuisSoapDto entity);

}
