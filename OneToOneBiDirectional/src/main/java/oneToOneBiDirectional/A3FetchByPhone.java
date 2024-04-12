package oneToOneBiDirectional;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class A3FetchByPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter phone:");
		long phone=scan.nextLong();
		
		String qry="select u from User u where u.phone=?1";
		
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		
		Query q=manager.createQuery(qry);
		q.setParameter(1, phone);
		
		List<User> u=q.getResultList();
		
		if(u.size()>0) {
			for(User u1:u) {
				
				System.out.println("id : "+u1.getId());
				System.out.println("name : "+u1.getName());
				System.out.println("Phone : "+u1.getPhone());
				System.out.println("card : "+u1.getCard());
				System.out.println("pan id : "+u1.getCard().getId());
				System.out.println("number"+u1.getCard().getNumber());
				System.out.println("pincode : "+u1.getCard().getPincode());
				System.out.println("dob : "+u1.getCard().getDob());
				
			}
		}else {
			System.out.println("Invalid id");
		}
		

	}

}
