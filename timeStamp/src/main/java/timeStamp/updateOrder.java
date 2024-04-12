package timeStamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class updateOrder {
	public static void main(String[] args) {
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		FoodOrder order=manager.find(FoodOrder.class, 1);
		order.setFood_item("paneer");
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		transaction.commit();
	}

}
