package com.bookstore.service;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.dao.CategoryDAO;
import com.bookstore.dao.UserDAO;
import com.bookstore.entity.Category;

import test.categoryTest;

public class CategoryServices {
	
	private EntityManager entityManager;
	private HttpServletRequest request;
    private HttpServletResponse response;
    private CategoryDAO categoryDAO;
    public CategoryServices(EntityManager entityManager,HttpServletRequest request,HttpServletResponse response) {
    	this.request=request;
    	this.response=response;
    	this.entityManager=entityManager;
    	categoryDAO=new CategoryDAO(entityManager);
    	
    }

	public void listcategory() throws ServletException, IOException {
	  List<Category> listCategory= categoryDAO.listAll();
	  request.setAttribute("listCategory", listCategory);
	  String categoryPage="category_list.jsp";
	  RequestDispatcher requestDispatcher=request.getRequestDispatcher(categoryPage);
	  requestDispatcher.forward(request, response);
	  		
	}
//	
//	the list category() method is  also overloaded becouse of the message dispalys on the Category_form.jsp 
//	video 47

	public void create() throws ServletException, IOException {
		 String name= request.getParameter("name");
		   if(categoryDAO.findname("name",name)) {
			   String message="The category is already available";
			   request.setAttribute("message", message);
			  
		   }
		   else {
			   String message="New category Created";
			   request.setAttribute("message", message);
			   Category category=new Category(name);
			   categoryDAO.create(category);
		   }
		
	}

	public void editCatgory() throws IOException, ServletException {
		   int id= Integer.parseInt(request.getParameter("id"));
		   Category category= categoryDAO.get(id);		                      
		   String name=  category.getName();
		   request.setAttribute("name", name);
		   RequestDispatcher requestDispatcher=  request.getRequestDispatcher("category_form.jsp");
		   requestDispatcher.forward(request, response);
		   
		
	}

	public void updateCategory() throws IOException, ServletException {
		String name= request.getParameter("name");
		int CategoryByid= Integer.parseInt	(request.getParameter("categoryId"));
		  if(categoryDAO.findname("name", name)) {
			  String message="The category is already available";
			  request.setAttribute("message", message);
			  listcategory();
			  
		  }
		  else {
			  Category category=new Category(name);
			  category.setCategory_id(CategoryByid);
			  categoryDAO.update(category);
			  String message="Category Updated Succesfully";
			  request.setAttribute("message", message);
			  listcategory();
		  }
			
	}

	public void deleteCategory() throws ServletException, IOException {
		  int categoryid=  Integer.parseInt(request.getParameter("id"));
		     categoryDAO.delete(categoryid);
		     String message="Delete Category";
		     request.setAttribute("message", message);
		     listcategory();
			}
	
		
    
    
    
    
    
    
    
}
