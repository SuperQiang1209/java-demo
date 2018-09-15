package com.zhengq.designpattern._04templatemethodpattern.example;

import com.zhengq.designpattern._04templatemethodpattern.example.impl.HummerH1Model;

/**
 * 场景类
 * 
 * @ClassName: Client
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月4日 上午11:34:08
 */
public class Client {
	public static void main(String[] args) {
		// 牛逼公司要H1型号的悍马
		HummerModel h1 = new HummerH1Model();
		// H1模型演示
		h1.run();
	}

}
