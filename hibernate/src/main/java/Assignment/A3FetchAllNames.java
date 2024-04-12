package Assignment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import hibernateDemo.User;

public class A3FetchAllNames {

	public static void main(String[] args) {
		String hql="select u.name from User u";
		Session s=new Configuration().configure("HibernateConfigurationFile.cfg.xml").buildSessionFactory().openSession();
		Query<String> q=s.createQuery(hql);
		List<String> users=q.getResultList();
		for(String u:users) {
			
			System.out.println("Name: "+u);
			
		}

	}

}
