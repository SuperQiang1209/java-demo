/**  
 * @Title: Decorator.java  
 * @Package com.zgq.design._11decorativepattern.generalcode  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._11decorativepattern.generalcode;

/**
 * 抽象装饰者
 * 
 * @ClassName: Decorator
 * @Description: 装饰角色通常是一个抽象类<br/>
 *               一般是一个抽象类，做什么用呢？实现接口或者抽象方法，它里面可不一定有抽象的方法呀，
 *               在它的属性里必然有一个private变量指向Component抽象构件。
 * 
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public abstract class Decorator extends Component {

	private Component component = null;

	public Decorator(Component _component) {
		this.component = _component;
	}

	/*
	 * <p>Title: operate</p> <p>Description: </p>
	 * 
	 * @see Component#operate()
	 */
	@Override
	public void operate() {
		// TODO Auto-generated method stub
		this.component.operate();
	}

}
