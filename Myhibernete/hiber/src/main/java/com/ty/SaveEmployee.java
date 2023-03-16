package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sannu");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee=new Employee();
		employee.setEid(121);
		employee.setName("chetan");
		employee.setAge(24);
		employee.setGender('M');
		employee.setSal(789000);
		employee.setDesignation("java Developer");
		
		Employee employee1=new Employee();
		employee1.setEid(232);
		employee1.setName("manoj");
		employee1.setAge(24);
		employee1.setGender('M');
		employee1.setSal(789000);
		employee1.setDesignation("python developer");
		
		Employee employee2=new Employee();
		employee2.setEid(171);
		employee2.setName("basava");
		employee2.setAge(24);
		employee2.setGender('M');
		employee2.setSal(34000);
		employee2.setDesignation("java developer");
		
	 
		entityTransaction.begin();
		entityManager.persist(employee); 
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityTransaction.commit();
		
	}

}
