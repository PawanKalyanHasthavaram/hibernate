package hibernateJSP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class A4UpdateUsingFetchMethod {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter id:");
		int id=scan.nextInt();
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Marchant m=manager.find(Marchant.class, id);
		if(m!=null) {
			System.out.println("Enter name,phone,email,sat_number and password");
			m.setName(scan.next());
			m.setPhone(scan.nextLong());
			m.setEmail(scan.next());
			m.setGst_number(scan.next());
			m.setPassword(scan.next());
			EntityTransaction t=manager.getTransaction();
			t.begin();
			t.commit();
		}else {
			System.out.println("No merchant find with id "+id);
		}
		
	}

}
