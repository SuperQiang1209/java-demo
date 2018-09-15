package com.zhengq.designpattern._06proxypattern.extend.ordinary.impl;

import com.zhengq.designpattern._06proxypattern.example.IGamePlayer;

/**
 * 普通代理的游戏者
 * 
 * @ClassName: GamePlayer
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月7日 上午9:56:52
 */
public class GamePlayer implements IGamePlayer {

	private String name = "";

	public GamePlayer(IGamePlayer _gamePlayer, String _name) throws Exception {
		if (_gamePlayer == null) {
			throw new Exception("不能创建真实角色!");
		} else {
			this.name = _name;
		}

	}

	// 进游戏之前你肯定要登录吧,这是一个必要条件
	@Override
	public void login(String user, String password) {
		System.out.println("登录名为" + user + "的用户" + this.name + "登录成功!");
	}

	// 打怪,最期望的就是杀老怪
	@Override
	public void killBoss() {
		System.out.println(this.name + "在打怪");
	}

	// 升级，升级有很多办法，花钱买是一种，做任务也是一种
	@Override
	public void upgrade() {
		System.out.println(this.name + "又升了一级");
	}
}
