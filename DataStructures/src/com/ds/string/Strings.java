package com.ds.string;

public class Strings {
	

	public static void main(String[] args) {
		String s = "Apples";          //Strings are immutable
		s.concat("Mark");
		String str = "Dhatri"
		
		s.replace(s, str);
		System.out.println(s.length());
		System.out.println(s.substring(2));
		System.out.println(s.substring(3));
		
		System.out.println(s.charAt(4));
		
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		String s1 = "Apples";
		String s2 = "Mango";
		String s3 = new String("Apples");
		
		System.out.println(s1.compareToIgnoreCase(s2));
		
		System.out.println();
		
		System.out.println(s1==s2);           //checks reference
		System.out.println(s1.equals(s2));   //check values
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));

		
		
		System.out.println(s);
		System.out.println(s.concat("Mark"));
		
		StringBuilder sb1 = new StringBuilder("Hello");  //Non-Synchronized
		
		StringBuffer sb2 = new StringBuffer("Hello");     //Synchronized
		
		sb1.append("Capgemini");
		
		
		System.out.println();
		System.out.println(sb1);
		
		System.out.println(s1.trim());
		
		sb2.append("Capgeminis");
		System.out.println(sb2);
		
		String s4 = "Welcome to capgemini while we are feeling hot";
		s4.split(" ");
		System.out.println(s4);
		
		
		//accept the a long sentence from the user find total no. of words present in the santance, check palindrome it, check vowels
		//write frequency of each word, count total no. spaces
		//count total no. of special characters, duplicates
		
		
		// TODO Auto-generated method stub

	}

}
