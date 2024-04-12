package Assignment;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import hibernateDemo.User;

public class A1FetchByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Name:");
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		String hql="select u from User u where u.name=:name";
		Session s=new Configuration().configure("HibernateConfigurationFile.cfg.xml").buildSessionFactory().openSession();
		Query<User> q=s.createQuery(hql);
		q.setParameter("name", name);
		List<User> users=q.getResultList();
		if(users.size()>0) {
			for(User u:users) {
				System.out.println("Id: "+u.getId());
				System.out.println("Name: "+u.getName());
				System.out.println("Email: "+u.getEmail());
				System.out.println("Phone: "+u.getPhone());
			}
		}else {
			System.out.println("nothing found");
		}
	}

}
