package com.zhengq.designpattern._07prototypepattern.extend.shallowcopy;

import java.util.ArrayList;

/**
 * 浅拷贝
 * 
 * @ClassName: Thing
 * @Description: 
 *               Object类提供的方法clone只是拷贝本对象，其对象内部的数组、引用对象等都不拷贝，还是指向原生对象的内部元素地址，这种拷贝就叫做浅拷贝
 *               。
 * @author: Zhenggq
 * @date: 2018年5月7日 下午4:10:50
 */
public class Thing implements Cloneable {
	// 定义一个私有变量
	private ArrayList<String> arrayList = new ArrayList<String>();

	public Thing clone() {
		Thing thing = null;
		try {
			thing = (Thing) super.clone();
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
