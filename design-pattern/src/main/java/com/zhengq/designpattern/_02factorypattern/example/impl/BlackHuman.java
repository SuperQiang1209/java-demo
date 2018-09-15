package com.zhengq.designpattern._02factorypattern.example.impl;

import com.zhengq.designpattern._02factorypattern.example.Human;

/**
 * 黑色人种
 * @ClassName:       BlackHuman
 * @Description:     TODO
 * @author:          Zhenggq
 * @date:            2018年5月3日        下午3:44:37
 */
public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黑色人种的皮肤颜色是黑色的!");
	}

	@Override
	public void talk() {
		System.out.println("黑人会说话,一般人听不懂。");
	}

}
