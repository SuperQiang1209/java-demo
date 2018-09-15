package com.zhengq.designpattern._07prototypepattern.generalcode;

/**
 * 原型模式通用源码
 * 
 * @ClassName: PrototypeClass
 * @Description: <p>
 *               原型模式的优点：
 *               </p>
 *               ●性能优良<br/>
 *               原型模式是在内存二进制流的拷贝，要比直接new一个对象性能好很多，特别是要在一个循环体内产生大量的对象时，
 *               原型模式可以更好地体现其优点。<br/>
 *               ●逃避构造函数的约束<br/>
 *               这既是它的优点也是缺点，直接在内存中拷贝，构造函数是不会执行的（参见13.4节）。优点就是减少了约束，缺点也是减少了约束，
 *               需要大家在实际应用时考虑。<br/>
 *               <p>
 *               原型模式的使用场景：
 *               </p>
 *               ●资源优化场景<br/>
 *               类初始化需要消化非常多的资源，这个资源包括数据、硬件资源等。<br/>
 *               ●性能和安全要求的场景<br/>
 *               通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。<br/>
 *               ●一个对象多个修改者的场景<br/>
 *               一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以考虑使用原型模式拷贝多个对象供调用者使用。
 *               在实际项目中
 *               ，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过clone的方法创建一个对象，然后由工厂方法提供给调用者。
 *               原型模式已经与Java融为一体，大家可以随手拿来使用。
 *               <p>
 *               原型模式的注意事项：
 *               </p>
 *               ●构造函数不会被执行,Object类的clone方法的原理是从内存中（具体地说就是堆内存）以二进制流的方式进行拷贝，
 *               重新分配一个内存块，那构造函数没有被执行也是非常正常的了。<br/>
 *               ●使用原型模式时，引用的成员变量必须满足两个条件才不会被拷贝：一是类的成员变量，而不是方法内变量；
 *               二是必须是一个可变的引用对象， 而不是一个原始类型或不可变对象。<br/>
 *               ●对象的clone与对象内的final关键字是有冲突的,要使用clone方法，类的成员变量上不要增加final关键字。
 * @author: Zhenggq
 * @date: 2018年5月7日 下午4:00:01
 */
public class PrototypeClass implements Cloneable {

	// 覆写父类Object方法
	@Override
	protected Object clone() {
		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prototypeClass;
	}
}
