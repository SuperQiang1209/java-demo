package com.zhengq.designpattern._10responsibilitychainpattern.generalcode.impl;

import com.zhengq.designpattern._10responsibilitychainpattern.generalcode.Handler;
import com.zhengq.designpattern._10responsibilitychainpattern.generalcode.Level;
import com.zhengq.designpattern._10responsibilitychainpattern.generalcode.Request;
import com.zhengq.designpattern._10responsibilitychainpattern.generalcode.Response;

/**
 * 具体实现者
 * 
 * @ClassName: ConcreteHandler1
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午4:52:46
 */
public class ConcreteHandler2 extends Handler {

	// 设置自己的处理级别
	@Override
	protected Level getHandLevel() {
		return null;
	}

	// 定义自己的处理逻辑
	@Override
	protected Response echo(Request requset) {
		return null;
	}

}
