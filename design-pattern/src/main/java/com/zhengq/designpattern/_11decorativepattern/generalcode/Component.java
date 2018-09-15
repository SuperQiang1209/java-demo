/**  
 * @Title: Component.java  
 * @Package com.zgq.design._11decorativepattern.generalcode  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._11decorativepattern.generalcode;

/**
 * 抽象构建
 * 
 * @ClassName: Component
 * @Description: Component是一个接口或者是抽象类，就是定义我们最核心的对象，也就是最原始的对象，如上面的成绩单。
 * 
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public abstract class Component {

	/**
	 * 抽象方法
	 * 
	 * @Title: operate
	 * @Description: TODO
	 * @param:
	 * @return: void
	 * @throws:
	 */
	public abstract void operate();
}
