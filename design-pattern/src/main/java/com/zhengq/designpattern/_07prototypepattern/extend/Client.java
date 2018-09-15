package com.zhengq.designpattern._07prototypepattern.extend;

import java.util.Random;

import com.zhengq.designpattern._07prototypepattern.example.AdvTemplate;

/**
 * 修改后场景类
 * 
 * @ClassName: Client
 * @Description: 这种不通过new关键字来产生一个对象，而是通过对象复制来实现的模式就叫做原型模式。
 * @author: Zhenggq
 * @date: 2018年5月7日 下午3:54:44
 */
public class Client {
	// 发送账单的数量,这个值是从数据库中获得
	private static int MAX_COUNT = 6;

	public static void main(String[] args) {
		// 模拟发送邮件
		int i = 0;
		// 把模板定义出来,这个是从数据库中获得
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX银行版权所有");
		while (i < MAX_COUNT) {
			// 以下是每封邮件不同的地方
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRanString(5) + "  先生 （女士）");
			cloneMail.setReceiver(getRanString(5) + "@" + getRanString(8) + ".com");
			// 然后发送邮件
			sendMail(cloneMail);
			i++;
		}
	}

	// 发送邮件
	public static void sendMail(Mail mail) {
		System.out.println("标题:" + mail.getSubject() + "\t收件人:" + mail.getReceiver() + "\t...发送成功！");
	}

	// 获得指定长度的随机字符串
	public static String getRanString(int maxLength) {
		String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		for (int i = 0; i < maxLength; i++) {
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		return sb.toString();
	}
}
