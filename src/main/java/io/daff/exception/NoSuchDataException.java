package io.daff.exception;

import io.daff.enums.Codes;
import io.daff.enums.Messages;

/**
 * 数据不存在异常
 *
 * @author daffupman
 * @since 2020/7/13
 */
public class NoSuchDataException extends BaseException {

    private static final long serialVersionUID = -1999015592879351947L;

    public NoSuchDataException() {
        super(Codes.DATA_NOT_FOUND, Messages.DATA_NOT_FOUND);
    }

    public NoSuchDataException(String message) {
        super(Codes.DATA_NOT_FOUND, message);
    }
}
