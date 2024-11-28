package com.ds.hashtable;

import java.util.Hashtable;

public class TestHashTable {
	

	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("Laptop", 10);
		ht.put("Table", 20);
		ht.put("Phone", 60);
		ht.put("Notebook", 40);
		ht.put("Charger", 50);
		
		for(String str:ht.keySet()) {
			System.out.println(str);
		}
		
		for(int val: ht.values()) {
			System.out.println(val);
		}
		
		ht.clear();
		System.out.println(ht.isEmpty());
		
		

		
		
		ht.remove("Laptop");
		System.out.println(ht.containsKey("Laptop"));
		System.out.println(ht.contains(20));
		
		
		System.out.println("Total number of laptops are:"+ ht.get("Laptop"));
		
		
		System.out.println(ht);
		// TODO Auto-generated method stub

	}

}
