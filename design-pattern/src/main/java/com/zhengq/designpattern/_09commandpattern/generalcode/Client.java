package com.zhengq.designpattern._09commandpattern.generalcode;

import com.zhengq.designpattern._09commandpattern.generalcode.impl.ConcreteCommand1;
import com.zhengq.designpattern._09commandpattern.generalcode.impl.ConcreteReciver1;

/**
 * 场景类
 * 
 * @ClassName: Client
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 上午11:44:34
 */
public class Client {
	public static void main(String[] args) {
		// 首先声明调用者Invoker
		Invoker invoker = new Invoker();
		// 定义接收者
		Receiver reveiver = new ConcreteReciver1();
		// 定义一个发送给接收者的命令
		Command command = new ConcreteCommand1(reveiver);
		// 把命令交给调用者去执行
		invoker.setCommand(command);
		invoker.action();
	}
}
