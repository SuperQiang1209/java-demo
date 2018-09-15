package com.zhengq.designpattern._03absfactorypattern.example;

/**
 * 人种接口
 * 
 * @ClassName: Human
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月4日 上午9:15:03
 */
public interface Human {

	/**
	 * 每个人种都有相应的颜色
	 * 
	 * @Title: getColor
	 * @Description: TODO
	 * @param:
	 * @return: void
	 * @throws
	 */
	public void getColor();

	/**
	 * 人类会说话
	 * 
	 * @Title: talk
	 * @Description: TODO
	 * @param:
	 * @return: void
	 * @throws
	 */
	public void talk();

	/**
	 * 每个人都有性别
	 * 
	 * @Title: getSex
	 * @Description: TODO
	 * @param:
	 * @return: void
	 * @throws
	 */
	public void getSex();
}
