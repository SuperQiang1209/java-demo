package com.zhengq.designpattern._09commandpattern.extend.impl;

import com.zhengq.designpattern._09commandpattern.extend.Command;

/**
 * 增加需求的命令
 * 
 * @ClassName: AddRequirementComand
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 上午11:19:18
 */
public class AddRequirementComand extends Command {

	/**
	 * 执行增加一项需求的命令
	 * <p>
	 * Title: execute
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @see Command#execute()
	 */
	@Override
	public void execute() {
		// 找到需求组
		super.rg.find();
		// 增加一份需求
		super.rg.add();
		// 给出计划
		super.rg.plan();
	}

}
