package com.zhujunwei.struts.demo2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 数据封装方式二：在页面中提供表达式方式
 * @author zhujunwei
 * 2019年4月12日 下午4:19:28
 */
public class UserAction2 extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private User user ;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(user);
		return NONE;
	}

}
