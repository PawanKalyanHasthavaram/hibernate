package test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class config {

	public static void main(String[] args) {
		SessionFactory s=new Configuration().configure("HibernateConfigurationFile.cfg.xml").buildSessionFactory();
	}

}
