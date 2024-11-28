package com.ds.Streams2;

import java.util.function.Predicate;

public class CheckPalindrome {
	
	public static void main(String[] args) {
		Predicate<String> P=str->{String sb= new StringBuilder(str).reverse().toString();
		//String str1=sb.reverse().toString();
		return (str.equals(sb));
		};
		String res= "madam";
		System.out.println(P.test(res));
		// TODO Auto-generated method stub

	}
	

}
