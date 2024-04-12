package hibernateDemo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class A1TestConfiguration {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("HibernateConfigurationFile.cfg.xml");
		SessionFactory s=cfg.buildSessionFactory();
		System.out.println(s);
	}
}