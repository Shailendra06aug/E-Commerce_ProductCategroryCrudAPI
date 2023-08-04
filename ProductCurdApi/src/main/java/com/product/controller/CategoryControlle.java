package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Category_list;
import com.product.service.Category_Services;

@RestController
@RequestMapping("/api/categories")
public class CategoryControlle {

	    @Autowired
	    private Category_Services categoryService;
	    
        
	    @GetMapping("/{id}")
	    public ResponseEntity<Category_list> getCategoryById(@PathVariable Long id) {

	    	Category_list category = categoryService.getCategoryByID(id);
	        if (category != null) {
	            return ResponseEntity.ok(category);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	    
	    @PostMapping
	    public Category_list createCategory(@RequestBody Category_list category) {
	        return categoryService.createCategory(category);
	    }

	    
	    @GetMapping
	    public List<Category_list> getAllCategories(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "7") int size) {
             return categoryService.getAllCategories(page, size);
	    }
	    
	  
	    
	   
	    @PutMapping("/{id}")
	    public ResponseEntity<Category_list> updateCategory(@PathVariable Long id, @RequestBody Category_list category) {

	    	Category_list existingCategory = categoryService.getCategoryByID(id);
	        if (existingCategory != null) {
	            category.setId(id);
	            return ResponseEntity.ok(categoryService.updateCategory(category));
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	    
	    
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
	    	Category_list existingCategory = categoryService.getCategoryByID(id);
	        if (existingCategory != null) {
	            categoryService.deleteCategory(id);
	            return ResponseEntity.noContent().build();
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    
	    
	    
	    
	    
	    
}
