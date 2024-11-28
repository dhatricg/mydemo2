package com.cg.vaibhaviG;

//code in java in one block
import java.util.Scanner;


abstract class Employee {

abstract void setSalary(int salary);
abstract int getSalary();
abstract void setGrade(String grade);
abstract String getGrade();


void label() {
   System.out.println("Employee's data:");
}
}


class Engineer extends Employee {
private int salary;
private String grade;
@Override
void setSalary(int salary) {
   this.salary = salary;
}
@Override
int getSalary() {
   return salary;
}
@Override
void setGrade(String grade) {
   this.grade = grade;
}
@Override
String getGrade() {
   return grade;
}
}


class Manager extends Employee {
private int salary;
private String grade;
@Override
void setSalary(int salary) {
   this.salary = salary;
}
@Override
int getSalary() {
   return salary;
}
@Override
void setGrade(String grade) {
   this.grade = grade;
}
@Override
String getGrade() {
   return grade;
}
}


/*public class Test1 {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = Integer.parseInt(sc.nextLine());  
   // Loop through the number of inputs
   for (int i = 0; i < n; i++) {
       String[] input = sc.nextLine().split(" ");  
       if (input[0].equals("ENGINEER")) {
           Engineer e = new Engineer();
           e.setGrade(input[1]);
           e.setSalary(Integer.parseInt(input[2]));
           e.label();
           System.out.println("GRADE: " + e.getGrade());
           System.out.println("SALARY: " + e.getSalary());
       } else if (input[0].equals("MANAGER")) {
           Manager e = new Manager();
           e.setGrade(input[1]);
           e.setSalary(Integer.parseInt(input[2]));
           e.label();
           System.out.println("GRADE: " + e.getGrade());
           System.out.println("SALARY: " + e.getSalary());
       }
   }
   sc.close();
}
}*/

/*
 * ABHIJEET
 * import java.io.*;
import java.util.*;
 
abstract class Employee {
    // Abstract methods for subclasses to implement
    public abstract void setSalary(int salary);
    public abstract int getSalary();
    public abstract void setGrade(String grade);
    public abstract String getGrade();
    // Concrete method for labeling
    public void label() {
        System.out.println("Employee's data:");
    }
}
 
class Engineer extends Employee {
    private int salary;
    private String grade;
 
    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
 
    @Override
    public int getSalary() {
        return this.salary;
    }
 
    @Override
    public void setGrade(String grade) {
        this.grade = grade;
    }
 
    @Override
    public String getGrade() {
        return this.grade;
    }
}
 
class Manager extends Employee {
    private int salary;
    private String grade;
 
    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
 
    @Override
    public int getSalary() {
        return this.salary;
    }
 
    @Override
    public void setGrade(String grade) {
        this.grade = grade;
    }
 
    @Override
    public String getGrade() {
        return this.grade;
    }
}
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String type = input[0];
            String grade = input[1];
            int salary = Integer.parseInt(input[2]);
 
            if (type.equals("ENGINEER")) {
                Engineer e = new Engineer();
                e.setSalary(salary);
                e.setGrade(grade);
                e.label();
                System.out.println("GRADE : " + e.getGrade());
                System.out.println("SALARY : " + e.getSalary());
            } else if (type.equals("MANAGER")) {
                Manager m = new Manager();
                m.setSalary(salary);
                m.setGrade(grade);
                m.label();
                System.out.println("GRADE : " + m.getGrade());
                System.out.println("SALARY : " + m.getSalary());
            }
        }
        sc.close();
    }
}*/
