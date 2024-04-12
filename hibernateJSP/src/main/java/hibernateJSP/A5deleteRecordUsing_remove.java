package hibernateJSP;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class A5deleteRecordUsing_remove {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter id:");
		int id=scan.nextInt();
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Marchant m=manager.find(Marchant.class, id);
		if(m!=null) {
			manager.remove(m);
			transaction.begin();
			transaction.commit();
			System.out.println(id+" deleted");
		}else {
			System.out.println("Invalid id");
		}
	}

}
