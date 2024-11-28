package com.cg.emp;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EmployeeDAO {
	EntityManager em;

	public EmployeeDAO(EntityManager em) {
		this.em = em;
	}
	
	  public Employee findEmployee(int employeeId) {
	        Employee employee = em.find(Employee.class, employeeId);  // Find the employee by ID
	        if (employee == null) {
	            System.out.println("Employee not found with ID: " + employeeId);
	            throw new RuntimeException("Employee not found with ID: " + employeeId);
	        }
	        return employee;
	    }
	  
	public void updateEmployee(Employee e1) {
		EntityTransaction transaction = em.getTransaction();
	    try {
	        transaction.begin();
	        // Merging the employee object to ensure any changes are persisted
	        em.merge(e1);
	        transaction.commit();
	        System.out.println("Employee updated successfully with ID: " + e1.getId());
	    } catch (RuntimeException e) {
	        if (transaction.isActive()) {
	            transaction.rollback();
	        } else {
	            throw e;
	        }
	    }
		
	}
	
	public void merged(Employee e1) {
		 EntityTransaction transaction = em.getTransaction();
		    try {
		        transaction.begin();
		        // This will either update the entity if it exists or insert if it's new (based on the id)
		        em.merge(e1);
		        transaction.commit();
		        System.out.println("Employee has been merged with ID: " + e1.getId());
		    } catch (RuntimeException e) {
		        if (transaction.isActive()) {
		            transaction.rollback();
		        } else {
		            throw e;
		        }
		    }
		
	}
	
	public void deleteEmployee(int employeeId) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            
            // Find the employee by ID
            Employee employee = em.find(Employee.class, employeeId);
            
            if (employee != null) {
                // Remove the employee from the database
                em.remove(employee);
                System.out.println("Employee with ID " + employeeId + " has been deleted.");
            } else {
                System.out.println("Employee with ID " + employeeId + " not found. No deletion performed.");
            }
            
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Error occurred during deletion: " + e.getMessage());
            throw e;
        }
    }
	
	public void createEmployee(Employee emp) {
		EntityTransaction transaction = em.getTransaction();
		try {
			
		transaction.begin();
		em.persist(emp);
		transaction.commit();
		System.out.println("Employee has been created with this id");
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

}
