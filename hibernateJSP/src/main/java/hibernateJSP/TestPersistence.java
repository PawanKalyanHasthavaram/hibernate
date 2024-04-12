package hibernateJSP;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestPersistence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		System.out.println(factory);

	}

}