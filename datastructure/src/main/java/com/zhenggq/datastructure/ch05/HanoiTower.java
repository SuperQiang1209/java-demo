package com.zhenggq.datastructure.ch05;

import java.util.Iterator;
import java.util.Stack;

/**
 * 汉罗塔问题
 *
 * @Author: Zhenggq
 * @Date: 2018/9/11 20:09
 * @Description:
 * @Version: 1.0
 */
public class HanoiTower {

    /**
     * 功能描述:
     *
     * @param:
     * @return:
     * @author: Zhenggq
     * @date: 2018/9/11
     */
    static void resolve(int n, Stack<Integer> a, Stack<Integer> b, Stack<Integer> c) {
        if (n == 0)
            return;
        System.out.println("1:" + n + ",a:" + a.toArray().length + ",b:" + b.toArray().length + ",c:" + c.toArray().length);
        //将(n-1)的盘子从a柱子移动b柱子上。此处的参数在递归时,b和c会调换位子.
        resolve(n - 1, a, c, b);
        System.out.println("2:" + n);
        //移动第n个盘子到c柱子上面
        c.push(a.pop());
        //剩余b柱子上面的盘子移动到c柱子上
        System.out.println("3:" + n);
        resolve(n - 1, b, a, c);
        System.out.println("===================================");
    }


    public static void main(String[] args) {
        int n = 3;

        //使用栈，先进后出。
        Stack<Integer> from = new Stack<Integer>();
        Stack<Integer> transfer = new Stack<Integer>();
        Stack<Integer> to = new Stack<Integer>();

        for (int i = n; i > 0; --i) {
            from.push(i);
        }

        //print(from);
        resolve(n, from, transfer, to);
        //print(to);
    }

    public static void print(Stack<Integer> s) {
        Iterator<Integer> i = s.iterator();
        while (i.hasNext()) {
            System.out.printf("%d ", i.next());
        }
        System.out.println("");
    }

}
