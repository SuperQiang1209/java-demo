package com.zhengq.designpattern._05builderpattern.example.impl;

import com.zhengq.designpattern._05builderpattern.example.CarModel;

/**
 * 奔驰模型
 * 
 * @ClassName: BenzModel
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月4日 下午3:32:43
 */
public class BenzModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("奔驰车跑起来是这个样子的...");

	}

	@Override
	protected void stop() {
		System.out.println("奔驰车应该这样停车...");

	}

	@Override
	protected void alarm() {
		System.out.println("奔驰车的喇叭声音是这个样子的...");

	}

	@Override
	protected void engineBoom() {
		System.out.println("奔驰车的引擎是这个声音的...");
	}

}
