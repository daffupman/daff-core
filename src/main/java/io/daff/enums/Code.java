package io.daff.enums;

/**
 * 主响应码
 *
 * @author daffupman
 * @since 2020/7/12
 */
public enum Code {

    /**
     * 成功
     */
    SUCCESS(1000),

    /**
     * 系统异常
     */
    SYSTEM_ERROR(2000),

    /**
     * 意外的异常
     */
    UNEXPECTED_ERROR(2001),

    /**
     * 参数校验异常
     */
    PARAM_VALIDATE_ERROR(3000),

    /**
     * 参数缺失
     */
    PARAM_MISS_ERROR(3001),

    /**
     * 认证失败
     */
    AUTHENTICATION_FAILED(4000),

    /**
     * 授权失败
     */
    AUTHORITY_FAILED(4001),

    /**
     * 权限不足
     */
    PERMISSION_NOT_ENOUGH(4002),

    /**
     * 无法访问的数据
     */
    UNAVAILABLE_DATA(4003),

    /**
     * 缺少token
     */
    TOKEN_MISS(5000),

    /**
     * token非法
     */
    TOKEN_INVALID(5001),

    /**
     * 数据找不到
     */
    DATA_NOT_FOUND(6000),

    /**
     * 数据不一致
     */
    INCONSISTENT_DATA(6001),

    /**
     * 验证码不匹配
     */
    SECURITY_CODE_NOT_MATCH(7000),


    /**
     * 未知错误
     */
    UNKNOWN_ERROR(8000),

    /**
     * 不支持的类型
     */
    UNSUPPORTED_TYPE(8001),
    ;

    private Integer value;

    Code(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return value;
    }
}
