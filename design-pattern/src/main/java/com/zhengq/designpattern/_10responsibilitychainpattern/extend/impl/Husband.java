package com.zhengq.designpattern._10responsibilitychainpattern.extend.impl;

import com.zhengq.designpattern._10responsibilitychainpattern.example.IWomen;
import com.zhengq.designpattern._10responsibilitychainpattern.extend.Handler;

public class Husband extends Handler {

	public Husband() {
		//必须显示的调用父类构造方法
		super(Handler.HUSBAND_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("------妻子向丈夫请求------");
		System.out.println(women.getRequest());
		System.out.println("丈夫的答复是：同意");
	}

}
