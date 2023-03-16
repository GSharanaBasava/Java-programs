package mycompany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateCompany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("s");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Company company=entityManager.find(Company.class, 101);
		company.setName("google");
		company.setNo_emp(40000);
		entityTransaction.begin();
		entityManager.merge(company);
		entityTransaction.commit();
		System.out.println("data updated");
		
	}

}
