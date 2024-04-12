package hibernateDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class A8FetchAllRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hql="select u from User u";
		Session s=new Configuration().configure("HibernateConfigurationFile.cfg.xml").buildSessionFactory().openSession();
		Query<User> q=s.createQuery(hql);
		List<User> users=q.getResultList();
		for(User u:users) {
			System.out.println("Id: "+u.getId());
			System.out.println("Name: "+u.getName());
			System.out.println("Email: "+u.getEmail());
			System.out.println("Phone: "+u.getPhone());
			System.out.println("---------------------------");
		}	
	}

}
