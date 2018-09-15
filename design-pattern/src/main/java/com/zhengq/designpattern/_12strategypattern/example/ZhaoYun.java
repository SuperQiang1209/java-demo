/**  
 * @Title: ZhaoYun.java  
 * @Package com.zgq.design._12strategypattern.example  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._12strategypattern.example;

import com.zhengq.designpattern._12strategypattern.example.impl.BackDoor;
import com.zhengq.designpattern._12strategypattern.example.impl.BlockEnemy;
import com.zhengq.designpattern._12strategypattern.example.impl.GivenGreenLight;

/**
 * 使用计谋(高层模块)
 * 
 * @ClassName: ZhaoYun
 * @Description: <p>
 *               策略模式的优点
 *               </p>
 *               ●算法可以自由切换<br/>
 *               这是策略模式本身定义的，只要实现抽象策略，它就成为策略家族的一个成员，通过封装角色对其进行封装，保证对外提供“可自由切换”
 *               的策略。<br/>
 *               ●避免使用多重条件判断<br/>
 *               如果没有策略模式，我们想想看会是什么样子？一个策略家族有5个策略算法，一会要使用A策略，一会要使用B策略，怎么设计呢？
 *               使用多重的条件语句？多重条件语句不易维护，而且出错的概率大大增强。使用策略模式后，可以由其他模块决定采用何种策略，
 *               策略家族对外提供的访问接口就是封装类，简化了操作，同时避免了条件语句判断。<br/>
 *               ●扩展性良好<br/>
 *               这甚至都不用说是它的优点，因为它太明显了。在现有的系统中增加一个策略太容易了，只要实现接口就可以了，其他都不用修改，
 *               类似于一个可反复拆卸的插件，这大大地符合了OCP原则。<br/>
 *               <p>
 *               策略模式的缺点
 *               </p>
 *               ●策略类数量增多<br/>
 *               每一个策略都是一个类，复用的可能性很小，类数量增多。<br/>
 *               ●所有的策略类都需要对外暴露<br/>
 *               上层模块必须知道有哪些策略，然后才能决定使用哪一个策略，这与迪米特法则是相违背的，我只是想使用了一个策略，
 *               我凭什么就要了解这个策略呢
 *               ？那要你的封装类还有什么意义？这是原装策略模式的一个缺点，幸运的是，我们可以使用其他模式来修正这个缺陷
 *               ，如工厂方法模式、代理模式或享元模式。<br/>
 *               <p>
 *               策略模式的使用场景
 *               </p>
 *               ●多个类只有在算法或行为上稍有不同的场景。<br/>
 *               ●算法需要自由切换的场景。<br/>
 *               例如，算法的选择是由使用者决定的，或者算法始终在进化，特别是一些站在技术前沿的行业，
 *               连业务专家都无法给你保证这样的系统规则能够存在多长时间，在这种情况下策略模式是你最好的助手。<br/>
 *               ●需要屏蔽算法规则的场景。<br/>
 *               现在的科技发展得很快，人脑的记忆是有限的（就目前来说是有限的），太多的算法你只要知道一个名字就可以了，传递相关的数字进来，
 *               反馈一个运算结果，万事大吉。<br/>
 *               <p>
 *               策略模式的注意事项
 *               </p>
 *               如果系统中的一个策略家族的具体策略数量超过4个，则需要考虑使用混合模式，解决策略类膨胀和对外暴露的问题，
 *               否则日后的系统维护就会成为一个烫手山芋，谁都不想接。<br/>
 *               <p>
 *               最佳实践
 *               </p>
 *               策略模式是一个非常简单的模式。它在项目中使用得非常多，但它单独使用的地方就比较少了，因为它有致命缺陷：所有的策略都需要暴露出去
 *               ，这样才方便客户端决定使用哪一个策略。
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public class ZhaoYun {
	// 赵云出场了，他根据诸葛亮给他的交代，依次拆开锦囊妙计
	public static void main(String[] args) {
		Context content = null;
		// 刚到吴国的时候拆第一个
		System.out.println("---刚刚到吴国的时候拆第一个---");
		content = new Context(new BackDoor());// 拿到妙计
		content.operate();// 拆开执行
		System.out.println("\n\n\n\n\n\n\n\n");

		// 刘备乐不思蜀了，拆第二个了
		System.out.println("---刘备乐不思蜀了，拆第二个了---");
		content = new Context(new GivenGreenLight());// 拿到妙计
		content.operate();// 拆开执行
		System.out.println("\n\n\n\n\n\n\n\n");

		// 孙权的小兵追来了，拆第三个了
		System.out.println("---孙权的小兵追来了，拆第三个了---");
		content = new Context(new BlockEnemy());// 拿到妙计
		content.operate();// 拆开执行
		System.out.println("\n\n\n\n\n\n\n\n");
	}
}
