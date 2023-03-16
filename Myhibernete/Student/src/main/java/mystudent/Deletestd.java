package mystudent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Deletestd {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("s");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student std=entityManager.find(Student.class, 3);
		if(std!=null) {
		entityTransaction.begin();
		
		entityManager.remove(std);
		entityTransaction.commit();
		}else {
			System.out.println("data not fount");
		}
	}

}
