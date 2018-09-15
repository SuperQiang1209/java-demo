package com.zhenggq.datastructure.sort;

import org.junit.Test;

/**
 * 冒泡排序测试
 *
 * @Auther: Zhenggq
 * @Date: 2018/9/7 00:16
 * @Description:
 */

public class BubbleSortTest {

    @Test
    public void test1() {
        Integer[] arr = new Integer[]{222, 1, -9, 31, 444};
        BubbleSort.sort1(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    @Test
    public void test2() {
        Integer[] arr = new Integer[]{222, 1, -9, 31, 444,50000,333,99,22};
        BubbleSort.sort2(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
