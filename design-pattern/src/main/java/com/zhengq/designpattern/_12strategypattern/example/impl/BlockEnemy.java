/**  
 * @Title: BlockEnemy.java  
 * @Package com.zgq.design._12strategypattern.example.impl  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._12strategypattern.example.impl;

import com.zhengq.designpattern._12strategypattern.example.IStrategy;

/**
 * 具体策略角色(孙夫人断后)
 * 
 * @ClassName: BlockEnemy
 * @Description: TODO
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public class BlockEnemy implements IStrategy {

	/*
	 * <p>Title: operate</p> <p>Description: </p>
	 * 
	 * @see IStrategy#operate()
	 */
	@Override
	public void operate() {
		System.out.println("孙夫人断后，挡住追兵");
	}

}
