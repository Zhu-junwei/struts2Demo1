package com.zhujunwei.struts.demo1;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 测试Action的访问方式：通过method
 * @author zhujunwei
 * 2019年4月12日 上午9:43:47
 */
public class UserAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	public String save() {
		System.out.println("保存用户");
		return null ;
	}
	public String update() {
		System.out.println("修改用户");
		return null ;
	}
	public String delete() {
		System.out.println("删除用户");
		return null ;
	}
	public String find() {
		System.out.println("查找用户");
		return null ;
	}

}
