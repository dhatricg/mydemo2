package com.cg;

public class Order {
	private int OrderId;
	private String date;
	private String CustomerName;
	
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
		return "Order [OrderId=" + OrderId + ", date=" + date + ", CustomerName=" + CustomerName + "]";
	}
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
