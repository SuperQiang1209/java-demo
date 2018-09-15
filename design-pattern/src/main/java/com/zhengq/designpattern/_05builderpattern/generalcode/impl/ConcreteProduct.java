package com.zhengq.designpattern._05builderpattern.generalcode.impl;

import com.zhengq.designpattern._05builderpattern.generalcode.Builder;
import com.zhengq.designpattern._05builderpattern.generalcode.Product;

/**
 * 具体建造者
 * 
 * @ClassName: ConcreteProduct
 * @Description: 实现抽象类定义的所有方法，并且返回一个组建好的对象。<br/>
 *               例子中的BenzBuilder和BMWBuilder就属于具体建造者。<br/>
 *               <p>注意：</p>
 *               需要注意的是，如果有多个产品类就有几个具体的建造者，而且这多个产品类具有相同接口或抽象类
 * @author: Zhenggq
 * @date: 2018年5月4日 下午4:53:53
 */
public class ConcreteProduct extends Builder {
	private Product product = new Product();

	// 设置产品零件
	@Override
	public void setPart() {
		/**
		 * 产品类内的逻辑处理
		 */

	}

	// 组建一个产品
	@Override
	public Product buildProduct() {
		return product;
	}

}
