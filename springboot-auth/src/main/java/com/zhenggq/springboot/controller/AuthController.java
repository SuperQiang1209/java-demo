package com.zhenggq.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/19 16:37
 * @Description:
 * @Version: 1.0
 */
@RestController
public class AuthController {

    @RequestMapping("/hello")
    public String hello() {
        return "helle consul";
    }

}
