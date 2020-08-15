package io.daff.exception;

import io.daff.enums.Codes;

/**
 * @author daffupman
 * @since 2020/8/9
 */
public class InconsistentDataException extends BaseException {

    private static final long serialVersionUID = 7103360464347579079L;

    public InconsistentDataException(String msg) {
        super(Codes.DATA_NOT_MATCH, msg);
    }
}
