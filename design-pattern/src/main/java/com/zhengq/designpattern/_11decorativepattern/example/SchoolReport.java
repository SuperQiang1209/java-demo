package com.zhengq.designpattern._11decorativepattern.example;

/**
 * 抽象成绩单
 * 
 * @ClassName: SchoolReport
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午5:25:31
 */
public abstract class SchoolReport {
	// 成绩单主要展示的就是你的成绩情况
	public abstract void report();

	// 成绩单要家长签字,这个最要命的
	public abstract void sign(String name);
}
