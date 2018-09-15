package com.zhenggq.concurrent;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/10 10:50
 * @Description:
 * @Version: 1.0
 */
public class TrainTicketTest {

    private ArrayList<String> list = new ArrayList<>(10);
    private Lock tlock = new ReentrantLock();
    private Condition p = tlock.newCondition();
    private Condition c = tlock.newCondition();
    private int size;

    void put(String s) {
        tlock.lock();

        try {
            while (size == 10) {
                p.await();
            }
            list.add(s);
            size++;
            c.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            tlock.unlock();
        }

    }

    String take() {
        String r = "";
        tlock.lock();
        try {
            while (list.size() == 0) {
                c.await();
            }
            r = list.get(0);
            list.remove(0);
            size--;
            p.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            tlock.unlock();
        }
        return r;
    }

    int getSize() {
        return this.size;
    }


    public static void main(String[] args) {
        TrainTicketTest t = new TrainTicketTest();
        Random random = new Random();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("消费--------------------------------" + t.take());
                    try {
                        TimeUnit.SECONDS.sleep(random.nextInt(10));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("消费--------------------------------" + t.take());
                    try {
                        TimeUnit.SECONDS.sleep(random.nextInt(10));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("消费--------------------------------" + t.take());
                    try {
                        TimeUnit.SECONDS.sleep(random.nextInt(10));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();




        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    long l = System.currentTimeMillis();
                    System.out.println("生产--------------------------------" + l);
                    t.put(l + "");
                }
            }
        });

        t2.start();
        t1.start();

    }

}
