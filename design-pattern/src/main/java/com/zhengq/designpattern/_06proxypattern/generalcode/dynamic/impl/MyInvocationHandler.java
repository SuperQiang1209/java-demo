package com.zhengq.designpattern._06proxypattern.generalcode.dynamic.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的Handler类
 * 
 * @ClassName: MyInvocationHandler
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月7日 下午2:54:20
 */
public class MyInvocationHandler implements InvocationHandler {
	// 被代理的对象
	private Object target = null;

	// 通过构造函数传递一个对象
	public MyInvocationHandler(Object _obj) {
		this.target = _obj;
	}

	// 代理方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 执行代理的方法
		return method.invoke(this.target, args);
	}

}
