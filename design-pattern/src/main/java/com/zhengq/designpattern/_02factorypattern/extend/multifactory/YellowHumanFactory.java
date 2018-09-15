package com.zhengq.designpattern._02factorypattern.extend.multifactory;

import com.zhengq.designpattern._02factorypattern.example.Human;
import com.zhengq.designpattern._02factorypattern.example.impl.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}

}
