package com.zhengq.designpattern._06proxypattern.extend.force.impl;

import com.zhengq.designpattern._06proxypattern.extend.force.IGamePlayer;
import com.zhengq.designpattern._06proxypattern.extend.force.IProxy;

public class GamePlayerProxy implements IGamePlayer, IProxy {

	private IGamePlayer gamePlayer;

	public GamePlayerProxy(IGamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
	}

	// 代理登录
	@Override
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}

	// 代理杀怪
	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	// 代理升级
	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
		this.count();
	}

	// 代理的代理暂时还没有,就是自己
	@Override
	public IGamePlayer getProxy() {
		return this;
	}

	// 计算费用
	@Override
	public void count() {
		System.out.println("升级总费用是：150元");
	}

}
