package com.zhengq.designpattern._03absfactorypattern.example.impl;

import com.zhengq.designpattern._03absfactorypattern.example.AbstractYellowHuman;

public class FemaleWhiteHuman extends AbstractYellowHuman {

	@Override
	public void getSex() {
		System.out.println("白人女性");
	}

}
