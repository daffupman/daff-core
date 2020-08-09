package io.daff.exception;

import io.daff.enums.Code;

/**
 * 不一致的数据
 *
 * @author daffupman
 * @since 2020/7/25
 */
public class InconsistentDataException extends BaseException {

    private static final long serialVersionUID = 5088977181620127508L;

    public InconsistentDataException(String msg) {
        super(Code.INCONSISTENT_DATA, msg);
    }
}
