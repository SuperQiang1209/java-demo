package com.zhengq.designpattern._01singletonpattern.example;

/**
 * 单例模式示例:皇帝类
 * 
 * @author Zhenggq
 *
 */
public class Emperor {
	private static final Emperor emperor = new Emperor();

	private Emperor() {
	};

	public static Emperor getInstance() {
		return emperor;
	}

	public static void say() {
		System.out.println("我是皇帝某某某...");
	}
}
