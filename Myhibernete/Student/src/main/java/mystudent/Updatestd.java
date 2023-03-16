package mystudent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Updatestd {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("s");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student std=entityManager.find(Student.class, 1);
		std.setName("sharana basava");
		if(std!=null) {
		entityTransaction.begin();
		
		entityManager.merge(std);
		entityTransaction.commit();
		}else {
			System.out.println("data not fount");
		}
	}

}
