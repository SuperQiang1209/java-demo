package com.zhengq.designpattern._01singletonpattern.extend;

/**
 * 大臣类
 * 
 * @ClassName: Minister
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月3日 下午5:00:53
 */
public class Minister {
	public static void main(String[] args) {
		int ministerNum = 5;

		for (int i = 0; i < ministerNum; i++) {
			Emperor emperor = Emperor.getInstance();
			System.out.println("第" + (i + 1) + "个大臣参拜的是:");
			emperor.say();
		}
	}
}
