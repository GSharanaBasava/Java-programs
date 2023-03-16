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
		student.setId(1);
		student.setAge(23);
		student.setName("sharan");
		student.setMarks(99);
		
		Student student1=new Student();
		student1.setId(2);
		student1.setAge(23);
		student1.setName("manoj");
		student1.setMarks(98);
		
		Student student2=new Student();
		student2.setId(3);
		student2.setAge(23);
		student2.setName("varun");
		student2.setMarks(97);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityTransaction.commit();
	}

}
