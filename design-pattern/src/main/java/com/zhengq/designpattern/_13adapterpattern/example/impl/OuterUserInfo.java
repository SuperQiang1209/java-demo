/**  
 * @Title: OuterUserInfo.java  
 * @Package com.zgq.design._13adapterpattern.example.impl  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月18日  
 * @version V1.0  
 */
package com.zhengq.designpattern._13adapterpattern.example.impl;

import java.util.Map;

import com.zhengq.designpattern._13adapterpattern.example.IUserInfo;

/**
 * @ClassName: OuterUserInfo
 * @Description: TODO
 * @author Zhenggq
 * @date 2018年5月18日
 * 
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

	private Map baseInfo = super.getUserBaseInfo();
	private Map homeInfo = super.getUserHomeInfo();
	private Map officeInfo = super.getUserOfficeInfo();

	/*
	 * <p>Title: getUserName</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see IUserInfo#getUserName()
	 */
	@Override
	public String getUserName() {
		String userName = (String) this.baseInfo.get("userName");
		System.out.println(userName);
		return userName;
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
		String homeAddress = (String) this.homeInfo.get("homeAddress");
		return homeAddress;
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
		String mobileNumber = (String) this.baseInfo.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
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
		String officeTelNumber = (String) this.baseInfo.get("mobileNumber");
		return officeTelNumber;
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
		String jobPosition = (String) this.officeInfo.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
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
		String homeTelNumber = (String) this.homeInfo.get("homeTelNumber");
		return homeTelNumber;
	}

}
