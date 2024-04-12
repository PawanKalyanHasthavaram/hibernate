package oneToMany;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class A1FetchById {

	public static void main(String[] args) {
		String jpql="select d.emps from Department d where d.id=?1";
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter department id:");
		int id=scan.nextInt();
		Query q=manager.createQuery(jpql);
		q.setParameter(1, id);
		List<Employee> emps=q.getResultList();
		for(Employee e:emps) {
			System.out.println("id:"+e.getId());
			System.out.println("name:"+e.getName());
			System.out.println("Designation:"+e.getDesg());
			System.out.println("salary:"+e.getSalary());
			System.out.println("---------------------------");
			
		}

		
	}

}
