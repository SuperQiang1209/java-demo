package com.zhengq.designpattern._05builderpattern.generalcode;

/**
 * 抽象建造者
 * 
 * @ClassName: Builder
 * @Description: 规范产品的组建，一般是由子类实现。例子中的CarBuilder就属于抽象建造者。
 * @author: Zhenggq
 * @date: 2018年5月4日 下午4:51:07
 */
public abstract class Builder {
	// 设置产品的不同部分,以获得不同的产品
	public abstract void setPart();

	// 建造产品
	public abstract Product buildProduct();
}
