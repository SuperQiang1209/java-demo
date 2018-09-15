package com.zhengq.designpattern._07prototypepattern.extend;

import com.zhengq.designpattern._07prototypepattern.example.AdvTemplate;

/**
 * 修改后的邮件类
 * 
 * @ClassName: Mail
 * @Description: Cloneable(java
 *               自带的一个接口),这个接口只是一个标记作用，在JVM中具有这个标记的对象才有可能被拷贝。那怎么才能从
 *               “有可能被拷贝”转换为“可以被拷贝”呢？方法是覆盖clone()方法，是的，你没有看错是重写clone()方法
 * @author: Zhenggq
 * @date: 2018年5月7日 下午3:51:05
 */
public class Mail implements Cloneable {
	// 收件人
	private String receiver;
	// 邮件名称
	private String subject;
	// 称谓
	private String appellation;
	// 邮件内容
	private String context;
	// 邮件的尾部，一般都是加上"XXX版权所有"等信息
	private String tail;

	// 构造函数
	public Mail(AdvTemplate advTemplate) {
		this.context = advTemplate.getAdvContext();
		this.subject = advTemplate.getAdvSubject();
	}

	@Override
	protected Mail clone() {
		Mail mail = null;
		try {
			mail = (Mail) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mail;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}
}
