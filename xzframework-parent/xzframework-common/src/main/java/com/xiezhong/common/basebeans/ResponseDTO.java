package com.xiezhong.common.basebeans;

import com.xiezhong.common.enums.exceptioncode.BaseEnum;
import com.xiezhong.common.enums.exceptioncode.ExceptionCode;

public class ResponseDTO<T> {

    private Integer code;

    private String message;

    private T data;

    private ResponseDTO(){
        this.code = BaseEnum.SUCCESS.getCode();
        this.message = BaseEnum.SUCCESS.getMessage();
        this.data = null;
    }

    private ResponseDTO(T data){
        this.code = BaseEnum.SUCCESS.getCode();
        this.message = BaseEnum.SUCCESS.getMessage();
        this.data = data;
    }

    private ResponseDTO(ExceptionCode exceptionCode){
        this.code = exceptionCode.getCode();
        this.message = exceptionCode.getMessage();
        this.data = null;
    }

    private ResponseDTO(Integer code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ResponseDTO ok(){
        return new ResponseDTO();
    }

    public static <T> ResponseDTO ok(T data){
        return new ResponseDTO(data);
    }

    public static ResponseDTO error(ExceptionCode exceptionCode){
        return new ResponseDTO(exceptionCode);
    }

    public static ResponseDTO error(Integer code, String message){
        return new ResponseDTO(code, message, null);
    }

    public static <T> ResponseDTO error(Integer code, String message, T data){
        return new ResponseDTO(code, message, data);
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
