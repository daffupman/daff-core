package io.daff.entity;

import io.daff.enums.Codes;
import io.daff.enums.Messages;

/**
 * 响应模型
 *
 * <br/><br/>
 *
 * <p>
 * 接口的设计原则：
 * 1)对内隐藏内部实现，如果接口的实现有调用其他服务，不应该把其他服务的响应信息暴露出去，而是   融合在自己接口的逻辑中。
 * 2)设计接口结构时，明确每个字段的含义，以及客户端的处理方式。
 * </p>
 *
 * <br/>
 *
 * <p>
 * 接口设计逻辑：
 * <ul>
 *     <li>如果出现非 200 的 HTTP 响应状态码，就代表请求没有到收单服务，可能是网络出问题、网络超时，或者网络配置的问题。这时，肯定无法拿到服务端的响应体，客户端可以给予友好提示，比如让用户重试，不需要继续解析响应结构体。</li>
 *     <li>如果 HTTP 响应码是 200，解析响应体查看 success，为 false 代表下单请求处理失败，可能是因为收单服务参数验证错误，也可能是因为订单服务下单操作失败。这时，根据收单服务定义的错误码表和 code，做不同处理。比如友好提示，或是让用户重新填写相关信息，其中友好提示的文字内容可以从 message 中获取。</li>
 *     <li>success 为 true 的情况下，才需要继续解析响应体中的 data 结构体。data 结构体代表了业务数据，通常会有下面两种情况。1)通常情况下，success 为 true 时订单状态是 Created，获取 orderId 属性可以拿到订单号。2)特殊情况下，比如收单服务内部处理不当，或是订单服务出现了额外的状态，虽然 success 为 true，但订单实际状态不是 Created，这时可以给予友好的错误提示。</li>
 * </ul>
 * </p>
 *
 * @author daffupman
 * @since 2020/7/12
 */
public class Response<T> {

    /**
     * 本次操作的处理结果
     */
    private Boolean ok;

    /**
     * 响应码，参考 {@link Codes}
     */
    private Integer code;

    /**
     * 响应信息，参考 {@link Messages}
     */
    private String msg;

    /**
     * 响应数据
     */
    private T data;

    public Response(Boolean ok, Integer code, String msg) {
        this(ok, code, msg, null);
    }

    public Response(Boolean ok, Codes codes, String msg) {
        this(ok, codes.value(), msg, null);
    }

    public Response(Boolean ok, Codes codes, Messages msg) {
        this(ok, codes.value(), msg.value(), null);
    }

    public Response(Boolean ok, Codes codes, Messages msg, T data) {
        this(ok, codes.value(), msg.value(), data);
    }

    public Response(Boolean ok, Integer code, String msg, T data) {
        this.ok = ok;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Response<T> ok() {
        return new Response<>(Boolean.TRUE, Codes.SUCCESS, Messages.SUCCESS);
    }

    public static <T> Response<T> ok(T data) {
        return new Response<>(Boolean.TRUE, Codes.SUCCESS, Messages.SUCCESS, data);
    }

    public static Response<Void> error() {
        return new Response<>(Boolean.FALSE, Codes.SYSTEM_ERROR, Messages.SYSTEM_ERROR);
    }

    public static Response<Void> error(Codes codes, Messages messages) {
        return new Response<>(Boolean.FALSE, codes, messages);
    }

    public static Response<Void> error(Codes codes, String message) {
        return new Response<>(Boolean.FALSE, codes, message);
    }

    public Boolean getOk() {
        return ok;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
