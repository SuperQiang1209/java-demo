/**  
 * @Title: Calculator.java  
 * @Package com.zgq.design._12strategypattern.extend.part4  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._12strategypattern.extend.part4;

/**
 * 策略枚举
 * 
 * @ClassName: Calculator
 * @Description: TODO
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public enum Calculator {
	ADD("+") {
		public int exec(int a, int b) {
			return a + b;
		}
	},
	SUB("-") {
		public int exec(int a, int b) {
			return a - b;
		}
	};

	public abstract int exec(int a, int b);

	// 运算符
	private String value = "";

	private Calculator(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
