package com.zhengq.designpattern._03absfactorypattern.example;

import com.zhengq.designpattern._03absfactorypattern.example.impl.FemaleFactory;
import com.zhengq.designpattern._03absfactorypattern.example.impl.MaleFactory;

/**
 * 女娲重造人类
 * 
 * @ClassName: NvWa
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月4日 上午9:34:21
 */
public class NvWa {
	public static void main(String[] args) {
		// 第一条生产线,男性生产线
		HumanFactory maleHumanFactory = new MaleFactory();
		// 第二条生产线,女性生产线
		FemaleFactory femaleHumanFactory = new FemaleFactory();
		// 生产线建立完毕,开始生产人了：
		Human maleyeHuman = maleHumanFactory.createYellowHuman();
		System.out.println("--生产一个黄色女性--");
		maleyeHuman.getColor();
		maleyeHuman.talk();
		maleyeHuman.getSex();
		Human femaleHuman = femaleHumanFactory.createYellowHuman();
		System.out.println("--生产一个黄色男性--");
		femaleHuman.getColor();
		femaleHuman.talk();
		femaleHuman.getSex();
		
		
		/**
		 * ......
		 *  后面继续创建
		 */
	}
}
