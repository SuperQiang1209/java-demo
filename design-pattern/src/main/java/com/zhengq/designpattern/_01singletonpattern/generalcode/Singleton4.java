package com.zhengq.designpattern._01singletonpattern.generalcode;

/**
 * 无偿提供了序列化机制，绝对防止多次实例化
 *
 * @Author: Zhenggq
 * @Date: 2018/9/12 22:16
 * @Description:
 * @Version: 1.0
 */
public enum Singleton4 {
    INSTANCE;

    public Singleton4 getInstance() {
        return INSTANCE;
    }
}
