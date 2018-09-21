package com.zhenggq.springboot.controller;

import com.zhenggq.springboot.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/19 17:46
 * @Description:
 * @Version: 1.0
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private IConsumerService consumerService;

    @RequestMapping("/test")
    public String hello() {
        return consumerService.hello();
    }

    @RequestMapping("/go")
    public String go() {
        return "gogogo!!!";
    }

}
