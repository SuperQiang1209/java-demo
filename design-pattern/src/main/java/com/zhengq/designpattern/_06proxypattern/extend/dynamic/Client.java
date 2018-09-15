package com.zhengq.designpattern._06proxypattern.extend.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.zhengq.designpattern._06proxypattern.example.IGamePlayer;
import com.zhengq.designpattern._06proxypattern.example.impl.GamePlayer;
import com.zhengq.designpattern._06proxypattern.extend.dynamic.impl.GamePlayIH;

/**
 * 动态代理的场景类
 * 
 * @ClassName: Client
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月7日 下午2:47:39
 */
public class Client {
	public static void main(String[] args) {
		// 定义一个游戏痴迷的玩家
		IGamePlayer player = new GamePlayer("张三");
		// 定义个handler
		InvocationHandler handler = new GamePlayIH(player);
		// 开始打游戏，记下时间戳
		System.out.println("开始时间是:2018年5月7日14:41:04");
		// 获得类的class loader
		ClassLoader cl = player.getClass().getClassLoader();
		// 动态产生一个代理者
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[] { IGamePlayer.class }, handler);
		// 登录
		proxy.login("zhangSan", "password");
		// 开始杀怪
		proxy.killBoss();
		// 升级
		proxy.upgrade();
		// 记录结束游戏时间
		System.out.println("结束时间是:2018-5-7 14:44:35");
	}
}
