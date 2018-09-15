package com.zhengq.designpattern._06proxypattern.generalcode.ordinary.impl;

import com.zhengq.designpattern._06proxypattern.generalcode.ordinary.Subject;

/**
 * 代理类
 * 
 * @ClassName: Proxy
 * @Description: 
 *               也叫做委托类、代理类。它负责对真实角色的应用，把所有抽象主题类定义的方法限制委托给真实主题角色实现，并且在真实主题角色处理完毕前后做预处理和善后处理工作
 *               。
 *               <p>
 *               代理模式的优点：
 *               </p>
 *               ●职责清晰<br/>
 *               真实的角色就是实现实际的业务逻辑，不用关心其他非本职责的事务，通过后期的代理完成一件事务，附带的结果就是编程简洁清晰。<br/>
 *               ●高扩展性<br/>
 *               具体主题角色是随时都会发生变化的，只要它实现了接口，甭管它如何变化，都逃不脱如来佛的手掌（接口），
 *               那我们的代理类完全就可以在不做任何修改的情况下使用。<br/>
 *               ●智能化<br/>
 *               这在我们以上的讲解中还没有体现出来，
 *               不过在我们以下的动态代理章节中你就会看到代理的智能化有兴趣的读者也可以看看Struts是如何把表单元素映射到对象上的。<br/>
 *               <p>
 *               代理模式的使用场景：
 *               </p>
 *               我相信第一次接触到代理模式的读者肯定很郁闷，为什么要用代理呀？想想现实世界吧，打官司为什么要找个律师？
 *               因为你不想参与中间过程的是是非非，只要完成自己的答辩就成，其他的比如事前调查、事后追查都由律师来搞定，这就是为了减轻你的负担。
 * 
 * @author: Zhenggq
 * @date: 2018年5月7日 上午9:38:28
 */
public class Proxy implements Subject {
	// 要代理哪个实现类
	private Subject subject;

	// 默认被代理者
	public Proxy() {
		this.subject = new Proxy();
	}

	// 通过构造函数传递代理者
	public Proxy(Object... objects) {

	}

	// 实现接口中定义的方法
	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}

	// 预处理
	private void before() {
		// do something
	}

	// 善后处理
	private void after() {
		// do something
	}

}
