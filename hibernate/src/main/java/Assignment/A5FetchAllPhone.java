package Assignment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class A5FetchAllPhone {

	public static void main(String[] args) {
		String hql="select u.phone from User u";
		Session s=new Configuration().configure("HibernateConfigurationFile.cfg.xml").buildSessionFactory().openSession();
		Query<Long> q=s.createQuery(hql);
		List<Long> users=q.getResultList();
		for(Long u:users) {
			
			System.out.println("Phone: "+u);
			
		}

	}

}
