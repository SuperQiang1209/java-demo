package com.zhengq.designpattern._09commandpattern.extend.impl;

import com.zhengq.designpattern._09commandpattern.extend.Command;

/**
 * 删除页面的命令
 * 
 * @ClassName: DeletePageCommand
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 上午11:21:35
 */
public class DeletePageCommand extends Command {

	/**
	 * 执行删除一个页面的命令
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
		// 找到页面组
		super.pg.find();
		// 删除一个页面
		super.pg.delete();
		// 给出计划
		super.pg.plan();
	}

}
