package com.zhengq.designpattern._09commandpattern.extend;

/**
 * 负责人
 * 
 * @ClassName: Invoker
 * @Description: 项目接头负责人，setComand接收客户发给我们的命令，action方法是执行客户的命令（方法名写成是action，
 *               与command的execute区分开，避免混淆）。
 * 
 * @author: Zhenggq
 * @date: 2018年5月8日 上午11:25:36
 */
public class Invoker {
	// 什么命令
	private Command command;

	// 客户发出命令
	public void setCommand(Command command) {
		this.command = command;
	}

	// 执行客户的命令
	public void action() {
		this.command.execute();
	}
}
