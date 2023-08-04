package com.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product_list {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private double price;
	
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category_list category;


	
	
	
	public Product_list(long id, String name, double price, Category_list category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}


	public Product_list() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Category_list getCategory() {
		return category;
	}


	public void setCategory(Category_list category) {
		this.category = category;
	}
	
	
	
	
	
	
	
	
	
	
	
}
