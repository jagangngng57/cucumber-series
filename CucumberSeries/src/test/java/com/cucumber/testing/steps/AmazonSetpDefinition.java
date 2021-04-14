package com.cucumber.testing.steps;

import com.cucumber.testing.Product;
import com.cucumber.testing.Search;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AmazonSetpDefinition {

	
	Product product;
	Search search;
	
	@Given("I have a search field on Amazon page")
	public void searchPageOnAmazon() {
		
		System.out.println("Amazon Product");
	   
	}

	@When("I search for product with name {string} and price {int}")
	public void searchWithProductAndPrice(String productName, Integer price) {
	 
		System.out.println("Amazon Product"+productName +"Price "+price);
		
		product = new Product(productName, price);
	}

	@Then("product with name {string} should be displayed")
	public void displayProduct(String productName) {
		
		System.out.println("Amazon Product"+productName);
		search = new Search();
		String name = search.displayProduct(product);
		
		Assert.assertEquals(product.getProductName(), name);
	  
	}

}
