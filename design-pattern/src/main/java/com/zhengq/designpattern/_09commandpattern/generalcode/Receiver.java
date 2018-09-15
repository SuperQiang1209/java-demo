package com.zhengq.designpattern._09commandpattern.generalcode;

/**
 * 通用Receiver类
 * 
 * @ClassName: Receiver
 * @Description: 该角色就是干活的角色，命令传递到这里是应该被执行的，具体到我们上面的例子中就是Group的三个实现类。
 * @author: Zhenggq
 * @date: 2018年5月8日 上午11:33:00
 */
public abstract class Receiver {
	// 抽象接收者,定义每个接收者都必须完成的业务

	public abstract void doSomething();
}
