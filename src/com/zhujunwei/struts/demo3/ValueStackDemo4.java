package com.zhujunwei.struts.demo3;

import com.opensymphony.xwork2.ActionSupport;
import com.zhujunwei.domain.User;

/**
 * 操作ValueStack:方式一：利用Action本身在值栈中的特性
 * @author zhujunwei
 * 2019年4月13日 下午2:41:43
 */
public class ValueStackDemo4 extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	User user ;
	
	public User getUser() {
		return user;
	}

	@Override
	public String execute() throws Exception {
		user = new User("朱俊伟","123456");
		return super.execute();
	}

}
