package com.zhengq.designpattern._10responsibilitychainpattern.example.impl;

import com.zhengq.designpattern._10responsibilitychainpattern.example.IHandler;
import com.zhengq.designpattern._10responsibilitychainpattern.example.IWomen;

/**
 * 父亲类
 * 
 * @ClassName: Father
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午3:09:08
 */
public class Father implements IHandler {

	/**
	 * 未出嫁的女儿来请示父亲
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
		System.out.println("女儿的请示是" + women.getRequest());
		System.out.println("父亲的答复是：同意");
	}

}
