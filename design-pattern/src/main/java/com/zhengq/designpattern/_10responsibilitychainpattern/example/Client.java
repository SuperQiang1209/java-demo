package com.zhengq.designpattern._10responsibilitychainpattern.example;

import java.util.ArrayList;
import java.util.Random;

import com.zhengq.designpattern._10responsibilitychainpattern.example.impl.Father;
import com.zhengq.designpattern._10responsibilitychainpattern.example.impl.Husband;
import com.zhengq.designpattern._10responsibilitychainpattern.example.impl.Son;
import com.zhengq.designpattern._10responsibilitychainpattern.example.impl.Women;

/**
 * 场景类
 * 
 * @ClassName: Client
 * @Description: <p>
 *               代码问题
 *               </p>
 *               ●职责界定不清晰<br/>
 *               对女儿提出的请示，应该在父亲类中做出决定，父亲有责任、有义务处理女儿的请示，因此Father类应该是知道女儿的请求自己处理，
 *               而不是在Client类中进行组装出来，也就是说原本应该是父亲这个类做的事情抛给了其他类进行处理，不应该是这样的。<br/>
 *               ●代码臃肿<br/>
 *               我们在Client类中写了if...else的判断条件，而且能随着能处理该类型的请示人员越多，if...else的判断就越多，
 *               想想看，臃肿的条件判断还怎么有可读性？！<br/>
 *               ●耦合过重<br/>
 *               这是什么意思呢，我们要根据Women的type来决定使用IHandler的那个实现类来处理请求。有一个问题是：
 *               如果IHandler的实现类继续扩展怎么办？修改Client类？与开闭原则违背了！<br/>
 *               ●异常情况欠考虑<br/>
 *               妻子只能向丈夫请示吗？如果妻子（比如一个现代女性穿越到古代了，不懂什么“三从四德”）向自己的父亲请示了，父亲应该做何处理？
 *               我们的程序上可没有体现出来，逻辑失败了！<br/>
 * 
 * @author: Zhenggq
 * @date: 2018年5月8日 下午3:46:29
 */
public class Client {
	public static void main(String[] args) {
		// 随便挑选几个女性
		Random rand = new Random();
		ArrayList<IWomen> list = new ArrayList<IWomen>();
		for (int i = 0; i < 5; i++) {
			list.add(new Women(rand.nextInt(4), "我要出去逛街"));
		}

		// 定义3个请示对象
		IHandler father = new Father();
		IHandler husband = new Husband();
		IHandler son = new Son();
		for (IWomen women : list) {
			if (women.getType() == 1) {// 未婚少女,请示父亲
				System.out.println("----------女儿向父亲请示----------");
				father.HandleMessage(women);
			} else if (women.getType() == 2) {// 已婚妇女，请示丈夫
				System.out.println("----------妻子向丈夫请示----------");
				husband.HandleMessage(women);
			} else if (women.getType() == 3) {// 母亲请示儿子
				System.out.println("----------母亲向儿子请示----------");
				son.HandleMessage(women);
			} else {
				// 暂时什么也不做
			}
		}
	}
}
