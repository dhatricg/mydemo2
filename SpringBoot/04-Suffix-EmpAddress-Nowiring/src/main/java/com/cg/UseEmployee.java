package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
  //      Employee emp = (Employee) ctx.getBean("empbean");
        
		
		Address add = ctx.getBean("add", Address.class);
		
        Employee emp = ctx.getBean("empbean", Employee.class);
        System.out.println(emp);
        
      
    
        
        
	}

}