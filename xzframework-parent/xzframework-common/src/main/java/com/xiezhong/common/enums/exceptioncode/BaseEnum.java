package com.xiezhong.common.enums.exceptioncode;

public enum BaseEnum implements ExceptionCode {
    SUCCESS(0, "请求成功"),
    FAIL(99999999, "系统异常，请求失败");

    private Integer code;

    private String message;

    BaseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
