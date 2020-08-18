package io.daff.enums;

/**
 * 响应信息
 *
 * @author daffupman
 * @since 2020/7/12
 */
public enum Messages {

    SUCCESS("成功"),

    SYSTEM_ERROR("系统繁忙，请稍后重试"),

    PARAM_VALIDATE_ERROR("参数校验异常"),

    PARAM_MISS_ERROR("参数缺失"),

    UNEXPECTED_ERROR("意外的异常"),

    AUTHENTICATION_FAILED("认证失败"),

    TOKEN_MISS("缺失TOKEN"),

    TOKEN_INVALID("TOKEN非法"),

    USER_THINGS_NOT_FOUND("用户找不到"),

    USER_THINGS_STATUS_ERROR("用户状态异常"),

    SECURITY_CODE_NOT_MATCH("验证码不匹配"),

    DATA_NOT_FOUND("数据找不到");

    private String value;

    Messages(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
