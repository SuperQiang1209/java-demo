package com.zhengq.designpattern._03absfactorypattern.example;

/**
 * 抽象白色人种
 * 
 * @ClassName: AbstractWhiteHuman
 * @Description: 负责人种的抽象属性定义:肤色和语言
 * @author: Zhenggq
 * @date: 2018年5月4日 上午9:15:31
 */
public abstract class AbstractWhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("白色人种的皮肤颜色是白色的！");
	}

	@Override
	public void talk() {
		System.out.println("白色人种会说话,一般说的都是单字节。");
	}

}
