package io.daff.exception;

import io.daff.enums.Code;
import io.daff.enums.Message;

/**
 * 数据不存在异常
 *
 * @author daffupman
 * @since 2020/7/13
 */
public class NoSuchDataException extends BaseException {

    private static final long serialVersionUID = -1999015592879351947L;

    public NoSuchDataException() {
        super(Code.DATA_NOT_FOUND, Message.USER_NOT_FOUND);
    }

    public NoSuchDataException(String message) {
        super(Code.DATA_NOT_FOUND, message);
    }
}
