package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.bookstore.dao.CategoryDAO;

public class BaseDAOTest {
	protected static EntityManagerFactory entityManagerFactory;
	protected static  EntityManager entityManager;
	protected static CategoryDAO categoryDAO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 entityManagerFactory=  Persistence.createEntityManagerFactory("BookStoreWebsite");
		 entityManager=entityManagerFactory.createEntityManager();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		entityManager.close();
		entityManagerFactory.close();
	}
}
