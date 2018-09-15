package com.zhengq.designpattern._10responsibilitychainpattern.extend.impl;

import com.zhengq.designpattern._10responsibilitychainpattern.example.IWomen;

/**
 * 女性类
 * 
 * @ClassName: Women
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午4:28:29
 */
public class Women implements IWomen {

	/**
	 * 通过一个int类型的参数来描述妇女的个人状况<br/>
	 * 1-未出嫁 <br/>
	 * 2-出嫁 <br/>
	 * 3-夫死
	 */
	private int type = 0;
	// 妇女请求
	private String request;

	// 构造函数传递过来的请求
	public Women(int type, String request) {
		this.type = type;
		switch (this.type) {
		case 1:
			this.request = "女儿的请求是:" + request;
			break;
		case 2:
			this.request = "妻子的请求是:" + request;
			break;
		case 3:
			this.request = "母亲的请求是:" + request;
			break;
		}
	}

	// 获得自己的状态
	@Override
	public int getType() {
		return this.type;
	}

	// 获得妇女的请求
	@Override
	public String getRequest() {
		return this.request;
	}

}
