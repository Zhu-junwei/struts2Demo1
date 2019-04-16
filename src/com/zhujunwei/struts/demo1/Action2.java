package com.zhujunwei.struts.demo1;

import com.opensymphony.xwork2.Action;

/**
 * Action的三种实现方式：
 * 	方式二：实现Action接口
 * 	Action接口（com.opensymphony.xwork2.Action）
 * 	
 * 	实现接口的这种方式：提供了五个常量（五个逻辑视图的名称）
 * 		 SUCCESS	:成功
 * 		 ERROR		:失败
 * 		 LOGIN		:登录出错页面跳转
 * 		 INPUT		:表单校验的时候出错
 * 		 NONE		:不跳转
 * @author zhujunwei
 * 2019年4月12日 上午9:01:32
 */
public class Action2 implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("Action2.action执行了。。。");
		return SUCCESS;
	}

}
