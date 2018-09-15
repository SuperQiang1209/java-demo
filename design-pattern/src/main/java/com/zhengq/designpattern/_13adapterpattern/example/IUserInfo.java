/**  
 * @Title: IUserInfo.java  
 * @Package com.zgq.design._13adapterpattern.example  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月17日  
 * @version V1.0  
 */
package com.zhengq.designpattern._13adapterpattern.example;

/**
 * 员工信息接口
 * 
 * @ClassName: IUserInfo
 * @Description: TODO
 * @author Zhenggq
 * @date 2018年5月17日
 * 
 */
public interface IUserInfo {
	/**
	 * 获取用户姓名
	 * 
	 * @Title: getUserName
	 * @Description: TODO
	 * @param: @return
	 * @return: String
	 * @throws:
	 */
	public String getUserName();

	/**
	 * 获取家庭地址
	 * 
	 * @Title: getHomeAddress
	 * @Description: TODO
	 * @param: @return
	 * @return: String
	 * @throws:
	 */
	public String getHomeAddress();

	/**
	 * 手机号码，这个太重要，手机泛滥
	 * 
	 * @Title: getMobileNumber
	 * @Description: TODO
	 * @param: @return
	 * @return: String
	 * @throws:
	 */
	public String getMobileNumber();

	/**
	 * 办公电话，一般是座机
	 * 
	 * @Title: getOfficeTelNumber
	 * @Description: TODO
	 * @param: @return
	 * @return: String
	 * @throws:
	 */
	public String getOfficeTelNumber();

	/**
	 * 这个人的职位是什么
	 * 
	 * @Title: getJobPosition
	 * @Description: TODO
	 * @param: @return
	 * @return: String
	 * @throws:
	 */
	public String getJobPosition();

	/**
	 * 获得家庭电话，这有点不好，我不喜欢打家庭电话讨论工作
	 * 
	 * @Title: getHomeTelNumber
	 * @Description: TODO
	 * @param: @return
	 * @return: String
	 * @throws:
	 */
	public String getHomeTelNumber();
}
