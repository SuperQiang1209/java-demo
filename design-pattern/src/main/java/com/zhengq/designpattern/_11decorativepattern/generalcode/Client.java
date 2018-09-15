/**  
 * @Title: Client.java  
 * @Package com.zgq.design._11decorativepattern.generalcode  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._11decorativepattern.generalcode;

import com.zhengq.designpattern._11decorativepattern.generalcode.impl.ConcreteComponent;
import com.zhengq.designpattern._11decorativepattern.generalcode.impl.ConcreteDecorator1;
import com.zhengq.designpattern._11decorativepattern.generalcode.impl.ConcreteDecorator2;

/**
 * 场景类
 * 
 * @ClassName: Client
 * @Description: <p>
 *               装饰模式的优点
 *               </p>
 *               ▪ 装饰类和被装饰类可以独立发展，而不会相互耦合。换句话说，Component类无须知道Decorator类，
 *               Decorator类是从外部来扩展Component类的功能，而Decorator也不用知道具体的构件。<br/>
 *               ▪ 装饰模式是继承关系的一个替代方案。我们看装饰类Decorator，不管装饰多少层，返回的对象还是Component，
 *               实现的还是is-a的关系。<br/>
 *               ▪ 装饰模式可以动态地扩展一个实现类的功能，这不需要多说，装饰模式的定义就是如此。<br/>
 *               <p>
 *               装饰模式的缺点
 *               </p>
 *               对于装饰模式记住一点就足够了：多层的装饰是比较复杂的。为什么会复杂呢？你想想看，就像剥洋葱一样，
 *               你剥到了最后才发现是最里层的装饰出现了问题，想象一下工作量吧，因此，尽量减少装饰类的数量，以便降低系统的复杂度。<br/>
 *               <p>
 *               装饰模式的使用场景
 *               </p>
 *               ▪ 需要扩展一个类的功能，或给一个类增加附加功能。<br/>
 *               ▪ 需要动态地给一个对象增加功能，这些功能可以再动态地撤销。<br/>
 *               ▪ 需要为一批的兄弟类进行改装或加装功能，当然是首选装饰模式。<br/>
 * 
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public class Client {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param: @param args
	 * @return: void
	 * @throws:
	 */
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		// 第一次修饰
		component = new ConcreteDecorator1(component);
		// 第二次修饰
		component = new ConcreteDecorator2(component);
		// 修饰后运行
		component.operate();
	}

}
