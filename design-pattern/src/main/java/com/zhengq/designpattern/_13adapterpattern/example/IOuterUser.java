/**  
 * @Title: IOuterUser.java  
 * @Package com.zgq.design._13adapterpattern.example  
 * @Description: TODO
 * @author Zhenggq  
 * @date 2018年5月18日  
 * @version V1.0  
 */
package com.zhengq.designpattern._13adapterpattern.example;

import java.util.Map;

/**
 * 劳务服务公司的人员信息接口
 * 
 * @ClassName: IOuterUser
 * @Description: TODO
 * @author Zhenggq
 * @date 2018年5月18日
 * 
 */
public interface IOuterUser {
	/**
	 * 基本信息。比如名称、性别、手机号码等
	 * 
	 * @Title: getUserBaseInfo
	 * @Description: TODO
	 * @param: @return
	 * @return: Map
	 * @throws:
	 */
	public Map getUserBaseInfo();

	/**
	 * 工作区域信息
	 * 
	 * @Title: getUserOfficeInfo
	 * @Description: TODO
	 * @param: @return
	 * @return: Map
	 * @throws:
	 */
	public Map getUserOfficeInfo();

	/**
	 * 用户家庭信息
	 * 
	 * @Title: getUserHomeInfo
	 * @Description: TODO
	 * @param: @return
	 * @return: Map
	 * @throws:
	 */
	public Map getUserHomeInfo();
}
