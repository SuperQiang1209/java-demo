package com.zhengq.designpattern._02factorypattern.extend.multifactory;

import com.zhengq.designpattern._02factorypattern.example.Human;
import com.zhengq.designpattern._02factorypattern.example.impl.WhiteHuman;

public class WhiteHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}

}
