package com.zhenggq.mvc.servlet;

import com.zhenggq.mvc.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ZgqDispatchServlet extends HttpServlet {

	List<String> classes = new ArrayList<String>();
	ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<String, Object>();
	ConcurrentHashMap<String, Object> mapping = new ConcurrentHashMap<String, Object>();

	public void doScanPackge(String basePackge) {

		URL url = this.getClass().getClassLoader().getResource(basePackge.replaceAll("\\.", "/"));
		String fileStr = url.getFile();
		File file = new File(fileStr);

		for (String path : file.list()) {
			File filePath = new File(fileStr + "/" + path);
			if (filePath.isDirectory()) {
				doScanPackge(basePackge + "." + path);
			} else {
				classes.add(basePackge + "." + filePath.getName());
			}
		}

	}

	public void doInstance() {
		for (String clazz : classes) {
			try {
				Class<?> obj = Class.forName(clazz.replaceAll(".class", ""));
				if (obj.isAnnotationPresent(ZgqController.class)) {
					ZgqRequestMapping an = obj.getAnnotation(ZgqRequestMapping.class);
					map.put(an.value(), obj.newInstance());
				} else if (obj.isAnnotationPresent(ZgqService.class)) {
					ZgqService an = obj.getAnnotation(ZgqService.class);
					map.put(an.value(), obj.newInstance());
				} else {
					continue;
				}

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void init() throws ServletException {
		// 扫描指定包中的class
		doScanPackge("com.zgq.mvc.test");
		// 根据注解创建对象
		doInstance();
		// 注入
		doAutowired();
		// URL映射
		handerMapping();
	}

	public void doAutowired() {
		for (Entry<String, Object> entry : map.entrySet()) {
			Object object = entry.getValue();
			Class<?> clazz = object.getClass();

			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				if (field.isAnnotationPresent(ZgqAutowired.class)) {
					ZgqAutowired wired = field.getAnnotation(ZgqAutowired.class);
					Object bean = map.get(wired.value());
					field.setAccessible(true);
					try {
						field.set(object, bean);
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				} else {
					continue;
				}
			}
		}
	}

	public void handerMapping() {
		for (Entry<String, Object> entry : map.entrySet()) {
			Object instance = entry.getValue();
			Class<?> clazz = instance.getClass();
			if (clazz.isAnnotationPresent(ZgqController.class)) {
				String path = entry.getKey();
				Method[] methods = clazz.getMethods();
				for (Method method : methods) {
					if (method.isAnnotationPresent(ZgqRequestMapping.class)) {
						ZgqRequestMapping reqmap = method.getAnnotation(ZgqRequestMapping.class);
						mapping.put(path + reqmap.value(), method);
					}
				}
			}
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String contextPath = req.getContextPath();
		String url = req.getRequestURI();

		String key = url.substring(contextPath.length());
		System.out.println(key);
		Method method = (Method) mapping.get(key);
		ZgqController instance = (ZgqController) map.get(key.split("/")[0]);
		Object[] args = handle(req, resp, method);
		System.out.println(args.length);
		try {
			method.invoke(instance, args);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

	public Object[] handle(HttpServletRequest req, HttpServletResponse resp, Method method) {

		System.out.println(req.getAttributeNames().hasMoreElements());
		Class<?>[] clazz = method.getParameterTypes();
		Object[] args = new Object[clazz.length];
		Enumeration<String> paramNames = req.getParameterNames();
		while (paramNames.hasMoreElements()) {
			String paramName = (String) paramNames.nextElement();
			for (int i = 0; i < clazz.length; i++) {
				Class<?> param = clazz[i];
				if (param.isAnnotationPresent(ZgqRequestParam.class)) {
					ZgqRequestParam zrp = param.getAnnotation(ZgqRequestParam.class);
					if (zrp.value().equals(paramName)) {
						args[i] = req.getParameter(paramName);
					}
				}
			}

			String[] paramValues = req.getParameterValues(paramName);
			if (paramValues.length == 1) {
				String paramValue = paramValues[0];
				if (paramValue.length() != 0) {
					map.put(paramName, paramValue);
				}
			}
		}

		return args;
	}
}
