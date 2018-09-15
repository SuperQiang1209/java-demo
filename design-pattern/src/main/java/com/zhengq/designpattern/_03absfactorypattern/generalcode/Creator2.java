package com.zhengq.designpattern._03absfactorypattern.generalcode;

import com.zhengq.designpattern._03absfactorypattern.generalcode.impl.ProductA2;
import com.zhengq.designpattern._03absfactorypattern.generalcode.impl.ProductB2;

/**
 * 产品等级2的实现类
 * 
 * @ClassName: Creator2
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月4日 上午10:25:53
 */
public class Creator2 extends AbstractCreator {

	// 只生产产品等级为2的A产品
	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	// 只生产产品等级为2的B产品
	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}
	
	/**
	 * 注意:有M个产品的等级就应该有M个实现工厂类，在每个实现工厂中，实现不同产品族的生产任务
	 */

}
