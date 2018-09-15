package com.zhengq.designpattern._06proxypattern.generalcode.dynamic.impl;

import com.zhengq.designpattern._06proxypattern.generalcode.dynamic.Subject;

/**
 * 真实主题
 * 
 * @ClassName: RealSubject
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月7日 下午2:53:39
 */
public class RealSubject implements Subject {

	@Override
	public void doSomething(String str) {
		System.out.println("do something!---->" + str);
	}

}
