package com.zheng.designpattern;

import org.junit.Test;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/**
 * @Auther: Zhenggq
 * @Date: 2018/9/7 10:53
 * @Description:
 * @Version: 1.0
 */
public class ProxyTest {

    @Test
    public void test() {


        Map<String, Object> map = Collections.emptyMap();
        Integer i = 22222;
        System.out.println(Objects.hashCode("userAdmin"));
        System.out.println(Objects.hashCode("啦啦啦啦"));
        System.out.println(Objects.hashCode("呜呜呜呜"));
    }
}
