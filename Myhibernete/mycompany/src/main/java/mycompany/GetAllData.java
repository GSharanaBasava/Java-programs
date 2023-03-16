package mycompany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
 import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllData {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("s");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		 
		
		  Query query = entityManager.createQuery("select c from Company c");
		  	List<Company> com=query.getResultList();																																																																																																																																																																																																																																																																																																																																					
		  
		  System.out.println("-------------------------------------------------------------------------");
		  for(Company company : com) {
			  System.out.println("company id      :"+company.getId());
			  System.out.println("company name    :"+company.getName());
			  System.out.println("company website :"+company.getWebsite());
			  System.out.println("company phno    :"+company.getPhno());
			  System.out.println("company no_emp  :"+company.getNo_emp());
			  System.out.println("-------------------------------------------------------------------------");
  
		  }	 
		 
	}

}
