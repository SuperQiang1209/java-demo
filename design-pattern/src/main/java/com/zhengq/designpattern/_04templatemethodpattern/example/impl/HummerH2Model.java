package com.zhengq.designpattern._04templatemethodpattern.example.impl;

import com.zhengq.designpattern._04templatemethodpattern.example.HummerModel;

/**
 * 悍马H2型号悍马模型
 * 
 * @ClassName: HummerH2Model
 * @Description: <p>
 *               注意：
 *               </p>
 *               在软件开发过程中，如果相同的一段代码复制过两次，就需要对设计产生怀疑，架构师要明确地说明为什么相同的逻辑要出现两次或更多次。
 * @author: Zhenggq
 * @date: 2018年5月4日 上午11:11:59
 */
public class HummerH2Model extends HummerModel {

	// 汽车发动
	@Override
	public void start() {
		System.out.println("悍马H2发动...");
	}

	// 停车
	@Override
	public void stop() {
		System.out.println("悍马H2停车");
	}

	// H2型号的悍马车鸣笛
	@Override
	public void alarm() {
		System.out.println("悍马H2鸣笛...");
	}

	// 引擎轰鸣声
	@Override
	public void engineBoom() {
		System.out.println("悍马H2引擎声音是这样在...");
	}

	/**
	 * 
	 * <p>
	 * Title: run
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * HummerH1Model和HummerH2Model两个实现类的run()方法都是完全相同的，那这个run()方法的实现应该出现在抽象类，
	 * 不应该在实现类上，抽象是所有子类的共性封装。
	 * <p>
	 * 注意：
	 * </p>
	 * 在软件开发过程中，如果相同的一段代码复制过两次，就需要对设计产生怀疑，架构师要明确地说明为什么相同的逻辑要出现两次或更多次。
	 * 
	 * @see com.zgq.design._4templatemethodpattern.example.HummerModel#run()
	 */
	// @Override
	// public void run() {
	// // 先发动汽车
	// this.start();
	// // 引擎开始轰鸣
	// this.engineBoom();
	// // 然后就开始跑了,跑的过程中遇到一条挡路狗，就按喇叭
	// this.alarm();
	// // 到达目的地就停车
	// this.stop();
	// }

}
