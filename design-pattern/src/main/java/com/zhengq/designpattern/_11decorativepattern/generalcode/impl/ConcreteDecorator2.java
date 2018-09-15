/**  
 * @Title: ConcreteDecorator1.java  
 * @Package com.zgq.design._11decorativepattern.generalcode.impl  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._11decorativepattern.generalcode.impl;

import com.zhengq.designpattern._11decorativepattern.generalcode.Component;
import com.zhengq.designpattern._11decorativepattern.generalcode.Decorator;

/**
 * @ClassName: ConcreteDecorator1
 * @Description: TODO
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public class ConcreteDecorator2 extends Decorator {

	/**
	 * 创建一个新的实例 ConcreteDecorator1.
	 * 
	 * @param _component
	 */
	public ConcreteDecorator2(Component _component) {
		super(_component);
	}

	/**
	 * 定义自己的修饰方法
	 * 
	 * @Title: method1
	 * @Description: TODO
	 * @param:
	 * @return: void
	 * @throws:
	 */
	private void method2() {
		System.out.println("method2 修饰");
	}

	/**
	 * 重写父类的operate方法
	 */
	@Override
	public void operate() {
		this.method2();
		super.operate();
	}

}
