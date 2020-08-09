package io.daff.exception;

import io.daff.enums.Code;

/**
 * 不支持的参数类型
 *
 * @author daffupman
 * @since 2020/7/25
 */
public class UnsupportedParamType extends BaseException {

    private static final long serialVersionUID = 674329907217612984L;

    public UnsupportedParamType(String msg) {
        super(Code.UNSUPPORTED_TYPE, msg);
    }
}
