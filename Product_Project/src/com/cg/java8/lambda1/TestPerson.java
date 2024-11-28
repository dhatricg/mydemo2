package com.cg.java8.lambda1;

import java.util.ArrayList;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person("Dhatri", 22);
		Person p2 = new Person("Preeti", 20);
		
		ArrayList<Person> al = new ArrayList<>();
		al.add(p1);
		al.add(p2);
		
		al.forEach((x)->{System.out.println(x);} );
		
	
		
		
		// TODO Auto-generated method stub

	}

}
