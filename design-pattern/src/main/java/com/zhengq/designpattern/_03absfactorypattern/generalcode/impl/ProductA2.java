package com.zhengq.designpattern._03absfactorypattern.generalcode.impl;

import com.zhengq.designpattern._03absfactorypattern.generalcode.AbstractProductA;

/**
 * 产品A2的实现类
 * 
 * @ClassName: ProductA2
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月4日 上午10:04:31
 */
public class ProductA2 extends AbstractProductA {

	@Override
	public void doSomething() {
		System.out.println("这是产品A2的实现方法");
	}

}
