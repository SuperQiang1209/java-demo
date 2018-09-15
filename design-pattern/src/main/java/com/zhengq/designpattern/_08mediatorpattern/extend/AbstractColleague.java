package com.zhengq.designpattern._08mediatorpattern.extend;

/**
 * 抽象同事类
 * 
 * @ClassName: AbstractColleague
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午5:22:13
 */
public abstract class AbstractColleague {
	protected AbstractMediator mediator;

	public AbstractColleague(AbstractMediator _mediator) {
		this.mediator = _mediator;
	}
}
