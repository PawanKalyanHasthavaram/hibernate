package org.jsp.employeeapp.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jsp.employeeapp.dto.Employee;

public class EmployeeDao {
	Session s=new Configuration().configure("HibernateConfurationFile.cfg.xml").buildSessionFactory().openSession();
	public Employee saveEmployee(Employee employee) {
		Transaction t=s.beginTransaction();
		s.save(employee);
		t.commit();
		return employee;
	}
	public Employee updateEmployee(Employee employee) {
		Employee dbEmployee=s.get(Employee.class, employee.getId());
		if(dbEmployee!=null) {
			Transaction t=s.beginTransaction();
			dbEmployee.setName(employee.getName());
			dbEmployee.setDesg(employee.getDesg());
			dbEmployee.setPhone(employee.getPhone());
			dbEmployee.setSalary(employee.getSalary());
			dbEmployee.setPassword(employee.getPassword());
			t.commit();
			return dbEmployee;
			
		}
		return null;
		
	}

}
