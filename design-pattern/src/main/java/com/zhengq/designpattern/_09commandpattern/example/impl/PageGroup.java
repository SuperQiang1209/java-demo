package com.zhengq.designpattern._09commandpattern.example.impl;

import com.zhengq.designpattern._09commandpattern.example.Group;

/**
 * 美工组
 * 
 * @ClassName: PageGroup
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 上午10:43:00
 */
public class PageGroup extends Group {

	/**
	 * 首先这个美工组应该能找到吧，要不你跟谁谈?
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
		System.out.println("找到美工组...");
	}

	/**
	 * 美工被要求增加一个页面
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
		System.out.println("客户要求增加一个页面...");
	}

	/**
	 * 甲方是老大，要求删除一些页面
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
		System.out.println("客户要求删除一个页面...");
	}

	/**
	 * 客户要求对现有界面做修改
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
		System.out.println("客户要求修改一个页面...");
	}

	/**
	 * 所有的增、删、改都要出给计划
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
		System.out.println("客户要求页面变更计划...");
	}

}
