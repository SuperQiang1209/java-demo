/**  
 * @Title: Client.java  
 * @Package com.zgq.design._12strategypattern.extend.part4  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._12strategypattern.extend.part4;

/**
 * @ClassName: Client
 * @Description: TODO
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public class Client {
	public static void main(String[] args) {
		System.out.println(Calculator.ADD.exec(10, 30));
	}
}
