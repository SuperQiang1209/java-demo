package com.zhengq.designpattern._02factorypattern.example.impl;

import com.zhengq.designpattern._02factorypattern.example.Human;

/**
 * 黄色人种
 * 
 * @ClassName: YellowHuman
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月3日 下午3:44:57
 */
public class YellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黄色人种的皮肤颜色是黄色的");
	}

	@Override
	public void talk() {
		System.out.println("黄色人种会说话,一般说的都是双字节。");
	}

}
