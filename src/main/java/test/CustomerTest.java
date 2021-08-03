package test;



import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Customer;

public class CustomerTest {
/**
 * @param ar
 */
public static void main(String[] ar) {
	Customer customer=new Customer();
	customer.setCustomer_id(1);
	customer.setEmail("mitesh@gmail");
	customer.setFullname("mitesh");
	customer.setAddress("a-89");
	customer.setCity("Delhi");
	customer.setCountry("india");
	customer.setPhone("909090");
	customer.setZipcode("110086");
	customer.setPassword("^%()($#");
	customer.setRegister_date(new Date(12, 4,2) );
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
    EntityManager entityManager=entityManagerFactory.createEntityManager();
    
    entityManager.getTransaction().begin();
    
    entityManager.persist(customer);
    entityManager.getTransaction().commit();
    
    
    entityManagerFactory.close();
    entityManager.close();
    
    
}
}
