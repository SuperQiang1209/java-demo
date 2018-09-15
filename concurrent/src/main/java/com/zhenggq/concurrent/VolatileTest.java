package com.zhenggq.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * Volatile,保证"共享变量"的可见性
 * VOlation的使用优化:Linked-TransferQueue
 * 1.追加字节能优化性能的使用场景
 * 缓存行非64字节宽的处理器
 * 共享变量不会被频繁的写
 *
 * @Author: Zhenggq
 * @Date: 2018/9/10 09:13
 * @Description:
 * @Version: 1.0
 */
public class VolatileTest {


    /* volatile*/ boolean flag = true;

    void m() {
        while (flag) {
            try {
                System.out.println(Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        final VolatileTest test = new VolatileTest();
        new Thread(() -> test.m()).start();
        test.flag = false;
    }

}
