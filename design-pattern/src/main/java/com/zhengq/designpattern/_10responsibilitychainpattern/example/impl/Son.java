package com.zhengq.designpattern._10responsibilitychainpattern.example.impl;

import com.zhengq.designpattern._10responsibilitychainpattern.example.IHandler;
import com.zhengq.designpattern._10responsibilitychainpattern.example.IWomen;

/**
 * 儿子类
 * 
 * @ClassName: Son
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午3:43:45
 */
public class Son implements IHandler {

	/**
	 * 母亲向儿子请示
	 * <p>
	 * Title: HandleMessage
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param women
	 * @see IHandler#HandleMessage(IWomen)
	 */
	@Override
	public void HandleMessage(IWomen women) {
		System.out.println("母亲向儿子请示是：" + women.getRequest());
		System.out.println("儿子答复是：同意");
	}

}
