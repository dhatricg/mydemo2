package com.dsa;
import java.util.*;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String value = sc.nextLine();
		int n = value.length();
		String num = ""; 
		for(int i=n-1; i>=0; i--) {
			num += value.charAt(i); 
			
		if(value == num) {
			System.out.println("Yes");
		}
		else {
			System.out.println("no");
		}
		}
			
		// TODO Auto-generated method stub

	}

}
