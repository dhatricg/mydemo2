package com.cg.emp;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cg.emp.persistance.HibernateUtil;

 
public class UseEmployee {
    public static void insertEmp(Employee e) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Start a transaction
            transaction = session.beginTransaction();
            // Save the employee object
            session.save(e);
            // Commit the transaction
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public static void getEmployeeById(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Retrieve the employee by ID
            Employee emp = session.get(Employee.class, id);
            if (emp != null) {
                System.out.println("Employee found:");
                System.out.println("ID: " + emp.getId());
                System.out.println("First Name: " + emp.getFirstName());
                System.out.println("Last Name: " + emp.getLastName());
                System.out.println("Salary: " + emp.getSalary());
            } else {
                System.out.println("No employee found with ID: " + id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void listAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // HQL query to fetch all employees
            List<Employee> emplist = session.createQuery("from Employee", Employee.class).list();
            if (emplist.isEmpty()) {
                System.out.println("No employees found.");
            } else {
                for (Employee e : emplist) {
                    System.out.println(e); // Prints the employee object (ensure toString() is overridden)
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
    public static void delete(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            // Retrieve the employee by ID
            Employee e1 = session.get(Employee.class, id);
            if (e1 != null) {
                session.delete(e1); // Delete the employee
                System.out.println("Employee with ID " + id + " deleted successfully.");
            } else {
                System.out.println("No employee found with ID " + id + ". Deletion failed.");
            }
 
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    public static void update(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession(); Scanner sc = new Scanner(System.in)) {
            transaction = session.beginTransaction();
            // Retrieve the employee by ID
            Employee e1 = session.get(Employee.class, id);
            if (e1 != null) {
                // Prompt for new values
                System.out.println("Current details of Employee ID " + id + ":");
                System.out.println("First Name: " + e1.getFirstName());
                System.out.println("Last Name: " + e1.getLastName());
                System.out.println("Salary: " + e1.getSalary());
 
                System.out.print("Enter new first name (or press Enter to keep the current): ");
                String newFirstName = sc.nextLine();
                if (!newFirstName.isEmpty()) {
                    e1.setFirstName(newFirstName);
                }
 
                System.out.print("Enter new last name (or press Enter to keep the current): ");
                String newLastName = sc.nextLine();
                if (!newLastName.isEmpty()) {
                    e1.setLastName(newLastName);
                }
 
                System.out.print("Enter new salary (or press Enter to keep the current): ");
                String salaryInput = sc.nextLine();
                if (!salaryInput.isEmpty()) {
                    e1.setSalary(Integer.parseInt(salaryInput));
                }
 
                // Update the employee
                session.update(e1);
                System.out.println("Employee with ID " + id + " updated successfully.");
            } else {
                System.out.println("No employee found with ID " + id + ". Update failed.");
            }
 
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         boolean running = true;
 
         while (running) {
             System.out.println("Employee Management System");
             System.out.println("1. Insert Employee");
             System.out.println("2. Get Employee by ID");
             System.out.println("3. List All Employees");
             System.out.println("4. Delete Employee by ID");
             System.out.println("5. Update Employee by ID");
             System.out.println("6. Exit");
             System.out.print("Choose an option: ");
             int choice = sc.nextInt();
             sc.nextLine(); // Consume newline left-over
 
             switch (choice) {
                 case 1:
                     // Insert Employee
                     System.out.println("Enter first name: ");
                     String name = sc.nextLine();
                     System.out.println("Enter last name: ");
                     String lname = sc.nextLine();
                     System.out.println("Enter salary: ");
                     Integer salary = sc.nextInt();
                     Employee empObj1 = new Employee(name, lname, salary);
                     insertEmp(empObj1);
                     break;
 
                 case 2:
                     // Get Employee by ID
                     System.out.print("Enter Employee ID to fetch: ");
                     int employeeId = sc.nextInt();
                     getEmployeeById(employeeId);
                     break;
 
                 case 3:
                     // List All Employees
                     System.out.println("Listing all employees:");
                     listAll();
                     break;
 
                 case 4:
                     // Delete Employee by ID
                     System.out.print("Enter Employee ID to delete: ");
                     int deleteId = sc.nextInt();
                     delete(deleteId);
                     break;
 
                 case 5:
                     // Update Employee by ID
                     System.out.print("Enter Employee ID to update: ");
                     int updateId = sc.nextInt();
                     sc.nextLine(); // Consume newline left-over
                     System.out.print("Enter new first name: ");
                     String firstName = sc.nextLine();
                     System.out.print("Enter new last name: ");
                     String lastName = sc.nextLine();
                     System.out.print("Enter new salary: ");
                     Integer newSalary = sc.nextInt();
                     update(updateId);
                     break;
 
                 case 6:
                     // Exit
                     System.out.println("Exiting the program.");
                     running = false;
                     break;
 
                 default:
                     System.out.println("Invalid choice. Please select again.");
             }
             System.out.println(); // Add a blank line for better readability
         }
 
         sc.close(); // Close the scanner
     }
 
     // Assume the methods insertEmp, getEmployeeById, listAll, delete, and update are defined here

 
}