package com.zhujunwei.struts.demo2;

import java.util.Arrays;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 访问Servlet的API方式一：完全解耦合的方式
 * @author zhujunwei
 * 2019年4月12日 下午2:14:02
 */
public class RequestDemo1 extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		
		//1、接受参数：
		//利用strut2中的对象ActionContext
		ActionContext context = ActionContext.getContext();
		//调用ActionContext中的方法
		//类似Map<String,String[]> request.getParameterMap()
		Map<String, Object> map = context.getParameters();
		for (String  key : map.keySet()) {
			String[] values = (String[]) map.get(key);
			System.out.println(key+" "+Arrays.toString(values));
		}
		
		// 2、向域对象中存入数据
		context.put("reqName", "reqValue");// 相当于request.setAttribute();
		context.getSession().put("sessName", "sessValue"); // 相当于session.setAttribute();
		context.getApplication().put("appName", "appValue"); // 相当于application.setAttribute();
		
		return SUCCESS;
	}
}
