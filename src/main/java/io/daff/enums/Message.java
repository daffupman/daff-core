package io.daff.enums;

/**
 * 响应信息
 *
 * @author daffupman
 * @since 2020/7/12
 */
public enum Message {

    SUCCESS("成功"),

    SYSTEM_ERROR("系统异常"),

    PARAM_VALIDATE_ERROR("参数校验异常"),

    UNEXPECTED_ERROR("意外的异常"),

    AUTHENTICATION_FAILED("认证失败"),

    TOKEN_MISS("缺失TOKEN"),

    TOKEN_INVALID("TOKEN非法"),

    USER_NOT_FOUND("用户找不到"),

    SECURITY_CODE_NOT_MATCH("验证码不匹配");

    private String value;

    Message(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
