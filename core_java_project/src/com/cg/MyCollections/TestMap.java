package com.cg.MyCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Dhatri", 999);
		map.put("Alice", 888);
		map.put("Bob", 101);
		map.put(null, 000);
		map.put(null, 102);
		map.put(null, null);
		
		map.entrySet();   //returns a set view
		
		Set<Map.Entry<String,Integer>> st = map.entrySet();
		for(Map.Entry<String, Integer> me1: st) {
			System.out.println(me1.getKey() + ":");
			System.out.println(me1.getValue());
			
		}
		
//		for (String str: map.keySet()) {
//			System.out.println(str);
//		}
//		
//		for (Integer str2: map.values()) {
//			System.out.println(str2);
//		}
		
		Iterator<Entry<String,Integer>> it =  map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, Integer> entry = it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
//		 
//	    Set<Map.Entry<String,Integer>> st = hm.entrySet();  //returns Set view
//	    for(Map.Entry<String,Integer> me1:st)
//	    { System.out.print(me1.getKey()+":");
//	      System.out.println(me1.getValue());
//	    }
 
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
