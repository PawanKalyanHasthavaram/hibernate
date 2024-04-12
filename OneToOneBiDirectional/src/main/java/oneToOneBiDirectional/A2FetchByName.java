package oneToOneBiDirectional;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class A2FetchByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=scan.next();
		
		String qry="select u from User u where u.name=?1";
		
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		
		Query q=manager.createQuery(qry);
		q.setParameter(1, name);
		
		List<User> u=q.getResultList();
		
		if(u.size()>0) {
			for(User u1:u) {
				System.out.println("id : "+u1.getId());
				System.out.println("name : "+u1.getName());
				System.out.println("Phone : "+u1.getPhone());
				System.out.println("card : "+u1.getCard());
			}
		}else {
			System.out.println("Invalid id");
		}
		

	}

}
