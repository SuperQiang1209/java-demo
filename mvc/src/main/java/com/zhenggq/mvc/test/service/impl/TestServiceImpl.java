package com.zhenggq.mvc.test.service.impl;

import com.zhenggq.mvc.annotation.ZgqService;
import com.zhenggq.mvc.test.service.ITestService;

@ZgqService("testService")
public class TestServiceImpl implements ITestService {

	public String query(String name, String age) {
		return String.format("Hello,Name:{%s}-age{%s}", name, age);
	}
}
