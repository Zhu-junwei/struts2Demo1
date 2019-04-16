package com.zhujunwei.struts.demo2;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 访问Servlet的API方式二：使用原生的方式
 * @author zhujunwei
 * 2019年4月12日 下午2:14:02
 */
public class RequestDemo2 extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		
		//1、接受参数
		//直接获取request对象，通过ServletActionContext
		HttpServletRequest request = ServletActionContext.getRequest();
		Map<String, String[]> map = request.getParameterMap();
		for (String key : map.keySet()) {
			String[] values = map.get(key);
			System.out.println(key+" "+Arrays.toString(values));
		}
		
		//2、向域对象中存入数据
		//向request中保存数据
		request.setAttribute("reqName", "reqValue");
		//向session中保存数据
		request.getSession().setAttribute("sessName", "sessValue");
		//向application中保存数据
		ServletActionContext.getServletContext().setAttribute("appName", "appValue");
		
		return SUCCESS;
	}
}
