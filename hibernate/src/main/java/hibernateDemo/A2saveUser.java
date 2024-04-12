package hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class A2saveUser {

	public static void main(String[] args) {
		User u=new User();
		u.setName("ABC");
		u.setPassword("abc13");
		u.setEmail("ab@mil.com");
		u.setPhone(986654321L);
		u.setId(555);//it dosent mater what u keep weather u keep id because it is auto-generated
		Configuration cfg=new Configuration().configure("HibernateConfigurationFile.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		Transaction t=s.beginTransaction();	
		
		int id=(Integer)s.save(u);
		t.commit();
		System.out.println("User saved with id: "+id);
		

	}

}
