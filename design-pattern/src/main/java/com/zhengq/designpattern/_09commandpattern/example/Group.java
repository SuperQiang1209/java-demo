package com.zhengq.designpattern._09commandpattern.example;

/**
 * 抽象组
 * 
 * @ClassName: Group
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 上午10:35:38
 */
public abstract class Group {
	// 甲乙双方分开办公，如果你要和某个组讨论，你首先找到这个组
	public abstract void find();

	// 被要求增加的功能
	public abstract void add();

	// 被要求删除功能
	public abstract void delete();

	// 被要求修改的功能
	public abstract void change();

	// 被要求给出所有的变更计划
	public abstract void plan();
}
