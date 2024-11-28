package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Order {
	private int OrderId;
	private String date;
	private String CustomerName;
	private int quantity;
	private Product product;
	
	
	
	public Order(int orderId, String date, String customerName, int quantity, Product product) {
		super();
		OrderId = orderId;
		this.date = date;
		CustomerName = customerName;
		this.quantity = quantity;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}
    @Autowired
	public void setProduct(Product product) {
		this.product = product;
	}

	public Order(int orderId, String date, String customerName) {
		super();
		OrderId = orderId;
		this.date = date;
		CustomerName = customerName;
	}
	
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	
	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", date=" + date + ", CustomerName=" + CustomerName + ", quantity="
				+ quantity + ", product=" + product + "]";
	}
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	
	

}
