package jsz.dk.huahui.common;

import jsz.dk.huahui.enums.ResponseCode;

/**
 * @ProjectName: sign-management @Package: jsz.dk.signmanagement.common @ClassName:
 * BaseException @Author: Strawberry @Description: @Date: 2021/07/13 19:50
 */
@SuppressWarnings("unused")
public class BaseException extends RuntimeException {

  private Integer code;

  public BaseException() {}

  /**
   * 使用CommonErrorCode枚举传参
   *
   * @param errorCode 异常枚举
   */
  public BaseException(ResponseCode errorCode) {
    super(errorCode.getMessage());
    this.code = errorCode.getCode();
  }

  public BaseException(ResponseCode baseErrorCode, String msg) {
    super(msg);
    this.code = baseErrorCode.getCode();
  }

  /**
   * 使用自定义消息
   *
   * @param code 值
   * @param msg 详情
   */
  public BaseException(Integer code, String msg) {
    super(msg);
    this.code = code;
  }

  public static void exception(ResponseCode code) {
    throw new BaseException(code);
  }

  public static void exception(ResponseCode code, String msg) {
    throw new BaseException(code, msg);
  }

  public static void exception(Integer code, String msg) {
    throw new BaseException(code, msg);
  }

  public static void businessException(String msg) {
    throw new BaseException(ResponseCode.FAILURE, msg);
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }
}
