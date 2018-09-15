package com.zhengq.designpattern._05builderpattern.example.impl;

import com.zhengq.designpattern._05builderpattern.example.CarModel;

/**
 * 宝马模型代码
 * 
 * @ClassName: BMWModel
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月4日 下午3:36:04
 */
public class BMWModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("宝马车跑起来是这个样子的...");

	}

	@Override
	protected void stop() {
		System.out.println("宝马车应该这样停车...");

	}

	@Override
	protected void alarm() {
		System.out.println("宝马车的喇叭声音是这个样子的...");
	}

	@Override
	protected void engineBoom() {
		System.out.println("宝马车的引擎是这个声音的...");

	}

}
