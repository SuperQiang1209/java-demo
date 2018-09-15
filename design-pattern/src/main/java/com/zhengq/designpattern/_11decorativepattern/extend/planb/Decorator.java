package com.zhengq.designpattern._11decorativepattern.extend.planb;

import com.zhengq.designpattern._11decorativepattern.example.SchoolReport;

/**
 * 修饰的抽象类
 * 
 * @ClassName: Decorator
 * @Description: Decorator抽象类的目的很简单，就是要让子类来封装SchoolReport的子类，怎么封装？重写report方法！
 * @author: Zhenggq
 * @date: 2018年5月8日 下午5:53:26
 */
public abstract class Decorator extends SchoolReport {

	// 首先我要知道是哪些成绩单
	private SchoolReport sr;

	// 构造函数，传递成绩单过来
	public Decorator(SchoolReport sr) {
		this.sr = sr;
	}

	// 成绩单还是要被看到的
	@Override
	public void report() {
		this.sr.report();
	}

	// 看完还是要签字的
	@Override
	public void sign(String name) {
		this.sr.sign(name);
	}

}
