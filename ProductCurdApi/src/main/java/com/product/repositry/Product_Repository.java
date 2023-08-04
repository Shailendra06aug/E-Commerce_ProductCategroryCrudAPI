package com.product.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.entity.Product_list;

public interface Product_Repository  extends JpaRepository<Product_list, Long>{

}
