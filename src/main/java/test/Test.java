package test;

   import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	import com.bookstore.entity.Users;

	public class Test {
		public static void main(String [] ar) {
			Users user=new Users();
			user.setEmail("mites@gmail");
			user.setFull_Name("abhisek");
			user.setPassword("9090");
			
			
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
	         EntityManager entityManager=entityManagerFactory.createEntityManager();
	         
	         entityManager.getTransaction().begin();
	         
	         entityManager.persist(user);
	         entityManager.getTransaction().commit();
	         
	         
	         entityManagerFactory.close();
	         entityManager.close();
	         
	         
	         
	         
			
		}

	}



