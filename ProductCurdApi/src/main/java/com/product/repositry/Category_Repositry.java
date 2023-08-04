package com.product.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.entity.Category_list;

public interface Category_Repositry extends JpaRepository<Category_list, Long> {
	

}
