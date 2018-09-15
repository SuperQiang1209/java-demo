package com.zhengq.designpattern._01singletonpattern.example;

public class Minister {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			Emperor emperor = Emperor.getInstance();
			emperor.say();
		}
		// 每天都是同一个皇帝
	}
}
