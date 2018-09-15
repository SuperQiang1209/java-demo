package com.zhengq.designpattern._02factorypattern.generalcode;

/**
 * 抽象工厂类
 * 
 * @ClassName: Creator
 * @Description: <p>工厂方法模式的优点</p>
 *  ▪  首先，良好的封装性，代码结构清晰。一个对象创建是有条件约束的，如一个调用者需要一个具体的产品对象，只要知道这个产品的类名（或约束字符串）就可以了，不用知道创建对象的艰辛过程，降低模块间的耦合。<br>
 *	▪  其次，工厂方法模式的扩展性非常优秀。在增加产品类的情况下，只要适当地修改具体的工厂类或扩展一个工厂类，就可以完成“拥抱变化”。例如在我们的例子中，需要增加一个棕色人种，则只需要增加一个BrownHuman类，工厂类不用任何修改就可完成系统扩展。<br>
 *	▪  再次，屏蔽产品类。这一特点非常重要，产品类的实现如何变化，调用者都不需要关心，它只需要关心产品的接口，只要接口保持不变，系统中的上层模块就不要发生变化。因为产品类的实例化工作是由工厂类负责的，一个产品对象具体由哪一个产品生成是由工厂类决定的。<br>
 * @author: Zhenggq
 * @date: 2018年5月3日 下午4:09:06
 */
public abstract class Creator {

	/**
	 * 创建一个产品对象，其输入参数类型可以自行设置<br>
	 * 通常为String,Enum,Class等,当然也可以为空
	 * 
	 * @Title: createProduct
	 * @Description: TODO
	 * @param: @param c
	 * @param: @return
	 * @return: T
	 * @throws
	 */
	public abstract <T extends Product> T createProduct(Class<T> c);
}
