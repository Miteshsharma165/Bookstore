package com.bookstore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	
	private int category_id;
	private String name;

	public Category() {
		
	}
	public Category(String name ) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "category [category_id=" + category_id + ", name=" + name + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	

}
