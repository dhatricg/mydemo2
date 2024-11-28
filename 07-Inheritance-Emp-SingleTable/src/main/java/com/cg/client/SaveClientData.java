package com.cg.client;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.entity.Employee;
import com.cg.entity.Person;
import com.cg.entity.Student;

public class SaveClientData {
	EntityManager em;
	
	public SaveClientData(EntityManager em) {
		super();
		this.em = em;
	}

	public void createEmployee(Person emp) {
		EntityTransaction transaction = em.getTransaction();
		try {
			
		transaction.begin();
		em.persist(emp);
		transaction.commit();
		System.out.println("Person has been created with this id");
		}
		catch(RuntimeException e) {
			if(transaction.isActive()) {
				transaction.rollback();
			}
			else {
				throw e;
			}
		}
	}

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaUnit");
		EntityManager em  = emf.createEntityManager();

		SaveClientData  data = new SaveClientData(em);
		
		Person person = new Person("Dhatri", "Female");
		
		//data.createEmployee(person);
		
        Employee e = new Employee(3000.0, "sales", new BigDecimal(100), "dhatri@gmail.com");
        
        Student s = new Student("KPS", 3000.0, "A");
        
        
       
		e.setName("dhatri");
		e.setGender("Female");
		data.createEmployee(e);
		
		

	}

}
