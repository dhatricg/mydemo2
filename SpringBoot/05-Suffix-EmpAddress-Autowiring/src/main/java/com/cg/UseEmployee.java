package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//autowiring is of three types
//ByName: same bean name as in the property of pojo class
//ByType: it checks the data type 

public class UseEmployee {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
  //      Employee emp = (Employee) ctx.getBean("empbean");
        
		
		Address add = ctx.getBean("address1", Address.class);
		
        Employee emp = ctx.getBean("empbean", Employee.class);
        System.out.println(emp);
        
      
    
        //product class: name and price , within order class have product object and quantity , add show order detail method in order
        //autowire ByName
	}

}
