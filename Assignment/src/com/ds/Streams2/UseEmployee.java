package com.ds.Streams2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class UseEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Dhatri", "HR", 60000, "male");
		Employee emp2 = new Employee(2, "Priti", "Sales", 40000, "female");
		Employee emp3 = new Employee(3, "Vista", "HR", 50000, "male");
		Employee emp4 = new Employee(4, "Mansi", "SDE", 80000, "female");
		
		ArrayList<Employee> emplist = new ArrayList<>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		
		
		List<Employee> hrEmployee = emplist.stream().filter(x -> "HR".equals(x.getDepartment())).collect(Collectors.toList());
		// TODO Auto-generated method stub
        hrEmployee.forEach(System.out::println);
        
        //list all the employees using stream
         emplist.stream().map(str->str.getName()).forEach(System.out::println);    
         
         List<String> nameEmp = emplist.stream().map(Employee::getName).collect(Collectors.toList());
         nameEmp.forEach(System.out::println);
         
       //  List<Employee> salEmp = emplist.stream().sorted((e1, e2)->Double.compare(e1.getSalary(), e2.getSalary())).collect(Collectors.toList());
       //  salEmp.forEach(System.out::println);
         
         List<Employee> sal2Emp = emplist.stream().sorted((e1, e2)->Double.compare(e2.getSalary(), e1.getSalary())).collect(Collectors.toList());
         sal2Emp.forEach(System.out::println);
         
         //display salary in sorted order
         
         //display all employee data
         List<Employee> displayEmp = emplist.stream().collect(Collectors.toList());
         displayEmp.forEach(System.out::println);
         
       //total salary of all employees
        double total  = emplist.stream()
        		       .map(Employee::getSalary)
        		       .reduce(0.0, Double::sum);//.collect(Collectors.toList());
        
    	List<Employee> top3 = emplist.stream().sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).limit(3).collect(Collectors.toList());
        top3.forEach(System.out::println);
        
        List<Employee> skip2 = emplist.stream().skip(2).collect(Collectors.toList());
        skip2.forEach(System.out::println);
        
	
	
    //display top 3 salaries(sort first then apply limit)
	//skip first 2 and display rest
	//display all employee who does not belong to the sales department
      List<Employee> notBelongSales = emplist.stream().filter(emp -> !emp.getDepartment().equalsIgnoreCase("Sales")).collect(Collectors.toList());
      notBelongSales.forEach(System.out::println);
       
	//check no employee belongs to the sales department
	//find min and max salary
       
      Optional<Employee> maxSal = emplist.stream().max((e1, e2)->Double.compare(e1.getSalary(), e2.getSalary()));
      System.out.println(maxSal);
      
     //give first object of the list
      Optional<Double> first = emplist.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).findFirst();
      System.out.println(first);
      
      //find second highest salary 
      Double second = emplist.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().orElse(null);
      System.out.println(second);
      
      //sort based on rating, make a float rating, sort in two levels salary and rating
      //List<Employee> doubleSort = emplist.stream().sorted(Comparator.reverseOrder()).sorted(Comparator.reverseOrder());
      
      Optional<String> o1 = Optional.of("hello");
      System.out.println(o1.isPresent());
      System.out.println(o1.get());
      System.out.println(o1.isEmpty());
      System.out.println(o1.isPresent()?true:false);
      
      //add a new property gender, display all female, all male and highest salary of male , highest salary of female
      //also display the average highest salary of male/female
      
      List<Employee> genf = emplist.stream().filter(x -> "female".equals(x.getGender())).collect(Collectors.toList());
      hrEmployee.forEach(System.out::println);
      
      List<Employee> genM = emplist.stream().filter(x -> "male".equals(x.getGender())).collect(Collectors.toList());
      hrEmployee.forEach(System.out::println);
      
      Employee highSalaryM = emplist.stream().filter(x->"male".equals(x.getGender())).max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
    		  .orElse(null);
      System.out.println(highSalaryM);
      
     Employee highSalaryF = emplist.stream().filter(x->"female".equals(x.getGender())).max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).orElse(null);
      System.out.println(highSalaryF);
      
      Employee highSalary = emplist.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).orElse(null);
      System.out.println(highSalary);
      
      Map<String, Double> avg = emplist.stream().collect(Collectors.groupingBy
              (Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
System.out.println("Average age of Male and Female Employees:: " + avg);
      
      
      
      
      
      
      
      
	}
	
}
