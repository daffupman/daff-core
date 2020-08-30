package io.daff.exception;

import io.daff.enums.Codes;
import io.daff.enums.Messages;

/**
 * 系统内部异常异常
 *
 * @author daffupman
 * @since 2020/8/18
 */
public class SystemInternalException extends BaseException {

    public SystemInternalException() {
        super(Codes.SYSTEM_ERROR, Messages.SYSTEM_ERROR);
    }
}
