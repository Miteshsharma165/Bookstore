package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Order_Detail;

public class order_detailTest {
public static void main(String[] atr) {
	Order_Detail orderdetail=new Order_Detail();
	orderdetail.setBook_id(1);
	orderdetail.setOrder_id(1);
	orderdetail.setQuantity(1);
	orderdetail.setSubtotal(11f);
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
    EntityManager entityManager=entityManagerFactory.createEntityManager();
    
    entityManager.getTransaction().begin();
    
    entityManager.persist(orderdetail);
    entityManager.getTransaction().commit();
    
    
    entityManagerFactory.close();
    entityManager.close();
    
    
}
}
