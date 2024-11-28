package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseOrder {

	public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Order emp = ctx.getBean("order", Order.class);
        
        Product add = ctx.getBean("product", Product.class);
        System.out.println(emp);
        
        
        
	}

}
