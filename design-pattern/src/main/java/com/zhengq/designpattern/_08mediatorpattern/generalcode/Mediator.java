package com.zhengq.designpattern._08mediatorpattern.generalcode;

import com.zhengq.designpattern._08mediatorpattern.generalcode.impl.ConcreteColleague1;
import com.zhengq.designpattern._08mediatorpattern.generalcode.impl.ConcreteColleague2;

/**
 * 抽象中介者角色
 * 
 * @ClassName: Mediator
 * @Description: 抽象中介者角色定义统一的接口，用于各同事角色之间的通信。<br/>
 *               ●为什么同事类要使用构造函数注入中介者，而中介者使用getter/setter方式注入同事类呢？这是因为同事类必须有中介者，
 *               而中介者却可以只有部分同事类。
 *               <p>
 *               中介者模式的优点
 *               </p>
 *               ●中介者模式的优点就是减少类间的依赖，把原有的一对多的依赖变成了一对一的依赖，同事类只依赖中介者
 *               ，减少了依赖，当然同时也降低了类间的耦合。<br/>
 *               <p>
 *               中介者模式的缺点
 *               </p>
 *               ●中介者模式的缺点就是中介者会膨胀得很大，而且逻辑复杂，原本N个对象直接的相互依赖关系转换为中介者和同事类的依赖关系，
 *               同事类越多 ，中介者的逻辑就越复杂。<br/>
 *               <p>
 *               中介者模式的使用场景
 *               </p>
 *               ●中介者模式适用于多个对象之间紧密耦合的情况，紧密耦合的标准是：在类图中出现了蜘蛛网状结构。
 *               在这种情况下一定要考虑使用中介者模式，这有利于把蜘蛛网梳理为星型结构，使原本复杂混乱的关系变得清晰简单。<br/>
 * 
 * @author: Zhenggq
 * @date: 2018年5月8日 上午10:09:54
 */
public abstract class Mediator {
	// 定义同事类
	protected ConcreteColleague1 c1;
	protected ConcreteColleague2 c2;

	// 通过getter/setter方法把同事类注入进来
	public ConcreteColleague1 getC1() {
		return c1;
	}

	public void setC1(ConcreteColleague1 c1) {
		this.c1 = c1;
	}

	public ConcreteColleague2 getC2() {
		return c2;
	}

	public void setC2(ConcreteColleague2 c2) {
		this.c2 = c2;
	}

	// 中介模式的业务逻辑处理
	public abstract void doSomething1();

	public abstract void doSomething2();

}
