package com.SpringBootCrudService.ProductService.Service;

import java.util.List;

import java.util.UUID;

import com.SpringBootCrudService.ProductService.Model.Product;

public interface ProductServiceImpl {
	
	 List<Product> getAllProduct();
	
	 Product getProductById (UUID id);
	
	 Product createProduct(Product product);
	
	 void deleteProduct(UUID id);
	
	 Product updateProduct(Product product);

	
	
	
	

}
