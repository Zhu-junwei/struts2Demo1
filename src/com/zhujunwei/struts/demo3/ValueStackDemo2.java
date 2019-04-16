package com.zhujunwei.struts.demo3;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * 获取ValueStack对象的方法
 * @author zhujunwei
 * 2019年4月13日 下午2:10:01
 */
public class ValueStackDemo2 extends ActionSupport{

	private static final long serialVersionUID = 1L;
	@Override
	public String execute() throws Exception {
		
		//一种：通过ActionContext
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		//二种：通过request对象获得
		ValueStack valueStack2 = (ValueStack) ServletActionContext.getRequest().getAttribute(ServletActionContext.STRUTS_VALUESTACK_KEY);
		System.out.println(valueStack == valueStack2);
		return NONE;
	}

}
