package com.zhujunwei.struts.demo1;

/**
 * sturts2入门的Action
 * @author zhujunwei
 * 2019年4月10日 上午9:35:07
 */
public class HelloAction {
	
	public String execute() {
		System.out.println("hello.action执行了。。。");
		return "success";
	}
}
