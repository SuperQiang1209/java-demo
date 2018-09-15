package com.zhengq.designpattern._08mediatorpattern.generalcode.impl;

import com.zhengq.designpattern._08mediatorpattern.generalcode.Mediator;

/**
 * 通用中介者
 * 
 * @ClassName: ConcreteMediator
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 上午10:20:26
 */
public class ConcreteMediator extends Mediator {

	@Override
	public void doSomething1() {
		// 调用同事类的方法，只要是public方法都可以调用
		super.c1.selfMetod1();
		super.c2.selfMetod2();
	}

	@Override
	public void doSomething2() {
		super.c1.selfMetod1();
		super.c2.selfMetod2();
	}

}
