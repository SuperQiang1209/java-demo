/**  
 * @Title: Context.java  
 * @Package com.zgq.design._12strategypattern.extend.part3  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._12strategypattern.extend.part3;

/**
 * @ClassName: Context
 * @Description: TODO
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public class Context {
	private Calculator cal = null;

	public Context(Calculator _calculator) {
		this.cal = _calculator;
	}

	public int exec(int a, int b, String symbol) {
		return this.cal.exec(a, b);
	}
}
