package com.zhengq.designpattern._06proxypattern.example;

/**
 * 游戏者接口
 * 
 * @ClassName: IGamePlayer
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月4日 下午5:10:58
 */
public interface IGamePlayer {
	// 登录游戏
	public void login(String user, String password);

	// 杀怪,网络游戏的主要特色
	public void killBoss();

	// 升级
	public void upgrade();
}
