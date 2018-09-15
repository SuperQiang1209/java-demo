package com.zhengq.designpattern._01singletonpattern.generalcode;

import java.io.Serializable;

/**
 * 在实现序列化与反序列化时，加上readResolve方法，反正反序列化时产生一个新的实例.
 *
 * @Author: Zhenggq
 * @Date: 2018/9/12 22:10
 * @Description:
 * @Version: 1.0
 */
public class Singleton3 implements Serializable {

    private static final Singleton3 singleton = new Singleton3();

    // 限制多个对象
    private Singleton3() {

    }

    // 通过该方法获得实例,synchronized保证线程安全
    public static synchronized Singleton3 getSingleton() {
        return singleton;
    }

    private Object readResolve() {
        return singleton;
    }
}
