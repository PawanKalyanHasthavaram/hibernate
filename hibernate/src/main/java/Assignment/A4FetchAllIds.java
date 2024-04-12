package Assignment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class A4FetchAllIds {

	public static void main(String[] args) {
		String hql="select u.id from User u";
		Session s=new Configuration().configure("HibernateConfigurationFile.cfg.xml").buildSessionFactory().openSession();
		Query<Integer> q=s.createQuery(hql);
		List<Integer> users=q.getResultList();
		for(Integer u:users) {
			
			System.out.println("id: "+u);
			
		}

	}

}
