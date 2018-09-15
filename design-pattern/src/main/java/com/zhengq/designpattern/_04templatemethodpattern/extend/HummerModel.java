package com.zhengq.designpattern._04templatemethodpattern.extend;

/**
 * 抽象悍马模型
 * 
 * @ClassName: HummerModel
 * @Description: 
 *               模板方法模式确实非常简单，仅仅使用了Java的继承机制，但它是一个应用非常广泛的模式。其中，AbstractClass叫做抽象模板
 *               ，它的方法分为两类：<br/>
 *               ●基本方法 基本方法也叫做基本操作，是由子类实现的方法，并且在模板方法被调用。<br/>
 *               ●模板方法 可以有一个或几个，一般是一个具体方法，也就是一个框架，实现对基本方法的调度，完成固定的逻辑。
 *               <p>
 *               注意：
 *               </p>
 *               为了防止恶意的操作，一般模板方法都加上final关键字，不允许被覆写。
 * @author: Zhenggq
 * @date: 2018年5月4日 上午10:57:18
 */
public abstract class HummerModel {
	/**
	 * 首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正是要能够发动起来，那这个实现要在实现类里了
	 * 
	 * @Title: start
	 * @Description: TODO
	 * @param:
	 * @return: void
	 * @throws
	 */
	protected abstract void start();

	/**
	 * 能发动，还要能停下来，那才是真本事
	 * 
	 * @Title: stop
	 * @Description: TODO
	 * @param:
	 * @return: void
	 * @throws
	 */
	protected abstract void stop();

	/**
	 * 喇叭会发出声音，是滴滴叫，还是哔哔叫
	 * 
	 * @Title: alarm
	 * @Description: TODO
	 * @param:
	 * @return: void
	 * @throws
	 */
	protected abstract void alarm();

	/**
	 * 引擎会轰隆隆地响，不响那是假的
	 * 
	 * @Title: engineBoom
	 * @Description: TODO
	 * @param:
	 * @return: void
	 * @throws
	 */
	protected abstract void engineBoom();

	/**
	 * 那模型应该会跑吧，别管是人推，还是电力驱动的，总之要会跑
	 * 
	 * @Title: run
	 * @Description: 
	 *               由于HummerH1Model和HummerH2Model两个实现类的run()方法都是完全相同的,将抽象方法变更为实现方法
	 * @param:
	 * @return: void
	 * @throws
	 */
	final public void run() {
		// 先发动汽车
		this.start();
		// 引擎开始轰鸣
		this.engineBoom();
		// 要让它叫的就叫，喇叭不想让他响的就不响
		if (this.isAlarm())
			this.alarm();
		// 到达目的地就停车
		this.stop();
	}

	/**
	 * 钩子方法，默认喇叭是会响的
	 * 
	 * @Title: isAlarm
	 * @Description: 钩子方法是父类的实现有可能依赖子类的处理<br/>
	 *               钩子顾名思义就是用来挂东西的。那么要挂东西必须有个被挂的东西，要不就是铁环、要不就是墙的边沿。
	 *               所以要能挂住东西必须要有个被勾住的铁环
	 *               ，要一个钩子。那么在java中也是同样的原理，你首先需要一个被挂在的东西，一个挂载的东西。
	 * @param: @return
	 * @return: boolean
	 * @throws
	 */
	protected boolean isAlarm() {
		return true;
	}
}
