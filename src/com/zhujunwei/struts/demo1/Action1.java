package com.zhujunwei.struts.demo1;

/**
 * Action的三种实现方式：
 * 	方式一：POJO(简单java对象)
 * @author zhujunwei
 * 2019年4月12日 上午9:00:47
 */
public class Action1 {
	public String execute() {
		System.out.println("Action1.action执行了。。。");
		return null;
	}
}
