package io.daff.exception;

import io.daff.enums.Codes;

/**
 * 参数缺失异常
 *
 * @author daffupman
 * @since 2020/7/12
 */
public class ParamMissException extends BaseException {

    private static final long serialVersionUID = 2253678517658387828L;

    public ParamMissException(String message) {
        super(Codes.PARAM_MISS_ERROR, message);
    }
    
}
