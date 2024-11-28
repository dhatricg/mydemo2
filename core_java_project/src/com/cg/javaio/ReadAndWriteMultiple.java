package com.cg.javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadAndWriteMultiple {
	 
		    private static final String FILE_NAME = "employees.dat";
	 
		    public static void main(String[] args) {
		        Employeej[] employees = {
		            new Employeej(101,"Alex", 60000f),
		            new Employeej(102,"Mark", 70000f),
		            new Employeej(103,"Sherlin", 80000f)
		        };
	 
		        // Write the employees array to a file
		        writeEmployees(employees);
	 
		        // Read the employees array from the file
		        Employeej[] readEmployees = readEmployees();
		        for (Employeej emp : readEmployees) {
		            System.out.println(emp);
		        }
		    }
	 
		    private static void writeEmployees(Employeej[] employees) {
		        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
		            oos.writeObject(employees);
		            System.out.println("Employees written to file.");
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
	 
		    private static Employeej[] readEmployees() {
		        Employeej[] employees = null;
		        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
		            employees = (Employeej[]) ois.readObject();
		            System.out.println("Employees read from file.");
		        } catch (IOException | ClassNotFoundException e) {
		            e.printStackTrace();
		        }
		        return employees;
		    }
	}
	 


