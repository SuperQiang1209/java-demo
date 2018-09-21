package com.zhenggq.springboot.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/19 17:32
 * @Description:
 * @Version: 1.0
 */
@FeignClient(name= "service-auth")
public interface IConsumerService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();
}
