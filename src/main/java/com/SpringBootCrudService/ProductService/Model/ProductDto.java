package com.SpringBootCrudService.ProductService.Model;

import java.math.BigDecimal;



public class ProductDto {
	
	private String productName;
	private int amount;
	private BigDecimal price ;
	
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	
	
	
}
