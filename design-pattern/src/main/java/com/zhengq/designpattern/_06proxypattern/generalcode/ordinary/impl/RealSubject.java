package com.zhengq.designpattern._06proxypattern.generalcode.ordinary.impl;

import com.zhengq.designpattern._06proxypattern.generalcode.ordinary.Subject;

/**
 * 真实主题类
 * 
 * @ClassName: RealSubject
 * @Description: 也叫做被委托角色、被代理角色。它才是冤大头，是业务逻辑的具体执行者。
 * @author: Zhenggq
 * @date: 2018年5月7日 上午9:36:54
 */
public class RealSubject implements Subject {

	/**
	 * 实现方法
	 * <p>
	 * Title: request
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @see com.zgq.design._6proxypattern.generalcode.Subject#request()
	 */
	@Override
	public void request() {
		// 业务逻辑
	}

}
