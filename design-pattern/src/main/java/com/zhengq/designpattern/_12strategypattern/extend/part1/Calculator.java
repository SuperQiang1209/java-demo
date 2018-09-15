/**  
 * @Title: Calculator.java  
 * @Package com.zgq.design._12strategypattern.extend.part1  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._12strategypattern.extend.part1;

/**
 * 最直接的加减法
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

	public int execl(int a, int b, String symbol) {
		int result = 0;
		if (symbol.equals(ADD_SYMBOL)) {
			result = this.add(a, b);
		} else if (symbol.equals(SUB_SYMBOL)) {
			result = this.sub(a, b);
		}
		return result;
	}

	// 加法运算
	private int add(int a, int b) {
		return a + b;
	}

	// 减法运算
	private int sub(int a, int b) {
		return a - b;
	}
}
