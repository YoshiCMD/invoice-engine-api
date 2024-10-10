package bo.codexd.invoice.engine.api.enumeration;

import lombok.Getter;

/**
 * Created by yoshi on 12 October 2023
 */
@Getter
public enum OnlineMode {
    ELECTRONICS(1),
    COMPUTERIZED(2);

    public final Integer code;

    OnlineMode(Integer code) {
        this.code = code;
    }

}
