package com.zhengq.designpattern._03absfactorypattern.generalcode.impl;

import com.zhengq.designpattern._03absfactorypattern.generalcode.AbstractProductA;

/**
 * 产品A1的实现类
 * 
 * @ClassName: ProductA1
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月4日 上午10:03:45
 */
public class ProductA1 extends AbstractProductA {

	@Override
	public void doSomething() {
		System.out.println("这是产品A1的实现方法");
	}

}
