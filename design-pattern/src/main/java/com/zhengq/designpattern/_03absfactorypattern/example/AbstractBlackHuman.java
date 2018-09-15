package com.zhengq.designpattern._03absfactorypattern.example;

/**
 * 抽象黑色人种
 * 
 * @ClassName: AbstractBlackHuman
 * @Description: 负责人种的抽象属性定义:肤色和语言
 * @author: Zhenggq
 * @date: 2018年5月4日 上午9:15:58
 */
public abstract class AbstractBlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黑色人种的皮肤颜色是白色的！");
	}

	@Override
	public void talk() {
		System.out.println("黑色人种会说话,一般人听不懂。");
	}

}
