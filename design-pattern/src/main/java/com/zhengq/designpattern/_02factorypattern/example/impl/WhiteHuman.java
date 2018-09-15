package com.zhengq.designpattern._02factorypattern.example.impl;

import com.zhengq.designpattern._02factorypattern.example.Human;

/**
 * 白色人种
 * 
 * @ClassName: WhiteHuman
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月3日 下午3:44:48
 */
public class WhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("白色人种的皮肤颜色是白色的");

	}

	@Override
	public void talk() {
		System.out.println("白色人种说话，一般说的都是单子节");

	}

}
