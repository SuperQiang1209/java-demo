package com.zhengq.designpattern._03absfactorypattern.generalcode;

/**
 * 抽象工厂类
 * 
 * @ClassName: AbstractCreator
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月4日 上午10:18:55
 */
public abstract class AbstractCreator {
	
	public abstract AbstractProductA createProductA();
	public abstract AbstractProductB createProductB();
}
