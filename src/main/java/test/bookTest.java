package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Book;

public class bookTest {
public static void main(String[] ar) throws Exception {
	
	FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Mitesh\\Desktop\\Ignou\\Mycss\\w3.png");
    byte[] data=new byte[fileInputStream.available()];
    fileInputStream.read();
	
    
	     Book book=new Book();
			book.setBook_id(1);
			book.setTitle("Nio book title");
			book.setAuthor("Niel Arms Storn");
			book.setDiscription("the little to finsh by th end od weeekend ");
			book.setIsbn("isbn");
	        book.setImage(data);
			book.setPrice(11.5f);
			book.setPublish_date(new Date(12,4, 2));
			book.setLast_update_time(new Date(12,5,6));
			book.setCategory_id(1);
	

			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
		    EntityManager entityManager=entityManagerFactory.createEntityManager();
		    
		    entityManager.getTransaction().begin();
		    
		    entityManager.persist(book);
		    entityManager.getTransaction().commit();
		    
		    
		    entityManagerFactory.close();
		    entityManager.close();
		 
}
}
