package com.zhengq.designpattern._08mediatorpattern.extend;

import com.zhengq.designpattern._08mediatorpattern.extend.impl.Mediator;
import com.zhengq.designpattern._08mediatorpattern.extend.impl.Purchase;
import com.zhengq.designpattern._08mediatorpattern.extend.impl.Sale;
import com.zhengq.designpattern._08mediatorpattern.extend.impl.Stock;

/**
 * 修改后场景类
 * 
 * @ClassName: Client
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 上午10:07:38
 */
public class Client {
	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();
		Purchase purchase = new Purchase(mediator);
		Sale sale = new Sale(mediator);
		Stock stock = new Stock(mediator);
		// 采购人员采购电脑
		System.out.println("------采购人员采购电脑------");
		purchase.buyIBMcomputer(100);
		// 销售人员销售电脑
		System.out.println("\n------销售人员销售电脑------");
		sale.sellIBMComputer(1);
		// 库房管理人员管理库存
		System.out.println("\n------库房管理人员清仓处理------");
		stock.clearStock();

	}
}
