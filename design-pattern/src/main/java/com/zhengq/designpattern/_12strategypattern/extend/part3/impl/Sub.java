/**  
 * @Title: Sub.java  
 * @Package com.zgq.design._12strategypattern.extend.part3.impl  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._12strategypattern.extend.part3.impl;

import com.zhengq.designpattern._12strategypattern.extend.part3.Calculator;

/**
 * @ClassName: Sub
 * @Description: TODO
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public class Sub implements Calculator {

	/*
	 * 减法运算 <p>Title: exec</p> <p>Description: </p>
	 * 
	 * @param a
	 * 
	 * @param b
	 * 
	 * @return
	 * 
	 * @see Calculator#exec(int,
	 * int)
	 */
	@Override
	public int exec(int a, int b) {
		return a - b;
	}

}
