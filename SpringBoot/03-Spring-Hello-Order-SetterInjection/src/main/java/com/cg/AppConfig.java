package com.cg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
	@Bean(name="empBean")        //it is used to declare a method producing a bean
	public Order empBean() {
		return new Order(1, "15/11/2024", "Alex");
	}

}