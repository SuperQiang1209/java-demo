package com.zhengq.designpattern._09commandpattern.example.impl;

import com.zhengq.designpattern._09commandpattern.example.Group;

public class CodeGroup extends Group {

	/**
	 * 客户要求代码组过去和他们谈
	 * <p>
	 * Title: find
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @see Group#find()
	 */
	@Override
	public void find() {
		System.out.println("找到代码组");
	}

	/**
	 * 客户要去增加一项功能
	 * <p>
	 * Title: add
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @see Group#add()
	 */
	@Override
	public void add() {
		System.out.println("客户要求增加一项功能...");
	}

	/**
	 * 客户要去删除一项功能
	 * <p>
	 * Title: delete
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @see Group#delete()
	 */
	@Override
	public void delete() {
		System.out.println("客户要求删除一项功能...");
	}

	/**
	 * 客户要去修改一项功能
	 * <p>
	 * Title: change
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @see Group#change()
	 */
	@Override
	public void change() {
		System.out.println("客户要求修改一项功能");
	}

	/**
	 * 客户要去给变更计划
	 * <p>
	 * Title: plan
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @see Group#plan()
	 */
	@Override
	public void plan() {
		System.out.println("客户要求代码变更计划");
	}

}
