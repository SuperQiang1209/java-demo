package com.zhengq.designpattern._02factorypattern.generalcode;

/**
 * 场景类
 * 
 * @ClassName: Client
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月3日 下午4:17:37
 */
public class Client {
	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		Product product = creator.createProduct(ConcreteProduct1.class);
		/**
		 * 继续业务处理
		 */
	}
}
