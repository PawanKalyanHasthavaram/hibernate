package hibernateDemo;

import java.util.Scanner;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class A6CodeToFetchARecord {

	public static void main(String[] args) {
		// Fetching using "load(class<t>,Serializable)"
		Session s=new Configuration().configure("HibernateConfigurationFile.cfg.xml").buildSessionFactory().openSession();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter id that u want to fetch:");
		int id=scan.nextInt();
		User u=s.load(User.class, id);
		
		try {
			System.out.println("Id: "+u.getId());
			System.out.println("Name: "+u.getName());
			System.out.println("Email: "+u.getEmail());
			System.out.println("Phone: "+u.getPhone());
		}catch(ObjectNotFoundException e) {
			System.out.println("id is in valid");
			
		}
		/*
		 * Enter id that u want to fetch:
			1
			Id: 1 //here data is not yet fetched
			Hibernate: 
    			select
        			user0_.id as id1_0_0_,
        			user0_.name as name2_0_0_,
        			user0_.phone as phone3_0_0_,
        			user0_.email as email4_0_0_,
        			user0_.password as password5_0_0_ 
    			from
        			User user0_ 
    			where
        			user0_.id=?
			Name: p //here data is fetched because first it  made proxy object with 
					//id=1 then when we requeste to fetch name then values loaded to object
			Email: p@p
			Phone: 123456789
		 */
		
		

	}

}
