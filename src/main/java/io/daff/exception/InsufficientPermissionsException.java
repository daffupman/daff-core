package io.daff.exception;

import io.daff.enums.Codes;

/**
 * @author daffupman
 * @since 2020/8/9
 */
public class InsufficientPermissionsException extends BaseException {

    private static final long serialVersionUID = 7103360464347579079L;

    public InsufficientPermissionsException(String msg) {
        super(Codes.PERMISSION_NOT_ENOUGH, msg);
    }
}
