package hibernateJSP;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class A1SaveRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marchant m=new Marchant();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name,phone,email,gst_number and password:");
		
		m.setName(scan.next());
		m.setPhone(scan.nextLong()); 
		m.setEmail(scan.next());
		m.setGst_number(scan.next());
		m.setPassword(scan.next());
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		manager.persist(m);
		EntityTransaction transation=manager.getTransaction();
		transation.begin();
		transation.commit();
		System.out.println("marchent registered with id:"+m.getId());
	}
}
