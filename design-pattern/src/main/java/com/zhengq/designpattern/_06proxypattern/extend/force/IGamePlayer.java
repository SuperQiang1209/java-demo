package com.zhengq.designpattern._06proxypattern.extend.force;

/**
 * 强制代理的接口类
 * 
 * @ClassName: IGamePlayer
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月7日 上午10:25:06
 */
public interface IGamePlayer {
	// 登录游戏
	public void login(String user, String password);

	// 杀怪,网络游戏的主要特色
	public void killBoss();

	// 升级
	public void upgrade();

	// 每个人都可以找一下自己的代理
	public IGamePlayer getProxy();
}
