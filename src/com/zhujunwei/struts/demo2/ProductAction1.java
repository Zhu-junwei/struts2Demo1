package com.zhujunwei.struts.demo2;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class ProductAction1 extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private List<Product> products ;

	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String execute() throws Exception {
		for (Product product : products) {
			System.out.println(product);
		}
		return NONE;
	}

}
