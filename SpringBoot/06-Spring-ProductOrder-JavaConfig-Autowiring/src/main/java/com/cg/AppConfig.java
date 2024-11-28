package com.cg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Product product(){
		Product product = new Product();
		product.setPrice(1000);
		product.setProductName("Toy");
		return product;
	}
	@Bean
	public Order order(){
		Order order = new Order();
		order.setQuantity(5);
		
		return order;
	}

}
