package com.zhengq.designpattern._10responsibilitychainpattern.extend;

import com.zhengq.designpattern._10responsibilitychainpattern.example.IWomen;

/**
 * 修改后的Handler类
 * 
 * @ClassName: Handler
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午4:05:47
 */
public abstract class Handler {
	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;

	// 能处理的级别
	private int level = 0;
	// 责任传递，下一个责任人是谁
	private Handler nextHandler;

	// 每个类都要说明自己能处理哪些请求
	public Handler(int _level) {
		this.level = _level;
	}

	// 一个女性(女儿、妻子或是母亲)要求逛街，你要处理这个请求
	public final void HandlerMessage(IWomen women) {
		if (women.getType() == this.level) {
			this.response(women);
		} else {
			if (this.nextHandler != null) {// 有后续环节，才把请求往后递送
				this.nextHandler.response(women);
			} else {
				System.out.println("---没地方请示了，按不同处理---\n");
			}
		}
	}

	public void setNext(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	protected abstract void response(IWomen women);
}
