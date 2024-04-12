package hibernateDemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class A7DeleteUser {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter id that u want to delete:");
		int id=scan.nextInt();
		Session s=new Configuration().configure("HibernateConfigurationFile.cfg.xml").buildSessionFactory().openSession(); 
		User u=s.get(User.class, id);
		if(u!=null) {
			s.delete(u);
			Transaction t=s.beginTransaction();
			t.commit();
			System.out.println("user deleted");
		}else {
			System.out.println("user not found");
		}
	}
}
