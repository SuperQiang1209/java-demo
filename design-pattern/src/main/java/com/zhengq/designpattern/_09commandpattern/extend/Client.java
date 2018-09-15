package com.zhengq.designpattern._09commandpattern.extend;

import com.zhengq.designpattern._09commandpattern.extend.impl.AddRequirementComand;
import com.zhengq.designpattern._09commandpattern.extend.impl.DeletePageCommand;

/**
 * 场景类
 * 
 * @ClassName: Client
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 上午11:27:46
 */
public class Client {
	public static void main(String[] args) {
		// 定义我们的接头人
		Invoker xiaoSan = new Invoker();
		// /客户要求增加一项需求
		System.out.println("----------客户要求增加一项需求----------");
		// 客户给我们下命令来
		Command command = new AddRequirementComand();
		// 接头人收到命令
		xiaoSan.setCommand(command);
		// 接头人执行命令
		xiaoSan.action();

		System.out.println("----------客户要求删除一项页面----------");
		Command command2 = new DeletePageCommand();
		// 接头人收到命令
		xiaoSan.setCommand(command2);
		// 接头人执行命令
		xiaoSan.action();
	}
}
