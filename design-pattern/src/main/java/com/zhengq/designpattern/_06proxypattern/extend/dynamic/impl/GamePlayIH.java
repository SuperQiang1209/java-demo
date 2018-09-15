package com.zhengq.designpattern._06proxypattern.extend.dynamic.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * 
 * @ClassName: GamePlayIH
 * @Description: InvocationHandler是JDK提供的动态代理接口，对被代理类的方法进行代理。
 * @author: Zhenggq
 * @date: 2018年5月7日 下午2:23:43
 */
public class GamePlayIH implements InvocationHandler {
	// 被代理者
	Class cls = null;

	// 被代理的实例
	Object obj = null;

	// 我要代理谁
	public GamePlayIH(Object obj) {
		this.obj = obj;
	}

	// 调用被代理的方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(this.obj, args);
		// 如果是登录方法，则发送信息
		if (method.getName().equalsIgnoreCase("login")) {
			System.out.println("有人在用我的账号登录！");
		}
		return result;
	}

}
