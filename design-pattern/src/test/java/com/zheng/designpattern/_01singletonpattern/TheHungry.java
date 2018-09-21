package com.zheng.designpattern._01singletonpattern;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/21 09:39
 * @Description:
 * @Version: 1.0
 */
public class TheHungry {

    private TheHungry() {
    }


    private static TheHungry instance = new TheHungry();

    public TheHungry getInstance() {
        return instance;
    }


}
