package bo.codexd.invoice.engine.api.enumeration;

import lombok.Getter;

/**
 * Created by yoshi on 12 October 2023
 */
@Getter
public enum Environment {
    PRODUCTION(1),
    TEST(2);

    public final Integer code;

    Environment(Integer code) {
        this.code = code;
    }

}
