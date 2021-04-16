package io.daff.exception;

import io.daff.enums.Hint;

/**
 * 系统内部异常异常
 *
 * @author daffupman
 * @since 2020/8/18
 */
public class SystemInternalException extends BaseException {

    public SystemInternalException() {
        super(Hint.SYSTEM_ERROR);
    }

    public SystemInternalException(String message) {
        super(Hint.SYSTEM_ERROR, message);
    }
}
