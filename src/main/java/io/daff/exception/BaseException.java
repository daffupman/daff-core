package io.daff.exception;

import io.daff.enums.Code;
import io.daff.enums.Message;

/**
 * 系统基础异常
 *
 * @author daffupman
 * @since 2020/7/12
 */
public class BaseException extends RuntimeException {

    private static final long serialVersionUID = -4113091967574026465L;

    /**
     * 响应码，参考 {@link io.daff.enums.Code}
     */
    private Code code;
    private Message msg;

    public BaseException(Code code, Message msg) {
        super(msg.value());
        this.code = code;
        this.msg = msg;
    }

    public BaseException(Code code, String msg) {
        super(msg);
        this.code = code;
    }

    public Code getCode() {
        return code;
    }

    public Message getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "BaseException{" +
                "code=" + code.value() +
                "message=" + getMessage() +
                '}';
    }
}
