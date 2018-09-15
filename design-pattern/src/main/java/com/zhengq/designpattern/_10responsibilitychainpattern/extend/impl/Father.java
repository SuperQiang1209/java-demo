package com.zhengq.designpattern._10responsibilitychainpattern.extend.impl;

import com.zhengq.designpattern._10responsibilitychainpattern.example.IWomen;
import com.zhengq.designpattern._10responsibilitychainpattern.extend.Handler;

/**
 * 父亲类
 * 
 * @ClassName: Father
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午4:22:27
 */
public class Father extends Handler {

	// 父亲只处理女儿的请求
	public Father() {
		// 必须显示的调用父类构造方法
		super(Handler.FATHER_LEVEL_REQUEST);
	}

	// 父亲的答复
	@Override
	protected void response(IWomen women) {
		System.out.println("------女儿向父亲请求------");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复是：同意");
	}

}
