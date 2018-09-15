package com.zhengq.designpattern._02factorypattern.extend.simplefactory;

import com.zhengq.designpattern._02factorypattern.example.Human;

/**
 * 简单工厂模式中的工厂类
 * 
 * @ClassName: HumanFactory
 * @Description: 一个模块仅需要一个工厂类，没有必要把它产生出来，使用静态的方法就可以了
 * @author: Zhenggq
 * @date: 2018年5月3日 下午4:22:03
 */
public class HumanFactory {
	public static <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("人类生成错误!");
		}
		return (T) human;
	}
}
