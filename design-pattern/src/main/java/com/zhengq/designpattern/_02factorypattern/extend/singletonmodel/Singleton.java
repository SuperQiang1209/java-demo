package com.zhengq.designpattern._02factorypattern.extend.singletonmodel;

/**
 * 替代单例模式
 * 
 * @ClassName: Singleton
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月3日 下午5:15:02
 */
public class Singleton {
	private static final Singleton singleton = new Singleton();

	// 不允许通过new产生一个对象
	private Singleton() {

	}

	public static void doSomething() {
		// 业务逻辑
	}
}
