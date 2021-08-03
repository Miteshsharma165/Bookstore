package com.bookstore.controller.admin.category;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.controller.BaseServlet;
import com.bookstore.service.CategoryServices;
@WebServlet("/admin/delete_category")
public class DeleteCategoryServlet extends BaseServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		CategoryServices categoryServices=new CategoryServices(entityManager, request, response);
		categoryServices.deleteCategory();
		
	}

}
