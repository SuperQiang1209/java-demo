/**  
 * @Title: IStrategy.java  
 * @Package com.zgq.design._12strategypattern.example  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._12strategypattern.example;

/**
 * 妙计接口(抽象策略角色)
 * 
 * @ClassName: IStrategy
 * @Description: 
 *               策略、算法家族的抽象，通常为接口，定义每个策略或算法必须具有的方法和属性。各位看官可能要问了，类图中的AlgorithmInterface是什么意思
 *               ，嘿嘿，algorithm是“运算法则”的意思，结合起来意思就明白了吧。
 * 
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public interface IStrategy {

	/**
	 * 每个锦郎妙计都是一个可执行的算法
	 * 
	 * @Title: operate
	 * @Description: TODO
	 * @param:
	 * @return: void
	 * @throws:
	 */
	public void operate();
}
