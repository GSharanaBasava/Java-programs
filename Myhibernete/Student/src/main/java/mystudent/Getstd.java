package mystudent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Getstd {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("s");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student std=entityManager.find(Student.class, 1);
		 
		 System.out.println("the student id :\t\t"+std.getId());
		 System.out.println("the student name :\t\t"+std.getName());
		 System.out.println("the student age :\t\t"+std.getAge());
		 System.out.println("the student marks :\t\t"+std.getMarks());
	}

}
