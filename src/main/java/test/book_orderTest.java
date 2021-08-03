package test;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Book_Order;



public class book_orderTest {
	public static void main(String[] ar) {
		Book_Order bookorder = new Book_Order();
		bookorder.setOrder_id(1);
		bookorder.setCustomer_id(1);
		bookorder.setOrder_date(new Date(12, 3, 5));
		bookorder.setShipping_address("a-89");
		bookorder.setRecipient_name("mitesh");
		bookorder.setRecipient_phone("909090");
		bookorder.setPayment_method("credit");
		bookorder.setTotal(11.9f);
		bookorder.setStatus("deliverred");

		
	EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite"); EntityManager
	  entityManager=entityManagerFactory.createEntityManager();
		  
		  entityManager.getTransaction().begin();
		  
		  entityManager.persist(bookorder); entityManager.getTransaction().commit();
		  
		  
		  entityManagerFactory.close(); entityManager.close();
		  
		  
		 
	}

}
