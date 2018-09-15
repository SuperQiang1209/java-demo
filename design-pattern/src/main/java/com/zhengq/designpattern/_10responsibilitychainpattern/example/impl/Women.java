package com.zhengq.designpattern._10responsibilitychainpattern.example.impl;

import com.zhengq.designpattern._10responsibilitychainpattern.example.IWomen;

/**
 * 古代妇女
 * 
 * @ClassName: Women
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午2:42:49
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
		this.request = request;
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
