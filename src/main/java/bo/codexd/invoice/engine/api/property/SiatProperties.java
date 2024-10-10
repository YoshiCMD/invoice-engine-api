package bo.codexd.invoice.engine.api.property;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by yoshi on 12 October 2023
 */

@Getter
@Setter
public class SiatProperties {

    private Boolean enabled = true;

    private Integer timeoutRequest = 100000;

    private Integer timeoutConnect = 100000;

    private Api api = new Api();

    @Getter
    @Setter
    public static class Api {

        private Service test;

        private Service production;

        public Api() {
            this.test = Service
                    .builder()
                    .qr("https://pilotosiat.impuestos.gob.bo/facturacionv2/public/Qr.xhtml")
                    .code("https://pilotosiatservicios.impuestos.gob.bo/v2/FacturacionCodigos?wsdl")
                    .operation("https://pilotosiatservicios.impuestos.gob.bo/v2/FacturacionOperaciones?wsdl")
                    .dataSynchronization("https://pilotosiatservicios.impuestos.gob.bo/v2/FacturacionSincronizacion?wsdl")
                    .telecommunication("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioFacturacionTelecomunicaciones?wsdl")
                    .buyAndSell("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioFacturacionCompraVenta?wsdl")
                    .financialEntity("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioFacturacionEntidadFinanciera?wsdl")
                    .creditDebitNote("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioFacturacionDocumentoAjuste?wsdl")
                    .electronic("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioFacturacionElectronica?wsdl")
                    .basicService("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioFacturacionServicioBasico?wsdl")
                    .hydrocarbons("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioFacturacionHidrocarburos?wsdl")
                    .purchaseReceipt("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioRecepcionCompras?wsdl")
                    .build();
            this.production = Service
                    .builder()
                    .qr("https://pilotosiat.impuestos.gob.bo/facturacionv2/public/Qr.xhtml")
                    .code("https://pilotosiatservicios.impuestos.gob.bo/v2/FacturacionCodigos?wsdl")
                    .operation("https://pilotosiatservicios.impuestos.gob.bo/v2/FacturacionOperaciones?wsdl")
                    .dataSynchronization("https://pilotosiatservicios.impuestos.gob.bo/v2/FacturacionSincronizacion?wsdl")
                    .telecommunication("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioFacturacionTelecomunicaciones?wsdl")
                    .buyAndSell("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioFacturacionCompraVenta?wsdl")
                    .financialEntity("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioFacturacionEntidadFinanciera?wsdl")
                    .creditDebitNote("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioFacturacionDocumentoAjuste?wsdl")
                    .electronic("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioFacturacionElectronica?wsdl")
                    .basicService("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioFacturacionServicioBasico?wsdl")
                    .hydrocarbons("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioFacturacionHidrocarburos?wsdl")
                    .purchaseReceipt("https://pilotosiatservicios.impuestos.gob.bo/v2/ServicioRecepcionCompras?wsdl")
                    .build();
        }

        @Builder
        @Getter
        public static class Service {
            private String qr;
            private String code;
            private String operation;
            private String dataSynchronization;
            private String telecommunication;
            private String buyAndSell;
            private String financialEntity;
            private String creditDebitNote;
            private String electronic;
            private String basicService;
            private String hydrocarbons;
            private String purchaseReceipt;
        }
    }
}
