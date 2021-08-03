package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import com.bookstore.entity.Users;

import net.bytebuddy.implementation.bind.annotation.Super;
import test.bookTest;

public class UserDAO extends JpaDAO<Users> implements GenricDAO<Users> {

	public UserDAO(EntityManager entityManager) {
		super(entityManager);
	}

	public Users create(Users users) {
		return super.create(users);
	}

	@Override
	public Users update(Users users) {
		return super.update(users);
	}

	@Override
	public Users get(Object id) {
		return super.find(Users.class, id);
	}

	@Override
	public void delete(Object id) {
		super.delete(Users.class, id);
	}

	@Override
	public List<Users> listAll() {
		return super.findbyName("from Users");
	}
	
	public boolean findMail(String name, String parameter){
        List<Users> list= super.findbyEmail("from Users e where e.email=:email",name,parameter);
        if(list != null && list.size()>=1) {
        	return true;
        }   
        return false;
	}

	@Override
	public long count() {
		return super.countRows("Select count(*) from Users");
	}

}
