package oneToOne;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class A1savePersonAndAadharCaard {

	public static void main(String[] args) {
		
		Person p=new Person();
		p.setName("ABC");
		p.setAge(25);
		p.setPhone(12346789L);
		Aadhar a=new Aadhar();
		
		a.setNumber(12345678987654321L);
		a.setDob(LocalDate.parse("1947-08-15"));
		a.setAddress("Bangluru");
		p.setCard(a);
		
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		manager.persist(p);
		manager.persist(a);
		transaction.begin();
		transaction.commit();
		
	}
}
