package com.zhengq.designpattern._02factorypattern.extend.multifactory;

import com.zhengq.designpattern._02factorypattern.example.Human;

public class NvWa {
	public static void main(String[] args) {
		// 声明阴阳八卦炉
		// 女娲第一次造人，火候不足，于是白人生产了
		System.out.println("--造出的第一批人是白色人种--");
		Human whiteHuman = (new WhiteHumanFactory()).createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();

		// 女娲第二次造人,火候过足，于是黑人产生了
		System.out.println("\n--造出的第二批人是黑色人种--");
		Human blackHuman = (new BlackHumanFactory()).createHuman();
		blackHuman.getColor();
		blackHuman.talk();

		// 第三次造人，火候刚刚好，于是黄色人种产生了
		System.out.println("\n--造出的第三批人是黄色人种--");
		Human yellowHuman = (new YellowHumanFactory()).createHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
