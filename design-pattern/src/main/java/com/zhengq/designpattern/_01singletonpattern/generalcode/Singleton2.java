package com.zhengq.designpattern._01singletonpattern.generalcode;

/**
 * 内部类实现，懒加载+线程安全
 *
 * @Author: Zhenggq
 * @Date: 2018/9/12 22:04
 * @Description:
 * @Version: 1.0
 */
public class Singleton2 {
    private Singleton2() {

    }

    public static class SingletonHandler {
        private static Singleton2 singleton = new Singleton2();

    }

    public Singleton2 getInstance() {
        return SingletonHandler.singleton;
    }
}
