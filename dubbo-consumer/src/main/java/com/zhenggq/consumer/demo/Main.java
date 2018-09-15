package com.zhenggq.consumer.demo;

import com.zhenggq.dubbo.api.IDemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/12 16:01
 * @Description:
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        System.out.println("consumer start");
        IDemoService demoService = context.getBean(IDemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));
    }
}
