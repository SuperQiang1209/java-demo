package com.zhengq.designpattern._09commandpattern.generalcode;

/**
 * 调用者Invoker类
 * 
 * @ClassName: Invoker
 * @Description: 接收到命令，并执行命令。在例子中，我（项目经理）就是这个角色。
 * @author: Zhenggq
 * @date: 2018年5月8日 上午11:40:44
 */
public class Invoker {
	private Command command;

	// 受气包,接收命令
	public void setCommand(Command _command) {
		this.command = _command;
	}

	public void action() {
		this.command.execute();
	}

}
