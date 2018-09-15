package com.zhengq.designpattern._03absfactorypattern.example.impl;

import com.zhengq.designpattern._03absfactorypattern.example.Human;
import com.zhengq.designpattern._03absfactorypattern.example.HumanFactory;

/**
 * 生产女性抽象工厂类
 * @ClassName:       FemaleFactory
 * @Description:     生产女性的八卦炉
 * @author:          Zhenggq
 * @date:            2018年5月4日        上午9:26:42
 */
public class FemaleFactory implements HumanFactory {
	
	/**
	 * 生产出黄种女性
	 * <p>Title: createYellowHuman</p>
	 * <p>Description: </p>
	 * @return
	 * @see HumanFactory#createYellowHuman()
	 */
	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}
	
	/**
	 * 生产出白人女性
	 * <p>Title: createWhiteHuman</p>
	 * <p>Description: </p>
	 * @return
	 * @see HumanFactory#createWhiteHuman()
	 */
	@Override
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}
	
	/**
	 * 生产出黑人女性
	 * <p>Title: createBlackHuman</p>
	 * <p>Description: </p>
	 * @return
	 * @see HumanFactory#createBlackHuman()
	 */
	@Override
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

}
