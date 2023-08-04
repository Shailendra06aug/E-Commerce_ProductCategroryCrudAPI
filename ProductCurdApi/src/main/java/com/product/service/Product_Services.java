package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.product.entity.Product_list;
import com.product.repositry.Product_Repository;

@Service
public class Product_Services {

	@Autowired
	private Product_Repository productRepository;

	
	 public void deleteProduct(Long id) {
	        productRepository.deleteById(id);
	    }
	 
	    public List<Product_list> getAllProducts(int page, int size) {
	        Pageable pageable = PageRequest.of(page, size);
	        Page<Product_list> productPage = productRepository.findAll(pageable);
	        return productPage.getContent();
	    }

	
	public List<Product_list> getAllProducts(){
		
		return productRepository.findAll();
	}
	
	
	public Product_list getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
	
	public Product_list createProduct(Product_list product) {
        return productRepository.save(product);
    }
	
	
	 public Product_list updateProduct(Product_list product) {
	        return productRepository.save(product);
	    }
	 
	
}
