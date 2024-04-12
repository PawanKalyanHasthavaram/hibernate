package hibernateJSP;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class A8NameQuery {

	public static void main(String[] args) {
		System.out.println("1.verify marchant by phone and password");
		System.out.println("2.VERIFY marchant by email and password");
		System.out.println("3.verify marchant by id and password");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=manager.createNamedQuery("findByName");
		q.setParameter(1, "ppp");
		Marchant m=(Marchant)q.getSingleResult();
		System.out.println(m.getName());
		

	}

}
