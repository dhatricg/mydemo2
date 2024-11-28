package com.cg.HarshWardhan;

import java.util.Scanner;

abstract class Employee {
    // Abstract methods to be implemented by subclasses
    abstract void setSalary(int salary);
    abstract int getSalary();
    abstract void setGrade(String grade);
    abstract String getGrade();

    // Concrete method
    void label() {
        System.out.println("Employee's data:");
    }
}

// Engineer class extending Employee
class Engineer extends Employee {
    private int salary;
    private String grade;

    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    int getSalary() {
        return this.salary;
    }

    @Override
    void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    String getGrade() {
        return this.grade;
    }
}

// Manager class extending Employee
class Manager extends Employee {
    private int salary;
    private String grade;

    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    int getSalary() {
        return this.salary;
    }

    @Override
    void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    String getGrade() {
        return this.grade;
    }
}

/*public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            if (input[0].equals("ENGINEER")) {
                Engineer e = new Engineer();
                e.setGrade(input[1]);
                e.setSalary(Integer.parseInt(input[2]));
                e.label();
                System.out.println("GRADE : " + e.getGrade());
                System.out.println("SALARY : " + e.getSalary());
            } else if (input[0].equals("MANAGER")) {
                Manager m = new Manager();
                m.setGrade(input[1]);
                m.setSalary(Integer.parseInt(input[2]));
                m.label();
                System.out.println("GRADE : " + m.getGrade());
                System.out.println("SALARY : " + m.getSalary());
            }
        }

        sc.close();
    }
}*/
