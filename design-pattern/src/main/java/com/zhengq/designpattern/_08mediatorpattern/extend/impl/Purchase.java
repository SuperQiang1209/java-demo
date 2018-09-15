package com.zhengq.designpattern._08mediatorpattern.extend.impl;

import com.zhengq.designpattern._08mediatorpattern.extend.AbstractColleague;
import com.zhengq.designpattern._08mediatorpattern.extend.AbstractMediator;

/**
 * 修改后的采购管理
 * 
 * @ClassName: Purchase
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月7日 下午4:29:10
 */
public class Purchase extends AbstractColleague {

	public Purchase(AbstractMediator _mediator) {
		super(_mediator);
	}

	// 采购IBM电脑
	public void buyIBMcomputer(int number) {
		super.mediator.execute("purchase.buy", number);
	}

	// 不在采购IBM电脑
	public void refuseBuyIBM() {
		System.out.println("不再采购IBM电脑");
	}
}
