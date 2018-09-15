package com.zhengq.designpattern._05builderpattern.example.impl;

import java.util.ArrayList;

import com.zhengq.designpattern._05builderpattern.example.CarBuilder;
import com.zhengq.designpattern._05builderpattern.example.CarModel;

/**
 * 宝马车组装者
 * 
 * @ClassName: BMWBuilder
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月4日 下午4:02:38
 */
public class BMWBuilder extends CarBuilder {
	private BMWModel bmw = new BMWModel();

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.bmw.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.bmw;
	}

}
