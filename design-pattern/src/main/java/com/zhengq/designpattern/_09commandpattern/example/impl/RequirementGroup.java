package com.zhengq.designpattern._09commandpattern.example.impl;

import com.zhengq.designpattern._09commandpattern.example.Group;

/**
 * 需求组
 * 
 * @ClassName: RequirementGroup
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 上午10:39:24
 */
public class RequirementGroup extends Group {

	/**
	 * 客户要求需求者过去和他们谈
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
		System.out.println("找到需求组...");
	}

	/**
	 * 客户要求增加一项需求
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
		System.out.println("客户要求增加一项需求...");
	}

	/**
	 * 客户要求修改一项需求
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
		System.out.println("客户要求修改一项需求...");
	}

	/**
	 * 客户要求删除一项需求
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
		System.out.println("客户要求删除一项需求...");
	}

	/**
	 * 客户要求给出变更计划
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
		System.out.println("客户要求变更计划");
	}

}
