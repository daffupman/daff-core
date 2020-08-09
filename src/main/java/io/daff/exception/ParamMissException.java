package io.daff.exception;

import io.daff.enums.Code;

/**
 * 参数缺失异常
 *
 * @author daffupman
 * @since 2020/7/12
 */
public class ParamMissException extends BaseException {

    private static final long serialVersionUID = 2253678517658387828L;

    public ParamMissException(String message) {
        super(Code.PARAM_VALIDATE_ERROR, message);
    }
    
}
