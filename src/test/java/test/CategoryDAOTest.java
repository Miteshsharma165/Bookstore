package test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;

import com.bookstore.dao.CategoryDAO;
import com.bookstore.entity.Category;

public class CategoryDAOTest extends BaseDAOTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		BaseDAOTest.setUpBeforeClass();
		categoryDAO = new CategoryDAO(entityManager);

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		BaseDAOTest.tearDownAfterClass();
	}

//	@Test
//	public void testCreatecategory() {
//		Category category=new Category("History");
//	   Category category2= categoryDAO.create(category);
//	   System.out.println(category2);
//		assertTrue(category2 != null && category2.getCategory_id()>0);
//		
//	}

	@Test
	public void testUpdateCategory() {
		Category category = new Category();
		category.setName("The way to hell");
		category.setCategory_id(1);
		Category category2 = categoryDAO.update(category);
		assertTrue(category2 != null);
	}

	@Test
	public void testgetCategory() {
		Category category = new Category();
		int id = 23;
		Category category2 = categoryDAO.get(id);
		System.out.println(category2.getName());
		assertTrue(category2 != null);

	}

	@Test
	public void testdeleteCatgory() {
		int id = 6;
		categoryDAO.delete(id);
		Category category = categoryDAO.get(id);
		assertNull(category);

	}
	
	@Test
	public void testListAllcategory() {
		List<Category> list=categoryDAO.listAll();
		System.out.println(list);
		for(Category category:list) {
		 System.out.println(category.getCategory_id()+"  "+category.getName());
		}
	}
	
	@Test
	public void testCountRowsCategory() {
        long rows= categoryDAO.count();
        assertEquals(rows,4);
	
}
}