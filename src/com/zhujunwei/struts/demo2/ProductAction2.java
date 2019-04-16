package com.zhujunwei.struts.demo2;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class ProductAction2 extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Map<String, Product> map;

	public Map<String, Product> getMap() {
		return map;
	}
	
	public void setMap(Map<String, Product> map) {
		this.map = map;
	}
	
	@Override
	public String execute() throws Exception {
		for (String key : map.keySet()) {
			Product product = map.get(key);
			System.out.println(key+" "+product);
		}
		return NONE;
	}

}
