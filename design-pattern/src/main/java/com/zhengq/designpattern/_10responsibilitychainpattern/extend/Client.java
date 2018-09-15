package com.zhengq.designpattern._10responsibilitychainpattern.extend;

import java.util.ArrayList;
import java.util.Random;

import com.zhengq.designpattern._10responsibilitychainpattern.example.IWomen;
import com.zhengq.designpattern._10responsibilitychainpattern.extend.impl.Father;
import com.zhengq.designpattern._10responsibilitychainpattern.extend.impl.Husband;
import com.zhengq.designpattern._10responsibilitychainpattern.extend.impl.Son;
import com.zhengq.designpattern._10responsibilitychainpattern.extend.impl.Women;

public class Client {
	public static void main(String[] args) {
		// 随便挑选几个女性
		Random rand = new Random();
		ArrayList<IWomen> list = new ArrayList<IWomen>();
		for (int i = 0; i < 5; i++) {
			list.add(new Women(rand.nextInt(4), "我要出去逛街"));
		}

		// 定义三个请示对象
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		// 设置请示顺序
		father.setNext(husband);
		husband.setNext(son);
		for (IWomen women : list) {
			father.HandlerMessage(women);
		}
	}
}
