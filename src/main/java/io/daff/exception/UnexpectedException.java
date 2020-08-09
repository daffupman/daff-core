package io.daff.exception;

import io.daff.enums.Code;

/**
 * 意外异常
 *
 * @author daffupman
 * @since 2020/7/12
 */
public class UnexpectedException extends BaseException {

    private static final long serialVersionUID = 2253678517658387828L;

    public UnexpectedException(String message) {
        super(Code.UNEXPECTED_ERROR, message);
    }

}
