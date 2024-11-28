package com.pro;

public class Product {
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}
	private int id;
	String name;
	double price;

	
		public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}


		
		
		// TODO Auto-generated method stub



	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	void display() {
		System.out.println(id+" "+name+" "+price);
	
	}
	
	}


