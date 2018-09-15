package com.zhengq.designpattern._99buildpattern;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/12 21:16
 * @Description:
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        Peson p = new Peson.Builder().age("10").address("20").code("30").build();

        System.out.println(p);


        Peson2 p2 = new Peson2();

    }
}
