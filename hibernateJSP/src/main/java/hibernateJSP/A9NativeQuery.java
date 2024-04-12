package hibernateJSP;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class A9NativeQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=manager.createNativeQuery("select * from marchant",Marchant.class);
//		q.setParameter(1, "ppp");
		List<Marchant> marchants=q.getResultList();
//		Marchant m=(Marchant)q.getSingleResult();
//		System.out.println(m.getName());
		for(Marchant m:marchants) {
			System.out.println("Merchant Id: "+m.getId());
			System.out.println("Marchant name: "+m.getName());
			System.out.println("Marchant phone number: "+m.getPhone());
			System.out.println("Marchant Email Id: "+m.getEmail());
			System.out.println("Marchant Gst Number: "+m.getGst_number());
		}

	}

}
