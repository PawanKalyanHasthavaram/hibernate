package hibernateDemo;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public abstract class A9FetchById{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter user id that u wantto fetch: ");
		int id=scan.nextInt();
		Session s=new Configuration().configure("HibernateConfigurationFile.cfg.xml").buildSessionFactory().openSession();
		String hql="select u from User u where u.id=:id";
		Query<User> q=s.createQuery(hql);
		q.setParameter("id", id);
		try {
			User u=q.getSingleResult();
			System.out.println("Id: "+u.getId());
			System.out.println("Name: "+u.getName());
			System.out.println("Email: "+u.getEmail());
			System.out.println("Phone: "+u.getPhone());
		}catch(NoResultException e) {
			System.out.println("id not found");
			
		}
	}

}
