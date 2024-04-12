package Assignment;

import java.util.List;
import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import hibernateDemo.User;

public class A6VerifyIdPassord {

	public static void main(String[] args) {
		String hql="select u from User u where u.id=:id and u.password=:password";
		Session s=new Configuration().configure("HibernateConfigurationFile.cfg.xml").buildSessionFactory().openSession();
		Query<User> q=s.createQuery(hql);
		System.out.println("Enter Id and Password:");
		Scanner scan=new Scanner(System.in);
		int id=scan.nextInt();
		String password=scan.next();
		q.setParameter("id", id);
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
