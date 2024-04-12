package Assignment;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import hibernateDemo.User;

public class A7VerifyEmailPassword {

	public static void main(String[] args) {
		String hql="select u from User u where u.email=:email and u.password=:password";
		Session s=new Configuration().configure("HibernateConfigurationFile.cfg.xml").buildSessionFactory().openSession();
		Query<User> q=s.createQuery(hql);
		System.out.println("Enter email and Password:");
		Scanner scan=new Scanner(System.in);
		String email=scan.next();;
		String password=scan.next();
		q.setParameter("email", email);
		q.setParameter("password", password);
		try {
			User u=q.getSingleResult();	
				System.out.println("Id: "+u.getId());
				System.out.println("Name: "+u.getName());
				System.out.println("Email: "+u.getEmail());
				System.out.println("Phone: "+u.getPhone());
			
		}catch(NoResultException e) {
			System.out.println("No user");
		}


	}

}
