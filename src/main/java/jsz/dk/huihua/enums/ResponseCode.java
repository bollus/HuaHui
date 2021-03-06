package jsz.dk.huihua.enums;

import jsz.dk.huihua.common.interfaces.ResponseInterface;

/**
 * @ProjectName: sign-management
 * @Package: jsz.dk.signmanagement.enums
 * @ClassName: ResponseCode
 * @Author: Strawberry
 * @Description:
 * @Date: 2021/07/03 19:18
 */
@SuppressWarnings("unused")
public enum ResponseCode implements ResponseInterface {
    SUCCESS(200, "操作成功"),
    CUSTOM_FAILED(201, "请求失败"),
    FAILURE(400, "业务异常"),
    UN_AUTHORIZED(401, "请求未授权"),
    CLIENT_UN_AUTHORIZED(501, "客户端请求未授权"),
    NOT_FOUND(404, "404 没找到请求"),
    MSG_NOT_READABLE(400, "消息不能读取"),
    METHOD_NOT_SUPPORTED(405, "不支持当前请求方法"),
    MEDIA_TYPE_NOT_SUPPORTED(415, "不支持当前媒体类型"),
    REQ_REJECT(403, "请求被拒绝"),
    INTERNAL_SERVER_ERROR(500, "服务器异常"),
    PARAM_MISS(400, "缺少必要的请求参数"),
    PARAM_TYPE_ERROR(400, "请求参数类型错误"),
    PARAM_BIND_ERROR(400, "请求参数绑定错误"),
    AUTH_GOOGLE_NOT_FOUND(421, "未Google校验，无法访问"),
    AUTH_LOGIN_NOT_VALID(401, "用户未登录，或token过期"),
    PARAM_VALID_ERROR(400, "参数校验失败");

    final int code;
    final String message;

    ResponseCode(final int code, final String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return message;
    }
}
