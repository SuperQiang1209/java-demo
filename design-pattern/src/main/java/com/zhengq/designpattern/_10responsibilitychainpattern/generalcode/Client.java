package com.zhengq.designpattern._10responsibilitychainpattern.generalcode;

import com.zhengq.designpattern._10responsibilitychainpattern.generalcode.impl.ConcreteHandler1;
import com.zhengq.designpattern._10responsibilitychainpattern.generalcode.impl.ConcreteHandler2;
import com.zhengq.designpattern._10responsibilitychainpattern.generalcode.impl.ConcreteHandler3;

/**
 * 场景类
 * 
 * @ClassName: Client
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午4:53:56
 */
public class Client {
	public static void main(String[] args) {
		// 声明所有的处理节点
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();

		// 设置链中的阶段顺序1-->2-->3
		handler1.setNext(handler2);
		handler2.setNext(handler3);

		// 提交请求，返回结果
		Response reponse = handler1.handlerMessage(new Request());
	}

}
