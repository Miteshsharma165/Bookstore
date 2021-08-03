package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Review;
import com.bookstore.methodResources.UtilToSqlDate;

public class reviewTest {

	public static void main(String[] ar) {
		Review review=new Review();
		review.setBook_id(1);
		review.setCustomer_id(1);
		review.setComment("helloe this is comment");
		review.setHeadline("this is headloine");
		review.setRating(5);
		review.setReview_id(2);
		//review.setReview_time();
		review.setReview_time(UtilToSqlDate.getSqldate("11-4-2021  09:01:15"));
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        
        entityManager.persist(review);
        entityManager.getTransaction().commit();
        
        
        entityManagerFactory.close();
        entityManager.close();
        
        
	}
}
