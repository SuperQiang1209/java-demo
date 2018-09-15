package com.zhengq.designpattern._06proxypattern.generalcode.dynamic.impl;

import java.lang.reflect.InvocationHandler;

import com.zhengq.designpattern._06proxypattern.generalcode.dynamic.DynamicProxy;
import com.zhengq.designpattern._06proxypattern.generalcode.dynamic.Subject;

/**
 * 具体业务的动态代理
 * 
 * @ClassName: SubjectDynamicProxy
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月7日 下午3:15:18
 */
public class SubjectDynamicProxy extends DynamicProxy {
	public static <T> T newProxyInstance(Subject subject) {
		// 获得ClassLoader
		ClassLoader loader = subject.getClass().getClassLoader();
		// 获取接口数组
		Class<?>[] classes = subject.getClass().getInterfaces();
		// 获取handler
		InvocationHandler handler = new MyInvocationHandler(subject);
		return newProxyInstance(loader, classes, handler);
	}
}
