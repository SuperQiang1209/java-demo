package com.zhengq.designpattern._03absfactorypattern.generalcode;

/**
 * 抽象产品类A
 * 
 * @ClassName: AbstractProductA
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月4日 上午10:01:26
 */
public abstract class AbstractProductA {
	
	// 每个产品共有的方法
	public void shareMethod() {
	}

	// 每个产品相同方法,不同实现
	public abstract void doSomething();
}
