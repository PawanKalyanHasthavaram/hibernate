package hibernateDemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class A5UpdateUserM2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the user Id to update:");
		int id=scan.nextInt();
		Session s=new Configuration().configure("HibernateConfigurationFile.cfg.xml").buildSessionFactory().openSession();
		User u=new User();
		System.out.println("Enter name,phone,email,password:");
		u.setId(id);
		u.setName(scan.next());
		u.setPhone(scan.nextLong());
		u.setEmail(scan.next());
		u.setPassword(scan.next());
		s.saveOrUpdate(u);
		Transaction t=s.beginTransaction();
		t.commit();
	}
}
