/**  
 * @Title: ConcreteComponent.java  
 * @Package com.zgq.design._11decorativepattern.generalcode.impl  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._11decorativepattern.generalcode.impl;

import com.zhengq.designpattern._11decorativepattern.generalcode.Component;

/**
 * 具体构建
 * 
 * @ClassName: ConcreteComponent
 * @Description: ConcreteComponent是最核心、最原始、最基本的接口或抽象类的实现，你要装饰的就是它。
 * 
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public class ConcreteComponent extends Component {

	/*
	 * <p>Title: operate</p> <p>Description: </p>
	 * 
	 * @see Component#operate()
	 */
	@Override
	public void operate() {
		System.out.println("do Something");
	}

}
