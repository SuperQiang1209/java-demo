package com.zhengq.designpattern._10responsibilitychainpattern.example;

/**
 * 女性接口
 * 
 * @ClassName: IWomen
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月8日 下午2:40:11
 */
public interface IWomen {
	// 获得个人状况
	public int getType();

	// 获得个人请示，你要干什么？出去逛街？约会？还是看电影？
	public String getRequest();
}
