/**  
 * @Title: Client.java  
 * @Package com.zgq.design._12strategypattern.extend.part1  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._12strategypattern.extend.part1;

import java.util.Arrays;

/**
 * 场景类
 * 
 * @ClassName: Client
 * @Description: TODO
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public class Client {
	public static void main(String[] args) {
		// 输入的两个参数是数字
		int a = Integer.parseInt(args[0]);
		// 符号
		String symbol = args[1];
		int b = Integer.parseInt(args[2]);
		System.out.println("输入的参数为:" + Arrays.toString(args));
		// 生成运算器
		Calculator cal = new Calculator();
		System.out.println("运行结果为:" + a + symbol + b + "=" + cal.execl(a, b, symbol));
	}
}
