package com.zhengq.designpattern._03absfactorypattern.generalcode.impl;

import com.zhengq.designpattern._03absfactorypattern.generalcode.AbstractProductB;

/**
 * 产品B2的实现类型
 * @ClassName:       ProductB2
 * @Description:     TODO
 * @author:          Zhenggq
 * @date:            2018年5月4日        上午10:23:08
 */
public class ProductB2 extends AbstractProductB {

	@Override
	public void doSomething() {
		System.out.println("这是产品B2的实现方法");
	}

}
