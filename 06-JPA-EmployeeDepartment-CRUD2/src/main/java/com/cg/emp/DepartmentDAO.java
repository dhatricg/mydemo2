package com.cg.emp;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class DepartmentDAO {
	EntityManager em;
	public DepartmentDAO(EntityManager em) {
		super();
		this.em = em;
	}
 
	public void createDepartmentWithEmployee(Department department, Set<Employee>employees) {
		EntityTransaction transaction=em.getTransaction();
		try {
			transaction.begin();
			department.setEmployees(employees);
			em.persist(department);
			transaction.commit();
			System.out.println("department created");
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
	
    public void UpdateDepartment(long id, Department department) {
    	EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(department);
            transaction.commit();
            System.out.println("Department updated: " + department.getDeptName());
        } catch (RuntimeException e) {
            if (transaction.isActive()) {
                transaction.rollback();  
            }
            throw e;
        }
    }
    
    public Department findDepartment(long id) {
        Department department = em.find(Department.class, id);  // Find department by ID
        if (department == null) {
            System.out.println("Department not found with ID: " + id);
            throw new RuntimeException("Department not found with ID: " + id);  // Handle case when department is not found
        }
        
        // If the department exists, print the associated employees
        System.out.println("Department: " + department.getDeptName());
        if (department.getEmployees() != null && !department.getEmployees().isEmpty()) {
            System.out.println("Employees in this department: ");
            for (Employee employee : department.getEmployees()) {
                System.out.println(employee.getFirstName() + " " + employee.getLastName());
            }
        } else {
            System.out.println("No employees in this department.");
        }
        
        return department;  // Return the department object
    }
}
 
