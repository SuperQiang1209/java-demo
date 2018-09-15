package com.zhengq.designpattern._09commandpattern.extend;

import com.zhengq.designpattern._09commandpattern.example.impl.CodeGroup;
import com.zhengq.designpattern._09commandpattern.example.impl.PageGroup;
import com.zhengq.designpattern._09commandpattern.example.impl.RequirementGroup;

/**
 * 抽象命令类
 * 
 * @ClassName: Command
 * @Description: 客户发给我们的命令，定义三个工作组的成员变量，供子类使用；定义一个抽象方法execute，由子类来实现。
 * @author: Zhenggq
 * @date: 2018年5月8日 上午11:10:50
 */
public abstract class Command {
	// 把三个组定义好,子类可以直接使用
	protected RequirementGroup rg = new RequirementGroup();// 需求组
	protected PageGroup pg = new PageGroup();// 美工组
	protected CodeGroup cg = new CodeGroup();// 代码组

	// 只有一个方法,你要我做什么事情
	public abstract void execute();
}
