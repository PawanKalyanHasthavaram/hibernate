package oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveDepartmentAndEmployee {

	public static void main(String[] args) {
		Department d=new Department();
		d.setName("development");
		d.setLocation("Btm Layout");
		Employee e=new Employee();
		e.setName("ABC");e.setDesg("Developer");e.setSalary(50000);
		Employee e1=new Employee();
		e1.setName("xyz");e1.setDesg("HR");e1.setSalary(30000);
		Employee e2=new Employee();
		e2.setName("PQR");e2.setDesg("manager");e2.setSalary(555555);
		List<Employee> emps=new ArrayList<Employee>();
		emps.add(e);emps.add(e1);emps.add(e2);
		d.setEmps(emps);
		
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		manager.persist(d);
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		transaction.commit();
		
		
		
	}

}
