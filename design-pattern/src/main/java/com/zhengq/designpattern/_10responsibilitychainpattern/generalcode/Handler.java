package com.zhengq.designpattern._10responsibilitychainpattern.generalcode;

/**
 * 抽象处理者
 * 
 * @ClassName: Handler
 * @Description: 
 *               抽象的处理者实现三个职责：一是定义一个请求的处理方法handleMessage，唯一对外开放的方法；二是定义一个链的编排方法setNext
 *               ，设置下一个处理者；三是定义了具体的请求者必须实现的两个方法：
 *               定义自己能够处理的级别getHandlerLevel和具体的处理任务echo。
 * 
 *               <p>
 *               责任链模式的优点
 *               </p>
 *               责任链模式非常显著的优点是将请求和处理分开。<br/>
 *               <p>
 *               责任链模式的缺点
 *               </p>
 *               责任链有两个非常显著的缺点：一是性能问题，每个请求都是从链头遍历到链尾，特别是在链比较长的时候，性能是一个非常大的问题。
 *               二是调试不很方便，特别是链条比较长，环节比较多的时候，由于采用了类似递归的方式，调试的时候逻辑可能比较复杂。
 *               <p>
 *               责任链模式的注意事项
 *               </p>
 *               链中节点数量需要控制，避免出现超长链的情况，一般的做法是在Handler中设置一个最大节点数量，
 *               在setNext方法中判断是否已经是超过其阈值，超过则不允许该链建立，避免无意识地破坏系统性能。
 *               <p>
 *               最佳实践
 *               </p>
 *               责任链模式屏蔽了请求的处理过程，你发起一个请求到底是谁处理的，这个你不用关心，只要你把请求抛给责任链的第一个处理者，
 *               最终会返回一个处理结果（当然也可以不做任何处理），作为请求者可以不用知道到底是需要谁来处理的，这是责任链模式的核心，
 *               同时责任链模式也可以作为一种补救模式来使用。
 * @author: Zhenggq
 * @date: 2018年5月8日 下午4:41:57
 */
public abstract class Handler {
	private Handler nextHandler;

	// 每个处理者都必须对请求做出处理
	public final Response handlerMessage(Request request) {
		Response response = null;
		// 判断是否是自己的处理级别
		if (this.getHandLevel().equals(request.getRequestLevel())) {
			response = this.echo(request);
		} else {
			if (this.nextHandler != null) {
				response = this.nextHandler.echo(request);
			} else {
				// 没有适当的处理者，业务自行处理
			}
		}
		return response;
	}

	// 设置下一个处理者是谁
	public void setNext(Handler _handler) {
		this.nextHandler = _handler;
	}

	// 每个处理者都有一个处理级别
	protected abstract Level getHandLevel();

	// 每个处理者都必须实现处理任务
	protected abstract Response echo(Request requset);

}
