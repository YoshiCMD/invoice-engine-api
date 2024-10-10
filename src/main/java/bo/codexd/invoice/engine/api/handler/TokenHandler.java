package bo.codexd.invoice.engine.api.handler;

import jakarta.xml.ws.handler.Handler;
import jakarta.xml.ws.handler.HandlerResolver;
import jakarta.xml.ws.handler.PortInfo;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yoshi on 12 October 2023
 */

@AllArgsConstructor
public class TokenHandler implements HandlerResolver {

    private String token;

    @Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        List<Handler> handlerList = new ArrayList<>();
        handlerList.add(new InterceptorHandler(this.token));
        return handlerList;
    }
}
