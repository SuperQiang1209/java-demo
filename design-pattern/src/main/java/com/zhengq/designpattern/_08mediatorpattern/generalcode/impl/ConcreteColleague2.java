package com.zhengq.designpattern._08mediatorpattern.generalcode.impl;

import com.zhengq.designpattern._08mediatorpattern.generalcode.Colleague;
import com.zhengq.designpattern._08mediatorpattern.generalcode.Mediator;

/**
 * 具体同事类2
 * 
 * @ClassName: ConcreteColleague2
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 上午10:17:21
 */
public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator _mediator) {
		super(_mediator);
	}

	// 自有方法 self-method
	public void selfMetod2() {
		// 处理自己的业务逻辑
	}

	// 依赖方法 dep-method1
	public void depMethod2() {
		// 处理自己的业务逻辑
		// 自己不能处理的业务逻辑，委托给中介者处理
		super.mediator.doSomething2();
	}

}
