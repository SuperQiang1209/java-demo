package com.zhengq.designpattern._03absfactorypattern.example.impl;

import com.zhengq.designpattern._03absfactorypattern.example.Human;
import com.zhengq.designpattern._03absfactorypattern.example.HumanFactory;

/**
 * 生产男性的工厂
 * 
 * @ClassName: MaleFactory
 * @Description: 生产男性的八卦炉
 * @author: Zhenggq
 * @date: 2018年5月4日 上午9:29:45
 */
public class MaleFactory implements HumanFactory {

	/**
	 * 生产出黄人男性
	 * <p>Title: createYellowHuman</p>
	 * <p>Description: </p>
	 * @return
	 * @see HumanFactory#createYellowHuman()
	 */
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}
	
	/**
	 * 生产出白人男性
	 * <p>Title: createWhiteHuman</p>
	 * <p>Description: </p>
	 * @return
	 * @see HumanFactory#createWhiteHuman()
	 */
	@Override
	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}
	
	/**
	 * 生产出黑人男性
	 * <p>Title: createBlackHuman</p>
	 * <p>Description: </p>
	 * @return
	 * @see HumanFactory#createBlackHuman()
	 */
	@Override
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

}
