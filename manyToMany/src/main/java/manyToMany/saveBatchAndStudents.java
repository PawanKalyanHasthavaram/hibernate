package manyToMany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saveBatchAndStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batch b1=new Batch();
		b1.setBatch_code("JBT-JERADD-A4");
		b1.setSubject("Advance Java");
		b1.setTrainer("GuruRaja");
		Batch b2=new Batch();
		b2.setBatch_code("JBT-JERADD-A3");
		b2.setSubject("Hibernate");
		b2.setTrainer("Sathish");
		Batch b3=new Batch();
		b3.setBatch_code("JBT-JERADD-A2");
		b3.setSubject("React Js");
		b3.setTrainer("Harish");
		Student s1=new Student();
		s1.setName("messi");
		s1.setPerc(90);
		s1.setYop(2000);
		Student s2=new Student();
		s2.setName("Ronoldo");
		s2.setPerc(90);
		s2.setYop(2001);
		Student s3=new Student();
		s3.setName("Neymer");
		s3.setPerc(90);
		s3.setYop(2002);
		List<Student> forB1=new ArrayList<Student>(Arrays.asList(s1,s2,s3));
		List<Student> forB2=new ArrayList<Student>(Arrays.asList(s1,s3));
		List<Student> forB3=new ArrayList<Student>(Arrays.asList(s1,s2,s3));
		b1.setStudents(forB1);
		b2.setStudents(forB2);
		b2.setStudents(forB3);
		List<Batch> forS1=new ArrayList<Batch>(Arrays.asList(b1,b2,b3));
		List<Batch> forS2=new ArrayList<Batch>(Arrays.asList(b1,b3));
		List<Batch> forS3=new ArrayList<Batch>(Arrays.asList(b1,b2,b3));
		
		s1.setBatchs(forS1);
		s2.setBatchs(forS2);
		s3.setBatchs(forS3);
		
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);
		transaction.begin();
		transaction.commit();
		
		

	}

}
