package mystudent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStd {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("s");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=new Student();
		student.setId(8);
		student.setAge(29);
		student.setName("sharan");
		student.setMarks(99);
		
		 
		
		entityTransaction.begin();
		entityManager.persist(student);
		 
		entityTransaction.commit();
	}

}
