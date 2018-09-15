package com.zhengq.designpattern._08mediatorpattern.example;

/**
 * 场景类
 * 
 * @ClassName: Client
 * @Description: 模拟:采购人员采购电脑，销售人员销售电脑，库房员管理库存。
 * @author: Zhenggq
 * @date: 2018年5月8日 上午9:23:53
 */
public class Client {
	public static void main(String[] args) {
		// 采购人员采购电脑
		System.out.println("------采购人员采购电脑------");
		Purchase purchase = new Purchase();
		purchase.buyIBMcomputer(100);
		// 销售人员销售电脑
		System.out.println("\n------销售人员销售电脑------");
		Sale sale = new Sale();
		sale.sellIBMComputer(1);
		// 库房管理人员管理库存
		System.out.println("\n------库房管理人员清仓处理------");
		Stock stock = new Stock();
		stock.clearStock();
	}
}
