package com.SpringBootCrudService.ProductService.Controller;

import java.util.List;


import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootCrudService.ProductService.Model.Product;
import com.SpringBootCrudService.ProductService.Model.ProductDto;
import com.SpringBootCrudService.ProductService.Service.ProductService;


@RestController
public class ProductController {
	
	
	@Autowired
	ProductService productService;  
	
	ProductDto productDto =  new ProductDto();
	
	
	@GetMapping("/product")  
	public List<Product> getAllProducts()   
	{  
		return productService.getAllProduct();
	}  
	
	@GetMapping("/product/{id}")  
	private Product getProduct(@PathVariable("id") UUID id)   
	{  
	return productService.getProductById(id);  
	}  

	@DeleteMapping("/product/{id}")  
	private void deleteProduct(@PathVariable("id") UUID id)   
	{  
	productService.deleteProduct(id);  
	}  

	@PostMapping("/create")  
	public String createProduct(@RequestBody Product product)   
	{  
		productService.createProduct(product);
		return product.getProductname();
	}  

	@PutMapping("{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable("id") UUID id,
	                                       @RequestBody Product product){
	    product.setId(id);
	    Product updatedProduct = productService.updateProduct(product);
	    return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
	}
	
	
	
}
