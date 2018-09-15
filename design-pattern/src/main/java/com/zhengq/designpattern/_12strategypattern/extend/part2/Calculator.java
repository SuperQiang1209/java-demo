/**  
 * @Title: Calculator.java  
 * @Package com.zgq.design._12strategypattern.extend.part2  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._12strategypattern.extend.part2;

/**
 * 简化算法
 * 
 * @ClassName: Calculator
 * @Description: TODO
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public class Calculator {

	// 加符号
	private final static String ADD_SYMBOL = "+";
	// 减符号
	private final static String SUB_SYMBOL = "-";

	public int exec(int a, int b, String symbol) {
		return symbol.equals(ADD_SYMBOL) ? a + b : a - b;
	}

}
