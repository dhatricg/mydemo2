package com.cg.regex;

import java.util.regex.Pattern;

public class Validate {
	public boolean ValidateUserName(String u) {
		return Pattern.matches("[a-zA-Z 0-9 !@#$%&]{5,10}", u);
	}
	public boolean ValidatePassword(String p) {
		return Pattern.matches("[a-z A-Z 0-9 @#$%^&]{8,}", p);
	}
	
	public boolean email(String e) {
		return Pattern.matches("^[\\w-\\.]+@[\\w-]+\\.[a-z]{2,4}$", e);
	}
	
	

	public static void main(String[] args) {
		Validate str = new Validate();
		System.out.println(str.ValidateUserName("@Vista02"));
		System.out.println(str.ValidatePassword("@dhatri00"));
		System.out.println(str.email("dhatrisahu9@gmail.com"));
		
		// TODO Auto-generated method stub

	}
	//find the consonants in a sentence using regex

}
