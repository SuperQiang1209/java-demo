package com.zhengq.designpattern._05builderpattern.generalcode;

import com.zhengq.designpattern._05builderpattern.generalcode.impl.ConcreteProduct;

/**
 * 导演类
 * 
 * @ClassName: Director
 * @Description: <p>
 *               建造者模式的优点
 *               </p>
 *               ●封装性<br/>
 *               使用建造者模式可以使客户端不必知道产品内部组成的细节，如例子中我们就不需要关心每一个具体的模型内部是如何实现的，
 *               产生的对象类型就是CarModel。<br/>
 *               ●建造者独立，容易扩展<br/>
 *               BenzBuilder和BMWBuilder是相互独立的，对系统的扩展非常有利。<br/>
 *               ●便于控制细节风险<br/>
 *               由于具体的建造者是独立的，因此可以对建造过程逐步细化，而不对其他的模块产生任何影响。<br/>
 *               <p>
 *               建造者模式的使用场景
 *               </p>
 *               ▪ 相同的方法，不同的执行顺序，产生不同的事件结果时，可以采用建造者模式。<br/>
 *               ▪ 多个部件或零件，都可以装配到一个对象中，但是产生的运行结果又不相同时，则可以使用该模式。<br/>
 *               ▪ 产品类非常复杂，或者产品类中的调用顺序不同产生了不同的效能，这个时候使用建造者模式非常合适。<br/>
 *               ▪ 在对象创建过程中会使用到系统中的一些其他对象，这些对象在产品对象的创建过程中不易得到时，
 *               也可以采用建造者模式封装该对象的创建过程
 *               。该种场景只能是一个补偿方法，因为一个对象不容易获得，而在设计阶段竟然没有发觉，而要通过创建者模式柔化创建过程
 *               ，本身已经违反设计的最初目标。
 *               <p>
 *               建造者模式的注意事项
 *               </P>
 *               建造者模式关注的是零件类型和装配工艺（顺序），这是它与工厂方法模式最大不同的地方，虽然同为创建类模式，但是注重点不同。
 * 
 *               <p>
 *               建造者模式最主要的功能是基本方法的调用顺序安排，也就是这些基本方法已经实现了，通俗地说就是零件的装配，顺序不同产生的对象也不同
 *               ；而工厂方法则重点是创建，创建零件是它的主要职责，组装顺序则不是它关心的。
 *               </p>
 * @author: Zhenggq
 * @date: 2018年5月4日 下午4:58:36
 */
public class Director {
	private Builder builder = new ConcreteProduct();

	// 构建不同的产品
	public Product getAProduct() {
		builder.setPart();
		/**
		 * 设置不同的零件,产生不同的产品
		 */
		return builder.buildProduct();
	}
}
