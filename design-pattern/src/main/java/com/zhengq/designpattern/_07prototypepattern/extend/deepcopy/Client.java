package com.zhengq.designpattern._07prototypepattern.extend.deepcopy;

/**
 * 深拷贝测试
 * 
 * @ClassName: Client
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月7日 下午4:22:48
 */
public class Client {
	public static void main(String[] args) {
		// 产生一个对象
		Thing thing = new Thing();
		// 设置一个值
		thing.setValue("张三");
		// 拷贝一个对象
		Thing thingClone = thing.clone();
		thingClone.setValue("李四");
		System.out.println(thing.getValue());
	}
}
