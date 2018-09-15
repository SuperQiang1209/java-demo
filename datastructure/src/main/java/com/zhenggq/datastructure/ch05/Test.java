package com.zhenggq.datastructure.ch05;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/11 23:16
 * @Description:
 * @Version: 1.0
 */
public class Test {

    static void cfb(int i) {

        if (i == 0) {
            return;
        }
        for (int k = 1; k <= i; ++k) {
            System.out.print(k + "*" + i + "=" + k * i + " ");
        }
        System.out.println("");
        cfb(i - 1);
    }

    public static void main(String[] args) {
        cfb(9);
        System.out.println("");
        System.out.println("");
        System.out.println(fbr(6));
    }


    static int fbr(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        int res = fbr(i - 1) + fbr(i - 2);
        return res;
    }
}
