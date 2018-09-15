package com.zhenggq.dubbo.provider.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/12 15:44
 * @Description:
 * @Version: 1.0
 */
public class Provider {
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            context.start();
            System.out.println("===服务注册成功==");
            System.in.read();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
