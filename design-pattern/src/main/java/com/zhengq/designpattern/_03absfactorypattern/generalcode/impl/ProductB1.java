package com.zhengq.designpattern._03absfactorypattern.generalcode.impl;

import com.zhengq.designpattern._03absfactorypattern.generalcode.AbstractProductB;

/**
 * 产品B1的实现类
 * 
 * @ClassName: ProductB1
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月4日 上午10:22:37
 */
public class ProductB1 extends AbstractProductB {

	@Override
	public void doSomething() {
		System.out.println("这是产品B1的实现方法");
	}

}
