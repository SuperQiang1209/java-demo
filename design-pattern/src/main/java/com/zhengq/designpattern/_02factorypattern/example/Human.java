package com.zhengq.designpattern._02factorypattern.example;

/**
 * 人类
 * 
 * @ClassName: Human
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月3日 下午3:44:25
 */
public interface Human {
	// 每个人种的皮肤都有相同的颜色
	public void getColor();

	// 人类会说话
	public void talk();
}
