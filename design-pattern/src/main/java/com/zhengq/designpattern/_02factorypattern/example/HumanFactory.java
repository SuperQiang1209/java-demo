package com.zhengq.designpattern._02factorypattern.example;

/**
 * 人类创建工厂
 * 
 * @ClassName: HumanFactory
 * @Description: TODO
 * @author: Zhenggq
 * @date: 2018年5月3日 下午3:57:34
 */
public class HumanFactory extends AbstractHumanFactory {

	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("人类生成错误!");
		}
		return (T) human;
	}

}
