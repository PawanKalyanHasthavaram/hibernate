package hibernateJSP;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class A3updateUsingMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name,phone,email,gst_number and password:");
		Marchant m=new Marchant();//transient state
		m.setName(scan.next());
		m.setPhone(scan.nextLong());
		m.setEmail(scan.next());
		m.setGst_number(scan.next());
		m.setPassword(scan.next());
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		m=manager.merge(m);//persistent state
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		transaction.commit();
		System.out.println("saved with id:"+m.getId());

	}

}
