package com.zhengq.designpattern._03absfactorypattern.generalcode;

import com.zhengq.designpattern._03absfactorypattern.generalcode.impl.ProductA1;
import com.zhengq.designpattern._03absfactorypattern.generalcode.impl.ProductB1;

/**
 * 产品等级1的实现类
 * 
 * @ClassName: Creator1
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月4日 上午10:25:20
 */
public class Creator1 extends AbstractCreator {
	
	// 只生产产品等级为1的A产品
	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	// 只生产产品等级为1的B产品
	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
