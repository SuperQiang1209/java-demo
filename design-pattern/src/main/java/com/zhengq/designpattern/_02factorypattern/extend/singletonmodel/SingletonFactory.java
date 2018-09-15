package com.zhengq.designpattern._02factorypattern.extend.singletonmodel;

import java.lang.reflect.Constructor;

/**
 * 负责生产单例的工厂类
 * 
 * @ClassName: SingletonFactory
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月3日 下午5:20:30
 */
public class SingletonFactory {
	private static Singleton singleton;
	static {
		try {
			Class cl = Class.forName(Singleton.class.getName());
			// 获得无参构造函数
			Constructor constructor = cl.getDeclaredConstructor();
			// 设置无参数构造是可访问的
			constructor.setAccessible(true);
			// 产生一个实例对象
			singleton = (Singleton) constructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Singleton getSingleton() {
		return singleton;
	}
}
