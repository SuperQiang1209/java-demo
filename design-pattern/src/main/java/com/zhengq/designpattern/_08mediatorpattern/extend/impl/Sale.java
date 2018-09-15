package com.zhengq.designpattern._08mediatorpattern.extend.impl;

import java.util.Random;

import com.zhengq.designpattern._08mediatorpattern.extend.AbstractColleague;
import com.zhengq.designpattern._08mediatorpattern.extend.AbstractMediator;

/**
 * 修改后的销售管理
 * 
 * @ClassName: Sale
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月7日 下午4:30:27
 */
public class Sale extends AbstractColleague {

	public Sale(AbstractMediator _mediator) {
		super(_mediator);
	}

	// 销售IBM电脑
	public void sellIBMComputer(int number) {
		super.mediator.execute("sale.sell", number);
		System.out.println("销售IBM电脑" + number + "台");
	}

	// 反馈销售情况,0~100之间变化,0代表根本就没人卖,100代表非常畅销,出一个卖一个
	public int getSaleStatus() {
		Random rand = new Random(System.currentTimeMillis());
		int saleStatus = rand.nextInt(100);
		System.out.println("IBM电脑的销售情况为:" + saleStatus);
		return saleStatus;
	}

	public void offSale() {
		// 库房有多少卖多少
		super.mediator.execute("sale.offsell");
	}
}
