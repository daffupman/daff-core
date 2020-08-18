package io.daff.exception;

import io.daff.enums.Codes;

/**
 * 业务逻辑异常
 *
 * @author daffupman
 * @since 2020/8/18
 */
public class BusinessException extends BaseException {

    public BusinessException(String msg) {
        super(Codes.BUSINESS_LOGIC_ERROR, msg);
    }
}
