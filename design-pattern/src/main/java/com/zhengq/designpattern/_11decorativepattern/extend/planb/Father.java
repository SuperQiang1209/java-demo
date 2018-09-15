package com.zhengq.designpattern._11decorativepattern.extend.planb;

import com.zhengq.designpattern._11decorativepattern.example.SchoolReport;
import com.zhengq.designpattern._11decorativepattern.example.impl.FouthGradeSchoolReport;
import com.zhengq.designpattern._11decorativepattern.extend.planb.impl.HighScoreDecorator;
import com.zhengq.designpattern._11decorativepattern.extend.planb.impl.SortDecorator;

/**
 * 老爸查看修饰后的成绩单
 * 
 * @ClassName: Father
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午6:05:44
 */
public class Father {
	public static void main(String[] args) {
		// 把成绩单拿过来
		SchoolReport sr;
		// 原装的成绩单
		sr = new FouthGradeSchoolReport();
		// 加了最高分说明的成绩单
		sr = new HighScoreDecorator(sr);
		// 又加了成绩排名的说明
		sr = new SortDecorator(sr);
		// 看成绩单
		sr.report();
		// 然后老爸一看,很开心，就签名了
		sr.sign("老三");

	}
}
