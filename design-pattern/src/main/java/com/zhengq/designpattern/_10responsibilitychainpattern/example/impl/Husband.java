package com.zhengq.designpattern._10responsibilitychainpattern.example.impl;

import com.zhengq.designpattern._10responsibilitychainpattern.example.IHandler;
import com.zhengq.designpattern._10responsibilitychainpattern.example.IWomen;

/**
 * 丈夫类
 * 
 * @ClassName: Husband
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午3:11:11
 */
public class Husband implements IHandler {

	/**
	 * 妻子向丈夫请示
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
		System.out.println("妻子的请示是:" + women.getRequest());
		System.out.println("丈夫的答复是:同意");
	}

}
