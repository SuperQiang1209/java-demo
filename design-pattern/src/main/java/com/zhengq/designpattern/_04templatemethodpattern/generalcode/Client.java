package com.zhengq.designpattern._04templatemethodpattern.generalcode;

import com.zhengq.designpattern._04templatemethodpattern.generalcode.impl.ConcreteClass1;
import com.zhengq.designpattern._04templatemethodpattern.generalcode.impl.ConcreteClass2;

public class Client {
	public static void main(String[] args) {
		AbstractClass class1 = new ConcreteClass1();
		AbstractClass class2 = new ConcreteClass2();
		// 调用模板方法
		class1.templateMethod();
		class2.templateMethod();
	}
}
