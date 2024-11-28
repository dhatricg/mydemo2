package com.cg.MyCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestArraylists {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		 
		
	    
	    
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
       ArrayList<String> str = new ArrayList<>();
		
		str.add("Hello");
		str.add("World");
		str.add("welcome!");
		
		//for(String :  ) for each loop
		
		
		// TODO Auto-generated method stub
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println("Element is:" + it.next());
	  }
		
		while(it.hasPrevious()) {
			System.out.println("Element is:" + it.previous());
	  }
		
		
		
		
		

	}

}
