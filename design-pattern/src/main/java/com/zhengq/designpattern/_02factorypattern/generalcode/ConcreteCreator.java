package com.zhengq.designpattern._02factorypattern.generalcode;

/**
 * 具体工厂类
 * 
 * @ClassName: ConcreteCreator
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月3日 下午4:17:51
 */
public class ConcreteCreator extends Creator {

	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T) product;
	}

}
