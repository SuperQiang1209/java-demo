package com.zhengq.designpattern._03absfactorypattern.example.impl;

import com.zhengq.designpattern._03absfactorypattern.example.AbstractYellowHuman;

public class MaleBlackHuman extends AbstractYellowHuman {

	@Override
	public void getSex() {
		System.out.println("黑人男性");
	}

}
