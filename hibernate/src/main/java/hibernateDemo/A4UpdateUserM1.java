package hibernateDemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class A4UpdateUserM1 {

	public static void main(String[] args) {
		System.out.println("Enter id that u want to update the data:");
		Scanner scan=new Scanner(System.in);
		int id=scan.nextInt();
		Configuration cfg=new Configuration().configure("HibernateConfigurationFile.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		User u=s.get(User.class, id); 
		if(u!=null) {
			System.out.println("id: ");
			u.setId(scan.nextInt());
			System.out.println("name: ");
			u.setName(scan.next());
			System.out.println("email: ");
			u.setEmail(scan.next());
			System.out.println("password: ");
			u.setPassword(scan.next());
			
			System.out.println("phone: "); 
			u.setPhone(scan.nextLong());
		}else {
			System.err.println("id not found to update");
		}

	}

}
