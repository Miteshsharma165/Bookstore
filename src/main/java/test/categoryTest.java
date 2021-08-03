package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Category;

public class categoryTest {
	public static void main(String[] ar) {
		Category category=new Category();
		category.setCategory_id(1);
		category.setName("The way of heaven");
				

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
	    
	    entityManager.getTransaction().begin();
	    
	    entityManager.persist(category);
	    entityManager.getTransaction().commit();
	    
	    
	    entityManagerFactory.close();
	    entityManager.close();
	 
		
	}

}
