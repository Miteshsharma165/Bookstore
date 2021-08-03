package com.bookstore.controller.admin.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.controller.BaseServlet;
import com.bookstore.service.UserServices;

/*
 * Hibernate, and code in general that creates objects via 
 * reflection use Class<T>.newInstance() to create a new instance of your classes.
 *  This method requires a public no-arg constructor to be able to instantiate the object. 
 *  For most use cases, providing a no-arg constructor is not a problem.
 *  
 *  
 *  */
@WebServlet("/admin/create_user")
public class CreateUserServlet extends BaseServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		UserServices userServices = new UserServices( entityManager, request,response);
		userServices.createUser();
		userServices.listUser();
	}
}
