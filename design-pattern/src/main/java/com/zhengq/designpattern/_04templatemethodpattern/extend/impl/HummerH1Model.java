package com.zhengq.designpattern._04templatemethodpattern.extend.impl;

import com.zhengq.designpattern._04templatemethodpattern.extend.HummerModel;

public class HummerH1Model extends HummerModel {
	// 要响喇叭
	private boolean alarmFlag = true;

	@Override
	protected void start() {
		System.out.println("悍马H1发动...");

	}

	@Override
	protected void stop() {
		System.out.println("悍马H1停车...");

	}

	@Override
	protected void alarm() {
		System.out.println("悍马H1鸣笛...");

	}

	@Override
	protected void engineBoom() {
		System.out.println("悍马H1引擎声音是这样的...");
	}

	@Override
	protected boolean isAlarm() {
		return this.alarmFlag;
	}

	// 要不要响喇叭，是由客户决定的
	public void setAlarm(boolean isAlarm) {
		this.alarmFlag = isAlarm;
	}

}
