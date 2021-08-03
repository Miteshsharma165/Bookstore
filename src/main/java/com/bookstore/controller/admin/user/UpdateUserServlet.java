package com.bookstore.controller.admin.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.controller.BaseServlet;
import com.bookstore.service.UserServices;

@WebServlet("/admin/update_user")
public class UpdateUserServlet extends BaseServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		UserServices userServices=new UserServices( entityManager, request, response);
		userServices.upadateUser();

	}

}
