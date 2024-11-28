package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
  //      Employee emp = (Employee) ctx.getBean("empbean");
        
        Employee emp = ctx.getBean("empbean", Employee.class);
        System.out.println(emp);
        
        
        
        
	}

}
