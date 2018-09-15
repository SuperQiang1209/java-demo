package com.zhengq.designpattern._06proxypattern.extend.force.impl;

import com.zhengq.designpattern._06proxypattern.extend.force.IGamePlayer;

/**
 * 强制代理的真实角色
 * 
 * @ClassName: GamePlayer
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月7日 上午10:38:36
 */
public class GamePlayer implements IGamePlayer {

	private String name = "";
	// 我的代理是谁
	private IGamePlayer proxy = null;

	public GamePlayer(String _name) {
		this.name = _name;
	}

	@Override
	public void login(String user, String password) {
		if (this.isProxy()) {
			System.out.println("登录名为" + user + "的用户" + this.name + "登录成功!");
		} else {
			System.out.println("请使用代理访问！");
		}
	}

	@Override
	public void killBoss() {
		if (this.isProxy()) {
			System.out.println(this.name + "在打怪");
		} else {
			System.out.println("请使用代理访问！");
		}
	}

	@Override
	public void upgrade() {
		if (this.isProxy()) {
			System.out.println(this.name + "又升了一级");
		} else {
			System.out.println("请使用代理访问！");
		}
	}

	public boolean isProxy() {
		if (this.proxy == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public IGamePlayer getProxy() {
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}

}
