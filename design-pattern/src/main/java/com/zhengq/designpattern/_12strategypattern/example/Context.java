/**  
 * @Title: Content.java  
 * @Package com.zgq.design._12strategypattern.example  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._12strategypattern.example;

/**
 * 锦囊(封装角色)
 * 
 * @ClassName: Content
 * @Description: 它也叫做上下文角色，起承上启下封装作用，屏蔽高层模块对策略、算法的直接访问，封装可能存在的变化。
 * 
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public class Context {
	private IStrategy strategy;

	public Context(IStrategy _strategy) {
		this.strategy = _strategy;
	}

	// 使用计谋了,看我出招了
	public void operate() {
		strategy.operate();
	}
}
