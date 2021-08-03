package test.com.bokstore.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bookstore.dao.JpaDAO;
import com.bookstore.dao.UserDAO;
import com.bookstore.entity.Users;
import com.bookstore.service.UserServices;


public class UserDAOTest {
	
	
	public static void main(String[] ar) {
		Users user=new Users();
		user.setEmail("RahulAkasj");
		user.setFull_Name("RahulRanjan@gmail.com");
		user.setPassword("rahul@1234");
		
		EntityManagerFactory entityManagerFactory=  Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		UserDAO userdao=new UserDAO(entityManager);
		  Users user1 =userdao.create(user);
		  System.out.println(user1);
//		int id=15;
//        String email="gmail";
//		Users userById=userdao.get(id);
//		List<Users> userByEmail=userdao.findbyEmail(email);
//		System.out.println(userById.getUser_Id() == ((Users) userByEmail).getUser_Id());
		//if(userDAO.findMail(email) && userById.getUser_Id() != ((Users) userByEmail).getUser_Id()) {
		
		
		
		
//		  Integer idInteger=13;
//		  Users list= userdao.get(idInteger);
//		  System.out.println(list.getUser_Id());
        //   user=  userdao.create(user);
//		 Query query = entityManager.createQuery("from Users");
//          List<Users> list=  query.getResultList();
//          System.out.println(list);
		
//         List<Users> list= userdao.findbyEmail("");
//         System.out.println(list);
//              boolean value= userdao.findMail("gmail1234");
//              
//              System.out.println(value);
//	  Users users=	userdao.update(user);
//	  System.out.println(user);

}
	}