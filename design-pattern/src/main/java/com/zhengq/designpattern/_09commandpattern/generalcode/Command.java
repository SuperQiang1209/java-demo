package com.zhengq.designpattern._09commandpattern.generalcode;

/**
 * 抽象的Command类
 * 
 * @ClassName: Command
 * @Description: 需要执行的所有命令都在这里声明。
 *               <p>
 *               命令模式的优点
 *               </p>
 *               ●类间解耦<br/>
 *               调用者角色与接收者角色之间没有任何依赖关系，调用者实现功能时只需调用Command抽象类的execute方法就可以，
 *               不需要了解到底是哪个接收者执行。<br/>
 *               ●可扩展性<br/>
 *               Command的子类可以非常容易地扩展，而调用者Invoker和高层次的模块Client不产生严重的代码耦合。<br/>
 *               ●命令模式结合其他模式会更优秀<br/>
 *               命令模式可以结合责任链模式，实现命令族解析任务；结合模板方法模式，则可以减少Command子类的膨胀问题。<br/>
 *               <p>
 *               命令模式的缺点
 *               </p>
 *               命令模式也是有缺点的，请看Command的子类：如果有N个命令，问题就出来了，Command的子类就可不是几个，而是N个，
 *               这个类膨胀得非常大，这个就需要读者在项目中慎重考虑使用。
 *               <p>
 *               命令模式的使用场景
 *               </p>
 *               只要你认为是命令的地方就可以采用命令模式，例如，在GUI开发中
 *               ，一个按钮的点击是一个命令，可以采用命令模式；模拟DOS命令的时候，当然也要采用命令模式；触发－反馈机制的处理等。
 * 
 * @author: Zhenggq
 * @date: 2018年5月8日 上午11:35:46
 */
public abstract class Command {
	// 每个命令类都必须有一个执行命令的方法
	public abstract void execute();
}
