package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("shannu");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setId(100);
		person.setName("sharan basava");
		person.setAge(24);
		person.setGender('M');
		person.setPhno(7349585564l);
		
		entityTransaction.begin();
		entityManager.persist(person); 
		entityTransaction.commit();
		
	}
}
