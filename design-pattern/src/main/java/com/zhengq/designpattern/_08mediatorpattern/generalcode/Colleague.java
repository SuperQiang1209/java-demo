package com.zhengq.designpattern._08mediatorpattern.generalcode;

/**
 * 抽象同事类
 * 
 * @ClassName: Colleague
 * @Description: 
 *               每一个同事角色都知道中介者角色，而且与其他的同事角色通信的时候，一定要通过中介者角色协作。每个同事类的行为分为两种：一种是同事本身的行为
 *               ，比如改变对象本身的状态，处理自己的行为等，这种行为叫做自发行为（Self-Method），
 *               与其他的同事类或中介者没有任何的依赖；第二种是必须依赖中介者才能完成的行为，叫做依赖方法（Dep-Method）。
 * @author: Zhenggq
 * @date: 2018年5月8日 上午10:11:28
 */
public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator _mediator) {
		this.mediator = _mediator;
	}
}
