package com.zhenggq.datastructure.sort;

/**
 * 冒泡排序
 *
 * @Auther: Zhenggq
 * @Date: 2018/9/6 23:19
 * @Description:
 */
public class BubbleSort {

    public static void sort1(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = (arr.length - 1); j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }

    public static void sort2(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = (i+1); j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    if (arr[i] > arr[j]) {
                        int tmp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=tmp;
                    }
                }
            }
        }
    }
}
