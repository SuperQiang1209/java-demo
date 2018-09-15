package com.zhengq.designpattern._06proxypattern.extend.force;

import com.zhengq.designpattern._06proxypattern.extend.force.impl.GamePlayer;
import com.zhengq.designpattern._06proxypattern.extend.force.impl.GamePlayerProxy;

public class Client {
	public static void main(String[] args) {

		/******** 直接访问真实角色 **********/
		// 定义一个游戏角色
		IGamePlayer gamePlayler = new GamePlayer("张三");
		// 开始打游戏，记下时间戳
		System.out.println("开始时间是:2018年5月7日11:06:42");
		gamePlayler.login("zhangSan", "password");
		// 开始杀怪
		gamePlayler.killBoss();
		// 升级
		gamePlayler.upgrade();
		System.out.println("结束时间是:2018年5月7日11:07:11");

		/******** 直接访问代理类 **********/
		IGamePlayer player = new GamePlayer("李四");
		GamePlayerProxy proxy = new GamePlayerProxy(player);
		// 开始打游戏，记下时间戳
		System.out.println("开始时间是:2018年5月7日11:11:06");
		proxy.login("liSi", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是:2018年5月7日11:15:10");

		/******** 强制代理场景 **********/
		IGamePlayer gp = new GamePlayer("王五");
		IGamePlayer p = gp.getProxy();
		System.out.println("开始时间是:2018年5月7日11:11:06");
		p.login("wangWu", "password");
		p.killBoss();
		p.upgrade();
		System.out.println("结束时间是:2018年5月7日11:15:10");

	}
}
