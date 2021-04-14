package com.cucumber.testing;

import java.util.ArrayList;
import java.util.List;

public class Product {

	
	private String productName;
	private Integer price;
	public Product(String productName, Integer price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public List<String> getProductList(){
		List<String> productList = new ArrayList<>();
		
		productList.add("Apple MackBook Pro");
		productList.add("Apple MackBook Air");
		productList.add("Apple MackBook 12");
		
		return productList;
	}
	
	
}
