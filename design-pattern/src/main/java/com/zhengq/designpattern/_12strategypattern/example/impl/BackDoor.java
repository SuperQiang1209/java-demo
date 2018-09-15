/**  
 * @Title: BackDoor.java  
 * @Package com.zgq.design._12strategypattern.example.impl  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._12strategypattern.example.impl;

import com.zhengq.designpattern._12strategypattern.example.IStrategy;

/**
 * 具体策略角色(乔国老开后门)
 * 
 * @ClassName: BackDoor
 * @Description: TODO
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public class BackDoor implements IStrategy {

	/*
	 * <p>Title: operate</p> <p>Description: </p>
	 * 
	 * @see IStrategy#operate()
	 */
	@Override
	public void operate() {
		System.out.println("找乔国老帮忙,让吴国太给孙权施加压力");
	}

}
