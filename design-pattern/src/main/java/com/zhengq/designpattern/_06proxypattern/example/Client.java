package com.zhengq.designpattern._06proxypattern.example;

import com.zhengq.designpattern._06proxypattern.example.impl.GamePlayer;
import com.zhengq.designpattern._06proxypattern.example.impl.GamePlayerProxy;

public class Client {
	public static void main(String[] args) {
		// 定义一个痴迷的玩家
		IGamePlayer player = new GamePlayer("张三");
		// 开始打游戏,记下时间戳
		System.out.println("开始时间是：2018年5月7日09:20:52");
		player.login("zhanSan", "password");
		// 开始杀怪
		player.killBoss();
		// 升级
		player.upgrade();
		// 记录结束游戏时间
		System.out.println("结束时间是:2018年5月7日09:23:07");

		/********** 代练场景 ************/

		IGamePlayer proxy = new GamePlayerProxy(player);
		// 开始打游戏,记下时间戳
		System.out.println("开始时间是：2018年5月7日09:29:59");
		proxy.login("zhanSan", "password");
		// 开始杀怪
		proxy.killBoss();
		// 升级
		proxy.upgrade();
		// 记录结束游戏时间
		System.out.println("结束时间是:2018年5月7日09:30:18");

	}
}
