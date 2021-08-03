package com.bookstore.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bookstore.dao.UserDAO;
import com.bookstore.entity.Users;


public class UserServices {

	
	private EntityManager entityManager;
	private UserDAO userDAO;
    private HttpServletRequest request;
    private HttpServletResponse response;
	public UserServices( EntityManager entityManager , HttpServletRequest request,HttpServletResponse response) {
		this.request=request;
		this.response=response;
		this.entityManager=entityManager;
		userDAO = new UserDAO(entityManager);
	}

	public void listUser()
			throws ServletException, IOException {
		List<Users> listUsers = userDAO.listAll();
		request.setAttribute("listUser", listUsers);
		String listpage = "user_list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(listpage);
		requestDispatcher.forward(request, response);
	}

	public void createUser() throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		  
		   if(userDAO.findMail("email", email)) {
			   String creatmessage="Could not Create user . "
			   		+ "A user with email \t"+email+"\t alredy existing";
			   request.setAttribute("message",creatmessage);
			    RequestDispatcher requestDispatcher= request.getRequestDispatcher("message.jsp");
			    requestDispatcher.forward(request, response);
			   
		   }
		
		   else {
		Users newUsers = new Users(name, email, password);
		userDAO.create(newUsers);
		request.setAttribute("message","user created Succesfully");
		   }
	}
	
	public void editUser() throws IOException, ServletException {
		int i= Integer.parseInt(request.getParameter("id"));
		Users users=userDAO.get(i);
		   Integer id=users.getUser_Id();
		   String email= users.getEmail();
		   String name= users.getFull_Name();
		   String password= users.getPassword();
		   String editPage="user_form.jsp";
		   request.setAttribute("id",id);
		 request.setAttribute("name",name);
		 request.setAttribute("email",email);
		 request.setAttribute("password",password);		 
		 RequestDispatcher requestDispatcher=request.getRequestDispatcher(editPage);
		 requestDispatcher.forward(request, response);
	}
	
	public void upadateUser() throws ServletException, IOException {
		int id= Integer.parseInt(request.getParameter("userID"));
		String name= request.getParameter("name");
		String email=request.getParameter("email");
		String password= request.getParameter("password");
		
		Users users=new Users(id,email,name, password);
			 Users users2=  userDAO.get(id);
		// VIDEO 42 MORE SECURITY
		
		if(userDAO.findMail("email",email)  ) {
			String message="Email Aready Exits";
			request.setAttribute("message",message);				
			listUser();
			}
		else {
			userDAO.update(users);
			String message="Updated Succesfully";
			request.setAttribute("message",message);				
			listUser();
				
		}		
		
		
		
	}

	public void deleteUser() throws ServletException, IOException {
		int id=  Integer.parseInt(request.getParameter("id"));
		userDAO.delete(id);
		request.setAttribute("message","delete user succesfully");
		listUser();
		
	}
}
