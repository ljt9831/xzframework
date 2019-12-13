package com.xiezhong.customer.infrastructure;

import com.xiezhong.common.basebeans.ResponseDTO;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(annotations = RestController.class)
public class ExceptionControllerAdvice {

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public ResponseDTO bindExceptionHandler(BindException bindException){
        BindingResult bindingResult = bindException.getBindingResult();
        return ResponseDTO.ok();
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseDTO exceptionHandler(Exception excepiton){

        return ResponseDTO.ok();
    }
}
