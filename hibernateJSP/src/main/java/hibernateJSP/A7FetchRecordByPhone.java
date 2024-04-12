package hibernateJSP;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class A7FetchRecordByPhone {

	public static void main(String[] args) {
		String jpql="select m from Marchant m where m.phone=?1";
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=manager.createQuery(jpql);
		q.setParameter(1, 456L);
		try {
			Marchant m=(Marchant)q.getSingleResult();
			System.out.println(m.getName());
			
		}catch(NoResultException e) {
			System.out.println("invalid");
		}
		
 
	}

}
