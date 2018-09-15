package com.zhengq.designpattern._08mediatorpattern.extend;

import com.zhengq.designpattern._08mediatorpattern.extend.impl.Purchase;
import com.zhengq.designpattern._08mediatorpattern.extend.impl.Sale;
import com.zhengq.designpattern._08mediatorpattern.extend.impl.Stock;

/**
 * 抽象中介者
 * 
 * @ClassName: AbstractMediator
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 上午9:42:33
 */
public abstract class AbstractMediator {
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;

	// 构造函数
	public AbstractMediator() {
		purchase = new Purchase(this);
		sale = new Sale(this);
		stock = new Stock(this);
	}

	// 中介者最重要的方法叫做事件方法,处理多个对象之间的管理
	public abstract void execute(String str, Object... objects);
}
