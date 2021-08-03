package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.bookstore.entity.Category;
import com.bookstore.entity.Users;

import test.reviewTest;

public class CategoryDAO extends JpaDAO<Category> implements GenricDAO<Category>{
	
	
	public CategoryDAO( EntityManager entityManager) {
	  	super(entityManager);
	}

	@Override
	public Category create(Category name) {
		 return  super.create(name);
	}

	@Override
	public Category get(Object id) {
          return super.find(Category.class,id);
	}
	
	@Override
	public Category update(Category category) {
		return super.update(category);
	}
  
	public boolean findname(String name,String parameter){
        List<Category> list= super.findbyEmail("from Category c where c.name=:name",name,parameter);
        if(list != null && list.size()>=1) {
        	return true;
        }   
        return false;
	}
	@Override
	public void delete(Object id) {
          super.delete(Category.class, id);		
	}

	@Override
	public List<Category> listAll() {
		return super.findbyName("from Category");
	}

	@Override
	public long count() {
	return super.countRows("Select count(*) from Category");	
	}

}
