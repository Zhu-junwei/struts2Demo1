package com.zhujunwei.struts.demo2;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 访问Servlet的API方式三：接口注入的方式
 * @author zhujunwei
 * 2019年4月12日 下午2:14:02
 */
public class RequestDemo3 extends ActionSupport implements ServletRequestAware,ServletContextAware{

	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
	private ServletContext context;
	
	@Override
	public String execute() throws Exception {
		
		//1、接受参数
		//通过接口注入的方式获得request对象
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
		context.setAttribute("appName", "appValue");
		
		return SUCCESS;
	}

	@Override
	public void setServletContext(ServletContext context) {
		this.context = context ;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request ;
	}
}
