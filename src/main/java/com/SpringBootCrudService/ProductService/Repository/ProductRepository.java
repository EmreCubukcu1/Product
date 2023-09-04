package com.SpringBootCrudService.ProductService.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringBootCrudService.ProductService.Model.Product;

public interface ProductRepository extends JpaRepository <Product, UUID>{

}
