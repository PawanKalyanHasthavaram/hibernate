package hibernateJSP;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class A6FetchAllRecords {

	public static void main(String[] args) {
		String jpql="select m from Marchant m";
		//here table name should be entity name java.lang.IllegalArgumentException:
		//for example if u keep table name in sql is "marchant" your entity name is "Marchant"
		//you have to type "Marchant" otherwise it throw Illegal
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		
		
		Query q=manager.createQuery(jpql);
		List<Marchant> marchants=q.getResultList();
		for(Marchant m:marchants) {
			System.out.println("id:"+m.getId());
			System.out.println("Name:"+m.getName());
			System.out.println("Phone:"+m.getPhone());
			System.out.println("Email:"+m.getEmail());
			System.out.println("Gst_number"+m.getGst_number());
			System.out.println("-----------------------------");
			
		}

	}

}
