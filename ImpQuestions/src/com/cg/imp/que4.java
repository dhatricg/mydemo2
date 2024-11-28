package com.cg.imp;

//The HR department at Capgemini wants to analyze employee data for better insights. They have provided a list of employees with their names and salaries. The task is to write a Java program that performs the following:
//1. Accept a list of employees as input. Each employee has a name and a salary.
//2. Remove duplicate employees based on names. 3. Sort the employees by their names alphabetically.
//4. Group employees by their salary ranges (e.g., <30K, 30K-50K, >50K).
//5. Find the employee with the highest salary in each salary range and return their names.
//6. Calculate the average salary of all employees and return the result.

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Double.compare(employee.salary, salary) == 0 &&
               Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}

class EmployeeProcessor {

    // Method to process the employees (remove duplicates and sort by name)
    public List<Employee> processEmployees(List<Employee> employees) {
        // Remove duplicates using a Set
        Set<Employee> uniqueEmployees = new HashSet<>(employees);

        // Sort by name
        return uniqueEmployees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
    }

    // Method to group employees by salary range
    public Map<String, List<Employee>> groupBySalaryRange(List<Employee> employees) {
        Map<String, List<Employee>> salaryGroups = new HashMap<>();

        for (Employee employee : employees) {
            String salaryRange;
            if (employee.getSalary() < 30000) {
                salaryRange = "<30K";
            } else if (employee.getSalary() <= 50000) {
                salaryRange = "30K-50K";
            } else {
                salaryRange = ">50K";
            }

            salaryGroups.computeIfAbsent(salaryRange, k -> new ArrayList<>()).add(employee);
        }

        return salaryGroups;
    }

    // Method to find the highest salary in each range
    public Map<String, Employee> findHighestSalaryInEachRange(Map<String, List<Employee>> groupedEmployees) {
        Map<String, Employee> highestSalaryInRange = new HashMap<>();

        for (Map.Entry<String, List<Employee>> entry : groupedEmployees.entrySet()) {
            String range = entry.getKey();
            List<Employee> employeesInRange = entry.getValue();

            Employee highestSalaryEmployee = employeesInRange.stream()
                    .max(Comparator.comparingDouble(Employee::getSalary))
                    .orElse(null);

            highestSalaryInRange.put(range, highestSalaryEmployee);
        }

        return highestSalaryInRange;
    }

    // Method to calculate the average salary
    public double calculateAverageSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
    }
}

public class que4 {

    public static void main(String[] args) {
        // Sample input list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Rohit", 45000),
            new Employee("Anita", 55000),
            new Employee("Suresh", 28000),
            new Employee("Rohit", 45000),
            new Employee("Priya", 35000),
            new Employee("Anita", 60000),
            new Employee("Kumar", 52000)
        );

        // Create EmployeeProcessor instance
        EmployeeProcessor processor = new EmployeeProcessor();

        // 1. Process Employees (remove duplicates and sort by name)
        List<Employee> processedEmployees = processor.processEmployees(employees);
        System.out.println("Processed Employees: " + processedEmployees);

        // 2. Group Employees by Salary Range
        Map<String, List<Employee>> groupedEmployees = processor.groupBySalaryRange(processedEmployees);
        System.out.println("Grouped Employees by Salary Range: " + groupedEmployees);

        // 3. Find Highest Salary in Each Range
        Map<String, Employee> highestSalaryInEachRange = processor.findHighestSalaryInEachRange(groupedEmployees);
        System.out.println("Highest Salary in Each Range: " + highestSalaryInEachRange);

        // 4. Calculate Average Salary
        double averageSalary = processor.calculateAverageSalary(processedEmployees);
        System.out.printf("Average Salary: %.2f\n", averageSalary);
    }
}

