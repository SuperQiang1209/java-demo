package com.zhengq.designpattern._09commandpattern.generalcode.impl;

import com.zhengq.designpattern._09commandpattern.generalcode.Command;
import com.zhengq.designpattern._09commandpattern.generalcode.Receiver;

/**
 * 具体的Command类
 * 
 * @ClassName: ConcreteCommand1
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 上午11:37:34
 */
public class ConcreteCommand1 extends Command {
	// 对哪个Receiver类进行命令处理
	private Receiver receiver;

	// 构造函数传递接收者
	public ConcreteCommand1(Receiver _receiver) {
		this.receiver = _receiver;
	}

	// 必须实现一个命令
	@Override
	public void execute() {
		// 业务处理
		this.receiver.doSomething();
	}

}
