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
 * 具体的装饰角色
 * 
 * @ClassName: ConcreteDecorator1
 * @Description: 
 *               ConcreteDecoratorA和ConcreteDecoratorB是两个具体的装饰类，你要把你最核心的、最原始的、最基本的东西装饰成其他东西
 *               ，上面的例子就是把一个比较平庸的成绩单装饰成家长认可的成绩单。
 * 
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public class ConcreteDecorator1 extends Decorator {

	/**
	 * 创建一个新的实例 ConcreteDecorator1.
	 * 
	 * @param _component
	 */
	public ConcreteDecorator1(Component _component) {
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
	private void method1() {
		System.out.println("method1 修饰");
	}

	/**
	 * 重写父类的operate方法
	 */
	@Override
	public void operate() {
		this.method1();
		super.operate();
	}

}
