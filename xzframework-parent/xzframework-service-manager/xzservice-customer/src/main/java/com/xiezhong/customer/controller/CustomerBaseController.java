package com.xiezhong.customer.controller;

import com.xiezhong.customer.service.CustomerBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CustomerBaseController {

    @Resource(name = "com.xiezhong.customer.service.impl.CustomerBaseService1Impl")
    @Autowired
    private CustomerBaseService customerBaseService;

    @RequestMapping(value = "test")
    public void test(){
        customerBaseService.test();
    }

}
