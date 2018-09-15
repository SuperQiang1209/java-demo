package com.zhengq.designpattern._11decorativepattern.example;

import com.zhengq.designpattern._11decorativepattern.example.impl.FouthGradeSchoolReport;

/**
 * 老爸查看成绩单
 * 
 * @ClassName: Father
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午5:32:57
 */
public class Father {
	public static void main(String[] args) {
		// 把成绩单拿出来
		SchoolReport sr = new FouthGradeSchoolReport();
		// 看成绩单
		sr.report();
		// 签名?休想!
	}
}
