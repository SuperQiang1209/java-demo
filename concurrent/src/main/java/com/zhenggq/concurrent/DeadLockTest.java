package com.zhenggq.concurrent;

/**
 * 死锁测试类
 * 如何避免死锁:
 * 1.避免一个线程同时获取多个锁
 * 2.避免一个线程在锁内同时占用多个资源，尽量保证每个锁只占用一个资源
 * 3.尝试使用定时，使用lock.tryLock(timeout)来替代使用内部锁机制
 * 4.对于数据库锁，加锁和解锁必须在一个数据库连接里，否则会出现解锁失败的情况
 *
 * @Author: Zhenggq
 * @Date: 2018/9/10 10:13
 * @Description:
 * @Version: 1.0
 */
public class DeadLockTest {

    private static Object o1 = new Object();
    private static Object o2 = new Object();

    private void deadLock() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o1) {
                    try {
                        System.out.println("t1 lock o1!");
                        Thread.currentThread().sleep(2000);
                        synchronized (o2) {
                            System.out.println("t1 lock o2");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o2) {
                    System.out.println("t2 lock o2!");
                    synchronized (o1) {
                        System.out.println("t2 lock o1!");
                    }
                }
            }
        });

        t1.start();
        t2.start();

    }

    public static void main(String[] args) {
        new DeadLockTest().deadLock();
    }
}
