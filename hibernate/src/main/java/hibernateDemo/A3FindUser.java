package hibernateDemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class A3FindUser {

	public static void main(String[] args) {
		
		System.out.println("Enter id that u want to fetch the data:");
		Scanner scan=new Scanner(System.in);
		int id=scan.nextInt();
		Configuration cfg=new Configuration().configure("HibernateConfigurationFile.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		User u=s.get(User.class, id); 
		if(u!=null) {
			System.out.println("name: "+u.getName());
			System.out.println("email: "+u.getEmail());
			System.out.println("password: "+u.getPassword());
			System.out.println("phone: "+u.getPhone()); 
		}else {
			System.err.println("id not found");
		}
	}

}
