package com.cg.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UseCriteriaQuery {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaUnit");
		EntityManager em  = emf.createEntityManager();
		
		EmployeeCriteriaQuery ecq = new EmployeeCriteriaQuery(em);
		//List<Employee> emp = ecq.listAllEmployeesUsingCriteriaQuery();
		List<Employee> emp = ecq.findEmployeeByName("priti");
		
		for(Employee emp1: emp) {
			System.out.println(emp1);
		}
		
        List<Employee> emp1 = ecq.findEmployeeByName("priti");
		
		for(Employee emp2: emp1) {
			System.out.println(emp2);
		}
		
		System.out.println("count"+ " " + ecq.countEmployees());
		
		

	}

}
