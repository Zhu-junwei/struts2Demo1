package com.zhujunwei.struts.demo1;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action的三种实现方式：
 * 	方式三：继承ActionSupport类 ****
 * 推荐使用：因为ActionSupport已经继承了Action接口，又有数据校验、国际化等丰富功能
 * @author zhujunwei
 * 2019年4月12日 上午9:02:35
 */
public class Action3 extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		System.out.println("Action3.action执行了。。。");
		return null;
	}
}
