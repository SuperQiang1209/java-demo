package com.zhenggq.mvc.test.web;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhenggq.mvc.annotation.ZgqAutowired;
import com.zhenggq.mvc.annotation.ZgqController;
import com.zhenggq.mvc.annotation.ZgqRequestMapping;
import com.zhenggq.mvc.annotation.ZgqRequestParam;
import com.zhenggq.mvc.test.service.ITestService;

@ZgqController
@ZgqRequestMapping("/zgq")
public class TestController {

	@ZgqAutowired("testService")
	private ITestService testService;

	@ZgqRequestMapping("/hello")
	public void hello(@ZgqRequestParam("name") String name, @ZgqRequestParam("age") String age, HttpServletRequest request, HttpServletResponse response) {

		ServletOutputStream out = null;
		try {
			out = response.getOutputStream();
			out.print(String.format(testService.query(name, age)));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.flush();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
