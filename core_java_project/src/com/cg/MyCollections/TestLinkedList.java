package com.cg.MyCollections;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {
		List <String> l1 = new LinkedList<>();   //Generic
		
		
		l1.add("Hello");
		l1.add("Dhatri");
		l1.add("Welcome!");
		
		
		//String s = l1.get(0);
		
		System.out.println(l1.get(2));
		
		LinkedList <String> l2 = new LinkedList<>();  //use wrapper class to make int type linkedlist
			l2.add("hello");
			l2.addLast("hi");
			
			l2.addFirst("yes");
		
			System.out.println(l2);
		
		// TODO Auto-generated method stub
		

	}

}
