package com.bookstore.controller.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin/")
public class AdminHomeServlet extends HttpServlet  {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		String homepage="index.jsp";
		   RequestDispatcher requestDispatcher=  request.getRequestDispatcher(homepage);
		   requestDispatcher.forward(request, response);		
	}

}
