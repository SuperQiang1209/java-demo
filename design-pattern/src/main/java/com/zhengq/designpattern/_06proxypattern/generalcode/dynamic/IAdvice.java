package com.zhengq.designpattern._06proxypattern.generalcode.dynamic;

/**
 * 通知接口
 * 
 * @ClassName: IAdvice
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月7日 下午3:03:08
 */
public interface IAdvice {
	// 通知只有一个方法，执行即可
	public void exec();
}
