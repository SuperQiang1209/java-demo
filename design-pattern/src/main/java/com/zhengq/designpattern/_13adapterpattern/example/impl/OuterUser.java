/**  
 * @Title: OuterUser.java  
 * @Package com.zgq.design._13adapterpattern.example.impl  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月18日  
 * @version V1.0  
 */
package com.zhengq.designpattern._13adapterpattern.example.impl;

import java.util.HashMap;
import java.util.Map;

import com.zhengq.designpattern._13adapterpattern.example.IOuterUser;

/**
 * @ClassName: OuterUser
 * @Description: TODO
 * @author Zhenggq
 * @date 2018年5月18日
 * 
 */
public class OuterUser implements IOuterUser {

	/*
	 * <p>Title: getUserBaseInfo</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see
	 * IOuterUser#getUserBaseInfo()
	 */
	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "这个员工叫混世魔王...");
		baseInfoMap.put("mobileNumber", "这个员工电话是...");
		return baseInfoMap;
	}

	/*
	 * <p>Title: getUserOfficeInfo</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see
	 * IOuterUser#getUserOfficeInfo()
	 */
	@Override
	public Map getUserOfficeInfo() {
		HashMap officeInfo = new HashMap();
		officeInfo.put("jobPosition", "这个人的职位是BOSS...");
		officeInfo.put("officeTelNumber", "员工的办公电话是...");
		return officeInfo;
	}

	/*
	 * <p>Title: getUserHomeInfo</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see
	 * IOuterUser#getUserHomeInfo()
	 */
	@Override
	public Map getUserHomeInfo() {
		HashMap homeInfo = new HashMap();
		homeInfo.put("homeTelNumber", "员工的家庭电话是...");
		homeInfo.put("homeAddress", "员工的家庭地址是...");
		return homeInfo;
	}

}
