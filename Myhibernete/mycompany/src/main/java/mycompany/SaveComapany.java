package mycompany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveComapany {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("s");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Company company1=new Company();
		company1.setId(101);
		company1.setName("Google");
		company1.setWebsite("www.google.com");
		company1.setNo_emp(12000);
		company1.setPhno(7685908765l);
		
		Company company2=new Company();
		company2.setId(102);
		company2.setName("tcs");
		company2.setWebsite("www.tcs.com");
		company2.setNo_emp(19000);
		company2.setPhno(9995908765l);
		
		Company company3=new Company();
		company3.setId(103);
		company3.setName("hcl");
		company3.setWebsite("www.hcl.com");
		company3.setNo_emp(78000);
		company3.setPhno(7685008765l);
		
		Company company4=new Company();
		company4.setId(104);
		company4.setName("techmahidra");
		company4.setWebsite("www.techmahidra.com");
		company4.setNo_emp(9000);
		company4.setPhno(6685908765l);
		
		Company company5=new Company();
		company5.setId(105);
		company5.setName("ibm");
		company5.setWebsite("www.ibm.com");
		company5.setNo_emp(8000);
		company5.setPhno(2285908765l);
		
		Company company6=new Company();
		company6.setId(106);
		company6.setName("zoho");
		company6.setWebsite("www.zoho.com");
		company6.setNo_emp(2000);
		company6.setPhno(8885908765l);
		
		Company company7=new Company();
		company7.setId(107);
		company7.setName("wipro");
		company7.setWebsite("www.wipro.com");
		company7.setNo_emp(8200);
		company7.setPhno(7685338765l);
		
		Company company8=new Company();
		company8.setId(108);
		company8.setName("infosys");
		company8.setWebsite("www.infosys.com");
		company8.setNo_emp(1200);
		company8.setPhno(7685987654l);
		
		entityTransaction.begin();
		entityManager.persist(company1);
		entityManager.persist(company2);
		entityManager.persist(company3);
		entityManager.persist(company4);
		entityManager.persist(company5);
		entityManager.persist(company6);
		entityManager.persist(company7);
		entityManager.persist(company8);
		entityTransaction.commit();
		
		
	}
}
