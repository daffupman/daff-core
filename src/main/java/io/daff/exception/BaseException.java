package io.daff.exception;

import io.daff.enums.Codes;
import io.daff.enums.Messages;

/**
 * 系统基础异常
 *
 * @author daffupman
 * @since 2020/7/12
 */
public class BaseException extends RuntimeException {

    private static final long serialVersionUID = -4113091967574026465L;

    /**
     * 响应码，参考 {@link Codes}
     */
    private Codes codes;
    private Messages msg;

    public BaseException(Codes codes, Messages msg) {
        super(msg.value());
        this.codes = codes;
        this.msg = msg;
    }

    public BaseException(Codes codes, String msg) {
        super(msg);
        this.codes = codes;
    }

    public Codes getCodes() {
        return codes;
    }

    public Messages getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "BaseException{" +
                "code=" + codes.value() +
                "message=" + getMessage() +
                '}';
    }
}
