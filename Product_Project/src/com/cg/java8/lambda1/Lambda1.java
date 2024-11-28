package com.cg.java8.lambda1;

import java.util.ArrayList;

public class Lambda1 {
	

	public static void main(String[] args) {
		Functional ad2=( int a, int  b)->{ return (a+b);  };
        System.out.println(ad2.add(100,200));  

	}
	
	ArrayList<String> al = new ArrayList<>();
	al.forEach((x) -> {System.out.println(x);} );
}
