package com.zhengq.designpattern._06proxypattern.extend.ordinary.impl;

import com.zhengq.designpattern._06proxypattern.example.IGamePlayer;

/**
 * 普通代理的代理者
 * 
 * @ClassName: GamePlayerPorxy
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月7日 上午10:02:59
 */
public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer = null;

	public GamePlayerProxy(String name) {
		try {
			gamePlayer = new GamePlayer(this, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 代练登录
	@Override
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);

	}

	// 代练杀怪
	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	// 代练升级
	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}

}
