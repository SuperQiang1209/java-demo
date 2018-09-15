package com.zhengq.designpattern._10responsibilitychainpattern.example;

/**
 * 有处理权的人员接口
 * 
 * @ClassName: IHandler
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午2:51:10
 */
public interface IHandler {
	// 一个女性(女儿、妻子或者母亲)要求逛街，你要处理这个请求
	public void HandleMessage(IWomen women);
}
