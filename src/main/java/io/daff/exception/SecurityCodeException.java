package io.daff.exception;

import io.daff.enums.Codes;

/**
 * 验证码异常
 *
 * @author daffupman
 * @since 2020/7/13
 */
public class SecurityCodeException extends BaseException {

    private static final long serialVersionUID = -1999015592879351947L;

    public SecurityCodeException() {
        super(Codes.SECURITY_CODE_NOT_MATCH, "验证码错误");
    }

    public SecurityCodeException(String message) {
        super(Codes.SECURITY_CODE_NOT_MATCH, message);
    }
}
