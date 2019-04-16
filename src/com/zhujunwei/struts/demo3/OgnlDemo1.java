package com.zhujunwei.struts.demo3;

import org.junit.jupiter.api.Test;

import com.zhujunwei.domain.User;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

/**
 * Ognl调用对象方法、对象静态方法、获取（root、context）数据
 * @author zhujunwei
 * 2019年4月13日 下午2:14:58
 */
public class OgnlDemo1 {
	
	
	@Test
	//OGNL调用对象的方法
	public void demo1() throws OgnlException {
		OgnlContext context = new OgnlContext() ;
		Object object = Ognl.getValue("'helloworld'.length()", context, context.getRoot());
		System.out.println(object);
	}
	
	@Test
	//OGNL调用对象静态的方法
	public void demo2() throws OgnlException {
		OgnlContext context = new OgnlContext() ;
		Object object = Ognl.getValue("@java.lang.Math@random()", context, context.getRoot());
		System.out.println(object);
	}
	
	
	@Test
	//OGNL获取数据
	public void demo3() throws OgnlException {
		OgnlContext context = new OgnlContext() ;
		//获取Root中的数据
		User user = new User("朱俊伟","123456");
		context.setRoot(user);
		Object name = Ognl.getValue("name", context, context.getRoot());
		Object password = Ognl.getValue("password", context, context.getRoot());
		System.out.println(name+"  "+password);
		//获取Context中的数据
		context.put("name", "朱俊伟");
		String contextName = (String) Ognl.getValue("#name", context, context.getRoot());
		System.out.println(contextName);
	}
}
