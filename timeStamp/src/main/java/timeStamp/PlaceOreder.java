package timeStamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PlaceOreder {

	public static void main(String[] args) {
		FoodOrder order = new FoodOrder();
		order.setAddress("BTM Layout");
		order.setFood_item("sangati with groundnut pachadi with ghee over flowing on groundnut pachadi");
		order.setCost(10);
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		manager.persist(order);
		EntityTransaction t=manager.getTransaction();
		t.begin();
		t.commit();

	}
}
