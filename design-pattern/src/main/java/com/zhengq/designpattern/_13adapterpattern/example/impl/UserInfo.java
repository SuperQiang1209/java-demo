/**  
 * @Title: UserInfo.java  
 * @Package com.zgq.design._13adapterpattern.example.impl  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._13adapterpattern.example.impl;

import com.zhengq.designpattern._13adapterpattern.example.IUserInfo;

/**
 * @ClassName: UserInfo
 * @Description: TODO
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public class UserInfo implements IUserInfo {

	/*
	 * <p>Title: getUserName</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see IUserInfo#getUserName()
	 */
	@Override
	public String getUserName() {
		System.out.println("姓名叫做...");
		return null;
	}

	/*
	 * <p>Title: getHomeAddress</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see IUserInfo#getHomeAddress()
	 */
	@Override
	public String getHomeAddress() {
		System.out.println("这里是员工的家庭地址...");
		return null;
	}

	/*
	 * <p>Title: getMobileNumber</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see IUserInfo#getMobileNumber()
	 */
	@Override
	public String getMobileNumber() {
		System.out.println("这个人的手机号码是0000...");
		return null;
	}

	/*
	 * <p>Title: getOfficeTelNumber</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see
	 * IUserInfo#getOfficeTelNumber()
	 */
	@Override
	public String getOfficeTelNumber() {
		System.out.println("办公室电话是...");
		return null;
	}

	/*
	 * <p>Title: getJobPosition</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see IUserInfo#getJobPosition()
	 */
	@Override
	public String getJobPosition() {
		System.out.println("这人的职位是BOSS...");
		return null;
	}

	/*
	 * <p>Title: getHomeTelNumber</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see
	 * IUserInfo#getHomeTelNumber()
	 */
	@Override
	public String getHomeTelNumber() {
		System.out.println("员工的家庭电话是...");
		return null;
	}

}
