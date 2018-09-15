package com.zhengq.designpattern._01singletonpattern.extend;

import java.util.Random;
import java.util.Vector;

/**
 * 固定数量的皇帝类,多例模式
 * @ClassName:       Emperor
 * @Description:     这种需要产生固定数量对象的模式就叫做有上限的多例模式，它是单例模式的一种扩展，采用有上限的多例模式，我们可以在设计时决定在内存中有多少个实例，方便系统进行扩展，修正单例可能存在的性能问题，提供系统的响应速度。例如读取文件，我们可以在系统启动时完成初始化工作，在内存中启动固定数量的reader实例，然后在需要读取文件时就可以快速响应。
 * @author:          Zhenggq
 * @date:            2018年5月3日        下午5:01:02
 */
public class Emperor {
	// 定义最多能产生的示例数量
	private static int maxNumOfEmperor = 2;
	// 每个皇帝都有名字,使用一个ArrayList来容纳,每个对象的私有属性
	private static Vector<String> nameList = new Vector<String>();
	// 定义一个列表,容纳所有的皇帝实例
	private static Vector<Emperor> emperorList = new Vector<Emperor>();
	// 当前皇帝序号
	private static int countNumOfEmperor = 0;

	static {
		for (int i = 0; i < maxNumOfEmperor; i++) {
			emperorList.add(new Emperor("皇" + (i + 1) + "帝"));
		}
	}

	private Emperor() {
	};

	// 传入皇帝名称,建立一个皇帝对象
	private Emperor(String name) {
		nameList.add(name);
	}

	// 随机获得一个皇帝对象
	public static Emperor getInstance() {
		Random random = new Random();
		countNumOfEmperor = random.nextInt(maxNumOfEmperor);
		return emperorList.get(countNumOfEmperor);
	}

	// 皇帝发话了
	public static void say() {
		System.out.println(nameList.get(countNumOfEmperor));
	}
}
