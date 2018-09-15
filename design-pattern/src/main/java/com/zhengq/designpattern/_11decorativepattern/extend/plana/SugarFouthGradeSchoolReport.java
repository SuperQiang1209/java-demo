package com.zhengq.designpattern._11decorativepattern.extend.plana;

import com.zhengq.designpattern._11decorativepattern.example.impl.FouthGradeSchoolReport;

/**
 * 修饰成绩单
 * 
 * @ClassName: SugarFouthGradeSchoolReport
 * @Description: 通过重写report方法来修饰成绩单<br/>
 *               通过继承情况确实出现了问题，类爆炸，类的数量激增，光写这些类不累死你才怪，而且还要想想以后维护怎么办
 * @author: Zhenggq
 * @date: 2018年5月8日 下午5:42:17
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {

	// 首先要定义你要美化的方法,先给老爸说学校最高成绩
	private void reportHighScore() {
		System.out.println("这次考试语文最高是75,数学是78，自然是80");
	}

	// 在老爸看完毕成绩单后，我再汇报学校的排名情况
	private void reportSort() {
		System.out.println("我是排名第38名...");
	}

	// 由于汇报的内容已经发生变更，那所以要重写父类
	@Override
	public void report() {
		this.reportHighScore();// 先说最高成绩
		super.report();// 然后老爸看成绩单
		this.reportSort();// 然后告诉老爸学校排名
	}

}
