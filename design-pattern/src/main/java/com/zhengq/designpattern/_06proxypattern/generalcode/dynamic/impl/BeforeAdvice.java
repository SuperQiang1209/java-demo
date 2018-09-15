package com.zhengq.designpattern._06proxypattern.generalcode.dynamic.impl;

import com.zhengq.designpattern._06proxypattern.generalcode.dynamic.IAdvice;

/**
 * 通知接口实现类
 * 
 * @ClassName: BeforeAdvice
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月7日 下午3:04:08
 */
public class BeforeAdvice implements IAdvice {

	@Override
	public void exec() {
		System.out.println("我是前置通知，我被执行了");
	}

}
