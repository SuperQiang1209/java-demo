package com.zhengq.designpattern._02factorypattern.example;

/**
 * 抽象人类创建工厂
 * 
 * @ClassName: AbstractHumanFactory
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月3日 下午3:46:10
 */
public abstract class AbstractHumanFactory {
	public abstract <T extends Human> T createHuman(Class<T> c);
}
