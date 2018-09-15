package com.zhenggq.datastructure.ch04;

/**
 * 链接点，相当于杯子
 *
 * @Author: Zhenggq
 * @Date: 2018/9/10 22:30
 * @Description:
 * @Version: 1.0
 */
public class Node {
    /**
     * 数据域
     */
    public long data;

    /**
     * 指针域
     */
    public Node next;

    public Node(long val) {
        this.data = val;
    }

    /**
     * 显示方法
     */
    public void display() {
        System.out.println(data + "");
    }


}
