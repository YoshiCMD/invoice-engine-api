package bo.codexd.invoice.engine.api.service.code;

import bo.codexd.invoice.engine.api.enumeration.Environment;
import bo.codexd.invoice.engine.api.exception.SiatException;
import bo.codexd.invoice.engine.api.mapper.siat.data.synchonization.CommunicationMapper;
import bo.codexd.invoice.engine.api.service.data.synchronization.dto.CommunicationDTO;
import bo.gob.impuestos.siat.api.facturacion.codigos.RespuestaComunicacion;
import bo.gob.impuestos.siat.api.facturacion.codigos.ServicioFacturacionCodigos;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by yoshi on 12 October 2023
 */
@Slf4j
@AllArgsConstructor
public class CodeSyncService {

    private final CodeSyncProxy codeSyncProxy = new CodeSyncProxy();

    public CommunicationDTO verifyCommunication(String token, Environment environment) {
        log.info("verifyCommunication environment: {}", environment);
        ServicioFacturacionCodigos proxy = codeSyncProxy.createProxyInstance(token, environment.getCode());
        RespuestaComunicacion respuestaComunicacion = proxy.verificarComunicacion();
        if (respuestaComunicacion.isTransaccion()) {
            return CommunicationMapper.INSTANCE.toDto(respuestaComunicacion);
        } else {
            throw new SiatException("siat sync verify communication", "data.sync.verify.communication", respuestaComunicacion.getMensajesList());
        }
    }
}
