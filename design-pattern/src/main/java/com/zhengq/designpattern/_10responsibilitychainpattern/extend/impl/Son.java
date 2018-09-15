package com.zhengq.designpattern._10responsibilitychainpattern.extend.impl;

import com.zhengq.designpattern._10responsibilitychainpattern.example.IWomen;
import com.zhengq.designpattern._10responsibilitychainpattern.extend.Handler;

public class Son extends Handler {

	public Son() {
		// 必须显示的调用父类构造方法
		super(Handler.SON_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("------母亲向儿子请求------");
		System.out.println(women.getRequest());
		System.out.println("儿子的答复是：同意");
	}

}
