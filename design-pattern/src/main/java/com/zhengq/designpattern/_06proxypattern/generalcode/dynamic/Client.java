package com.zhengq.designpattern._06proxypattern.generalcode.dynamic;

import java.lang.reflect.InvocationHandler;

import com.zhengq.designpattern._06proxypattern.generalcode.dynamic.impl.MyInvocationHandler;
import com.zhengq.designpattern._06proxypattern.generalcode.dynamic.impl.RealSubject;
import com.zhengq.designpattern._06proxypattern.generalcode.dynamic.impl.SubjectDynamicProxy;

/**
 * 动态代理场景类
 * 
 * @ClassName: Client
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月7日 下午3:05:46
 */
public class Client {
	public static void main(String[] args) {
		// 定义一个主题
		Subject subject = new RealSubject();
		// 定义一个Handler
		InvocationHandler handler = new MyInvocationHandler(subject);
		// 定义主题的代理
		Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
		// 代理的行为
		proxy.doSomething("Finish");

		/********* 具体业务动态代理 ************/
		Subject p = SubjectDynamicProxy.newProxyInstance(subject);
		p.doSomething("Finish");
	}
}
