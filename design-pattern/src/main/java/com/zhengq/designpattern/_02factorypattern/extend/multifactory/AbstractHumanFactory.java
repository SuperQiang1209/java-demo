package com.zhengq.designpattern._02factorypattern.extend.multifactory;

import com.zhengq.designpattern._02factorypattern.example.Human;

/**
 * 多工厂模式的抽象工厂类
 * 
 * @ClassName: AbstractHumanFactory
 * @Description: 
 * <p>
 *  ▪   当我们在做一个比较复杂的项目时，经常会遇到初始化一个对象很耗费精力的情况，所有的产品类都放到一个工厂方法中进行初始化会使代码结构不清晰。<br>
 *  ▪   考虑到需要结构清晰，我们就为每个产品定义一个创造者，然后由调用者自己去选择与哪个工厂方法关联。<br>
 * @author: Zhenggq
 * @date: 2018年5月3日 下午4:29:56
 */
public abstract class AbstractHumanFactory {
	public abstract Human createHuman();
}
