package com.zhengq.designpattern._06proxypattern.extend.ordinary;

import com.zhengq.designpattern._06proxypattern.example.IGamePlayer;
import com.zhengq.designpattern._06proxypattern.extend.ordinary.impl.GamePlayerProxy;

/**
 * 普通代理的场景类
 * 
 * @ClassName: Client
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月7日 上午10:11:40
 */
public class Client {
	public static void main(String[] args) {
		// 然后再定义一个代练者
		IGamePlayer proxy = new GamePlayerProxy("张三");
		// 开始打游戏,记下时间戳
		System.out.println("开始时间是:2018年5月7日10:10:03");
		proxy.login("zhangSan", "password");
		// 开始杀怪
		proxy.killBoss();
		// 升级
		proxy.upgrade();
		// 记录结束游戏时间
		System.out.println("结束时间是:2018年5月7日10:11:22");
	}
}
