package com.zhengq.designpattern._01singletonpattern.generalcode;

/**
 * 线程不安全的单例
 * 
 * @ClassName: Singleton1
 * @Description: <p>
 *               该单例模式在低并发的情况下尚不会出现问题，若系统压力增大，并发量增加时则可能在内存中出现多个实例，破坏了最初的预期。
 *               为什么会出现这种情况呢？如一个线程A执行到singleton = new
 *               Singleton()，但还没有获得对象（对象初始化是需要时间的），第二个线程B也在执行，执行到（singleton ==
 *               null）判断，那么线程B获得判断条件也是为真，于是继续运行下去，线程A获得了一个对象，线程B也获得了一个对象，
 *               在内存中就出现两个对象！
 *               <p>
 *               解决线程不安全的方法很有多，可以在getSingleton方法前加synchronized关键字，
 *               也可以在getSingleton方法内增加synchronized来实现
 * @author: Zhenggq
 * @date: 2018年5月3日 下午3:13:16
 */
public class Singleton1 {
	private static Singleton1 singleton = null;

	// 限制多个对象
	private Singleton1() {

	}

	// 通过该方法获得实例,如果增加synchronized该单例称为懒汉式单例
	public static Singleton1 getSingleton() {
		if (singleton == null) {
			singleton = new Singleton1();
		}
		return singleton;
	}

	// 类中其它方法，尽量是static
	public static void doSomething() {

	}
}
