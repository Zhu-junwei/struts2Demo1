package com.zhujunwei.struts.demo3;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.zhujunwei.domain.User;

/**
 * 操作ValueStack:方式二：调用值栈中的方法实现
 * @author zhujunwei
 * 2019年4月13日 下午2:41:43
 */
public class ValueStackDemo5 extends ActionSupport{

	private static final long serialVersionUID = 1L;
	

	@Override
	public String execute() throws Exception {
		//向值栈中保存数据:
		//获得值栈对象：
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		//使用push(Object obj); set(String key,Object obj)
		
		//存放一个对象
		User user = new User("朱俊伟","123456");
		valueStack.push(user);
		
		//存放一个属性
		valueStack.set("my", "dog");
		
		//存放一个列表
		List<User> list =new ArrayList<User>();
		list.add(new User("朱俊伟1", "111"));
		list.add(new User("朱俊伟2", "222"));
		list.add(new User("朱俊伟3", "333"));
		valueStack.set("list", list);
		
		//向context中存入数据
		ServletActionContext.getRequest().setAttribute("name", "request-朱俊伟");
		ServletActionContext.getRequest().getSession().setAttribute("name", "session-朱俊伟");
		ServletActionContext.getServletContext().setAttribute("name", "application-朱俊伟");
		
		return super.execute();
	}

}
