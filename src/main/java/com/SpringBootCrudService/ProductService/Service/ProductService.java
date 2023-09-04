package com.SpringBootCrudService.ProductService.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.SpringBootCrudService.ProductService.Model.Product;
import com.SpringBootCrudService.ProductService.Repository.ProductRepository;


@Service
public class ProductService implements ProductServiceImpl {

	
	
	
	

	 //Constructor injection 
	private ProductRepository productRepository;
	public ProductService(ProductRepository productRepository) {
		
		this.productRepository = productRepository;
	}
		
		
	

	@Override
	public List<Product> getAllProduct() {
		List<Product> product = new ArrayList<Product>();  
		productRepository.findAll().forEach(product1 -> product.add(product1));  
		return product; 
		
	}

	@Override
	public Product getProductById(UUID id) {
		
		return productRepository.findById(id).get();  
		
	}

	@Override
	public Product createProduct(Product product) {
		
		return productRepository.save(product);
		
	}

	@Override
	public void deleteProduct(UUID id) {
		
		productRepository.deleteById(id); 
		
	}

	@Override
	public Product updateProduct(Product product) {
		Product existingProduct = productRepository.findById(product.getId()).get(); 
	    existingProduct.setPrice(product.getPrice());
	    existingProduct.setAmount(product.getAmount());
	    Product updatedProduct = productRepository.save(existingProduct);
	    return updatedProduct;
	    
		
	}

}
