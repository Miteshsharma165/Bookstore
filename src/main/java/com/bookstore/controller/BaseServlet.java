package com.bookstore.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


public abstract class BaseServlet extends HttpServlet {
	protected EntityManagerFactory entityManagerFactory;
	protected EntityManager entityManager;
	
	
public void init() {
		entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
		 entityManager=entityManagerFactory.createEntityManager();
}


public void destroy() {
	entityManager.close();
	entityManagerFactory.close();
}


}
