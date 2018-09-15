package com.zhengq.designpattern._05builderpattern.example.impl;

import java.util.ArrayList;

import com.zhengq.designpattern._05builderpattern.example.CarBuilder;
import com.zhengq.designpattern._05builderpattern.example.CarModel;

/**
 * 奔驰车组装者
 * 
 * @ClassName: BenzBuilder
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月4日 下午4:02:28
 */
public class BenzBuilder extends CarBuilder {
	private BenzModel benz = new BenzModel();

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.benz.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

}
