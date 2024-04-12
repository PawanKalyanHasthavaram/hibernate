package oneToOneBiDirectional;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUserAndCard {

	public static void main(String[] args) {
		User u=new User();
		u.setName("ABC");
		u.setPhone(9999999999L);
		PanCard card=new PanCard();
		card.setDob(LocalDate.parse("1947-08-08"));
		card.setNumber("abcdef123456");
		card.setPincode(516115);
		card.setUser(u);
		u.setCard(card);
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(u);
		transaction.begin();
		transaction.commit();
	}

}
