package bo.codexd.invoice.engine.api.service.data.synchronization;

import bo.codexd.invoice.engine.api.enumeration.Environment;
import bo.codexd.invoice.engine.api.exception.SiatException;
import bo.codexd.invoice.engine.api.mapper.siat.data.synchonization.SectorDocumentMapper;
import bo.codexd.invoice.engine.api.request.DataSyncRequest;
import bo.codexd.invoice.engine.api.service.data.synchronization.dto.SectorDocumentDTO;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.RespuestaListaActividadesDocumentoSector;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.ServicioFacturacionSincronizacion;
import bo.gob.impuestos.siat.api.facturacion.sincronizacion.SolicitudSincronizacion;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static bo.codexd.invoice.engine.api.util.ObjectFactoryUtil.convert;

/**
 * Created by yoshi on 12 October 2023
 */
@Slf4j
@AllArgsConstructor
public class DataSyncDocumentSectorService {

    private final DataSyncProxy dataSyncProxy = new DataSyncProxy();

    public List<SectorDocumentDTO> sync(String token, Environment environment, DataSyncRequest request) {
        log.info("Sync Sector Documents environment: {}, request: {}", environment, request);
        ServicioFacturacionSincronizacion proxy = dataSyncProxy.createProxyInstance(token, environment.getCode());

        SolicitudSincronizacion solicitudSincronizacion = new SolicitudSincronizacion();
        solicitudSincronizacion.setCodigoAmbiente(environment.getCode());
        solicitudSincronizacion.setCuis(request.getCuis());
        solicitudSincronizacion.setNit(request.getNit());
        solicitudSincronizacion.setCodigoSistema(request.getSystemCode());
        solicitudSincronizacion.setCodigoSucursal(request.getBranchCode());
        solicitudSincronizacion.setCodigoPuntoVenta(convert(request.getPointOfSaleCode()));

        RespuestaListaActividadesDocumentoSector listaActividadesDocumentoSector = proxy.sincronizarListaActividadesDocumentoSector(solicitudSincronizacion);
        if (listaActividadesDocumentoSector.isTransaccion()) {
            return SectorDocumentMapper.INSTANCE.toDto(listaActividadesDocumentoSector.getListaActividadesDocumentoSector());
        } else {
            throw new SiatException("siat sync sector documents error", "data.sync.sector.document", listaActividadesDocumentoSector.getMensajesList());
        }
    }
}
