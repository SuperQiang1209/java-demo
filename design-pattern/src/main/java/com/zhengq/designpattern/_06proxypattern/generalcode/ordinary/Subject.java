package com.zhengq.designpattern._06proxypattern.generalcode.ordinary;

/**
 * 抽象主题类
 * 
 * @ClassName: Subject
 * @Description: 抽象主题类可以是抽象类也可以是接口，是一个最普通的业务类型定义，无特殊要求。
 * @author: Zhenggq
 * @date: 2018年5月7日 上午9:32:34
 */
public interface Subject {
	// 定义一个方法
	public void request();
}
