package io.daff.entity;

import io.daff.enums.Code;
import io.daff.enums.Message;

/**
 * 响应模型
 *
 * @author daffupman
 * @since 2020/7/12
 */
public class Response<T> {

    /**
     * 响应码，参考 {@link io.daff.enums.Code}
     */
    private Integer code;

    /**
     * 响应信息，参考 {@link io.daff.enums.Message}
     */
    private String msg;

    /**
     * 响应数据
     */
    private T data;

    public Response() {
    }

    public Response(Integer code, String msg) {
        this(code, msg, null);
    }

    public Response(Code code, String msg) {
        this(code.value(), msg, null);
    }

    public Response(Code code, Message msg) {
        this(code.value(), msg.value(), null);
    }

    public Response(Code code, Message msg, T data) {
        this.code = code.value();
        this.msg = msg.value();
        this.data = data;
    }

    public Response(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Response<T> success(T data) {
        return new Response<>(Code.SUCCESS, Message.SUCCESS, data);
    }

    public static <T> Response<T> error() {
        return new Response<>(Code.SYSTEM_ERROR, Message.SYSTEM_ERROR, null);
    }

    public static <T> Response<T> error(Code code, Message message) {
        return new Response<>(code, message, null);
    }

    public static <T> Response<T> error(Code code, String message) {
        return new Response<T>(code, message);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
