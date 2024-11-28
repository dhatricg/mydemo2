package com.cg.regex;

public class UseRegex {

	public static void main(String[] args) {
		TestRegex obj = new TestRegex();
		
		System.out.println(obj.isValidPhoneNumber("443783999"));
		System.out.println(obj.TestChar("abcd12"));
		System.out.println(obj.TextAlpha("abc"));
		System.out.println(obj.TestIPadd("192.011.202.146"));
		System.out.println(obj.test("8878901014"));
		System.out.println(obj.isValidSSN("856-45-6789"));
		System.out.println(obj.password("A12bcd12"));
		
		System.out.println(obj.wordsEndingWith("moon", "full moon is there"));
		
		// TODO Auto-generated method stub

	}

}
