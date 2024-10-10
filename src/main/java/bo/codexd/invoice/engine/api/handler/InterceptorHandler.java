package bo.codexd.invoice.engine.api.handler;

import jakarta.xml.soap.SOAPBody;
import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.soap.SOAPPart;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;

import javax.xml.namespace.QName;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.*;

/**
 * Created by yoshi on 12 October 2023
 */
public class InterceptorHandler implements SOAPHandler<SOAPMessageContext> {
    private static final Logger log = LoggerFactory.getLogger(InterceptorHandler.class);

    private final String token;

    public InterceptorHandler(String token) {
        this.token = token;
    }

    @Override
    public Set<QName> getHeaders() {
        log.debug("SOAP Client\t: headers *****");
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {

        Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (outboundProperty) {
            log.debug("SOAP Client\t: Enviando mensaje saliente *****");
            addTokenToRequest(context);
            logSoapMessage(context, "Petición");
        } else {
            log.debug("SOAP Client\t: Recibiendo mensaje entrante *****");
            logSoapMessage(context, "Respuesta");
        }

        return true;
    }

    private void addTokenToRequest(SOAPMessageContext context) {
        @SuppressWarnings("unchecked")
        Map<String, List<String>> requestHeaders = (Map<String, List<String>>) context.get(MessageContext.HTTP_REQUEST_HEADERS);
        if (requestHeaders == null) {
            requestHeaders = new HashMap<>();
            context.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);
        }
        requestHeaders.put("apikey", Collections.singletonList("TokenApi ".concat(this.token)));
    }

    private void logSoapMessage(SOAPMessageContext context, String tipoMensaje) {
        try {
            SOAPMessage soapMessage = context.getMessage();
            SOAPPart soapPart = soapMessage.getSOAPPart();
            SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
            SOAPBody soapBody = soapEnvelope.getBody();

            StringBuilder bodyContent = new StringBuilder();
            Node bodyNode = soapBody.getFirstChild();
            while (bodyNode != null) {
                if (bodyNode.getNodeType() == Node.ELEMENT_NODE) {
                    bodyContent.append(nodeToString(bodyNode));
                }
                bodyNode = bodyNode.getNextSibling();
            }
            log.debug("SOAP Client\t: " + tipoMensaje + " Body: " + bodyContent);
        } catch (Exception e) {
            log.error("Error al obtener el cuerpo del mensaje SOAP " + tipoMensaje + ": " + e.getMessage());
        }
    }

    private String nodeToString(Node node) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        StringWriter sw = new StringWriter();
        transformer.transform(new DOMSource(node), new StreamResult(sw));
        return sw.toString();
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        log.debug("SOAP Client\t: handleFault *****");
        return true;
    }

    @Override
    public void close(MessageContext context) {
        log.debug("SOAP Client\t: close *****");
    }

}
