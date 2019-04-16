package com.zhujunwei.struts.demo2;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 数据封装方式三：模型方式
 * @author zhujunwei
 * 2019年4月12日 下午4:19:28
 */
public class UserAction3 extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = 1L;
	private User user = new User() ;

	@Override
	public User getModel() {
		return user;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(user);
		return NONE;
	}
	
}
