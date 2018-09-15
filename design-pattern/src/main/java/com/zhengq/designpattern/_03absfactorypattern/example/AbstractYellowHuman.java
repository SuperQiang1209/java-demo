package com.zhengq.designpattern._03absfactorypattern.example;

/**
 * 抽象黄色人种
 * 
 * @ClassName: AbstractYellowHuman
 * @Description: 负责人种的抽象属性定义:肤色和语言
 * @author: Zhenggq
 * @date: 2018年5月4日 上午9:16:05
 */
public abstract class AbstractYellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黄色人种的皮肤颜色是白色的！");
	}

	@Override
	public void talk() {
		System.out.println("黄色人种会说话,一般说的都是双字节。");
	}

}
