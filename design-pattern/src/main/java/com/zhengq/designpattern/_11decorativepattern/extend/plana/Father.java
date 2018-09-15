package com.zhengq.designpattern._11decorativepattern.extend.plana;

import com.zhengq.designpattern._11decorativepattern.example.SchoolReport;

/**
 * 老爸查看修饰后的成绩单
 * 
 * @ClassName: Father
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午5:47:42
 */
public class Father {
	public static void main(String[] args) {
		// 把美化过的成绩单拿过来
		SchoolReport sr = new SugarFouthGradeSchoolReport();
		// 看成绩单
		sr.report();
		// 然后老爸，一看很开心，就签名了
		sr.sign("老三");// 我叫小三，老爸当然是老三
	}
}
