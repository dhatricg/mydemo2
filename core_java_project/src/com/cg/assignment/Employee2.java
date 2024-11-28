package com.cg.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Address{
	private String street;
	private String city;
	private String state;
	private String zipcode;
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}


	public Address(String street, String city, String state, String zipcode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	
	
}

public class Employee2 {

	private List<Address> addresses;
	private int id;
	private String name;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee2 id: " + id + ", name=" + name + ", Addresses: " + addresses;
	}
	
	public List<Address> getAddresses(){
		return addresses;
	}


	public Employee2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.addresses = new ArrayList<>();
	}
	
	private void addAddress(Address address) {
		addresses.add(address);
		
		
	}


	public static void main(String[] args) {
		Employee2 emp1 = new Employee2(101, "Alice");
		
		emp1.addAddress(new Address("Shivaji" , "Pune" , "Maharastra" , "411257"));
		emp1.addAddress(new Address("Sarojani" , "Dhamtari" , "Chhattisgarh" , "493663"));
		
		System.out.println(emp1);
		
		
		
		
		// TODO Auto-generated method stub

	}


	
}
