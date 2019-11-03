package com.xiezhong.customer.infrastructure;

import com.xiezhong.common.basebeans.ResponseDTO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(annotations = RestController.class)
public class ExceptionControllerAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseDTO exceptionHandler(Exception ex){
        return ResponseDTO.ok();
    }
}
