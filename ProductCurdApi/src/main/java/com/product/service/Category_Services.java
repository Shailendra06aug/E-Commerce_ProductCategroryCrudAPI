package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.product.entity.Category_list;
import com.product.repositry.Category_Repositry;

@Service
public class Category_Services {

	    
	@Autowired
	private Category_Repositry category_Repositry;
	    

	 public void deleteCategory(Long id) {

	    	category_Repositry.deleteById(id);
	    }
	    
	    
	    public List<Category_list> getAllCategories(int page, int size) {

	    	Pageable pageable = PageRequest.of(page, size);
	    	Page<Category_list> categorypage =category_Repositry.findAll(pageable);
	    	return categorypage.getContent();
	    }
	
	    
	
	public List<Category_list> getAllcaCategorys(){
		return category_Repositry.findAll();
	}
	   
	public Category_list getCategoryByID(Long id) {
		return category_Repositry.findById(id).orElse(null);
	}
	    
	
	
	 public Category_list createCategory(Category_list category) {

		 return category_Repositry.save(category);
	    }

	    public Category_list updateCategory(Category_list category) {
	        return category_Repositry.save(category);
	    }
	
	   
	
	
	
	    
}
