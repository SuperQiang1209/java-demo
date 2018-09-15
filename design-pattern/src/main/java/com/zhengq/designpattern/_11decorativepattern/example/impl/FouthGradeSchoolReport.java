package com.zhengq.designpattern._11decorativepattern.example.impl;

import com.zhengq.designpattern._11decorativepattern.example.SchoolReport;

/**
 * 四年级成绩单
 * 
 * @ClassName: FouthGradeSchoolReport
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午5:28:19
 */
public class FouthGradeSchoolReport extends SchoolReport {

	// 我的成绩单
	@Override
	public void report() {
		// 成绩单的格式是这个样子的
		System.out.println("尊敬的xxx家长:");
		System.out.println("	......");
		System.out.println("	语文 62	数学 65	体育 98	自然 63");
		System.out.println("	......");
		System.out.println("			家长签字:			");
	}

	// 家长签字
	@Override
	public void sign(String name) {
		System.out.println("家长签字为:" + name);
	}
}
