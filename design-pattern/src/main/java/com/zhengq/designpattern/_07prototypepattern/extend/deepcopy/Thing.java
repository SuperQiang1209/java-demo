package com.zhengq.designpattern._07prototypepattern.extend.deepcopy;

import java.util.ArrayList;

/**
 * 深拷贝
 * 
 * @ClassName: Thing
 * @Description: 两个对象之间没有任何的瓜葛了，你修改你的，我修改我的，不相互影响，这种拷贝就叫做深拷贝。
 * @author: Zhenggq
 * @date: 2018年5月7日 下午4:20:09
 */
public class Thing implements Cloneable {
	// 定义一个私有变量
	private ArrayList<String> arrayList = new ArrayList<String>();

	public Thing clone() {
		Thing thing = null;
		try {
			thing = (Thing) super.clone();
			thing.arrayList = (ArrayList<String>) this.arrayList.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return thing;
	}

	public void setValue(String val) {
		this.arrayList.add(val);
	}

	public ArrayList<String> getValue() {
		return this.arrayList;
	}
}
