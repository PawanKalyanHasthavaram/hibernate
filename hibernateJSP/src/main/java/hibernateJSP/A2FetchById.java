package hibernateJSP;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class A2FetchById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Id:");
		int id=scan.nextInt();
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Marchant m=manager.find(Marchant.class,id);
		if(m!=null) {
			System.out.println("Merchant Id: "+m.getId());
			System.out.println("Marchant name: "+m.getName());
			System.out.println("Marchant phone number: "+m.getPhone());
			System.out.println("Marchant Email Id: "+m.getEmail());
			System.out.println("Marchant Gst Number: "+m.getGst_number());
		}else {
			System.out.println("Invalid Marchant Id");
		}

	}

}
