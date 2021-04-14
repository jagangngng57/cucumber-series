package com.cucumber.testing;

public class Search {
	
	public String displayProduct(Product product) {
		
		if(product.getProductList().contains(product.getProductName())) {
			return product.getProductName();
		}
		return null;
	}

}
