package cg.com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CollectionHandling {
	
    public static void countFrequencies(ArrayList<Integer> arr) {
    	HashMap<Integer, Integer> freqMap = new HashMap<>();
    	for(int i=0; i<arr.size(); i++) {
    		int num = arr.get(i);
    	
    	if (freqMap.containsKey(num)) {
    		freqMap.put(num, freqMap.get(num)+1);
    	}else {
    		freqMap.put(num, 1);
    	}
    	
   	}
    }
	public static void main(String[] args) {
		//FREQUENCY COUNT OF EACH ELEMENT
	  ArrayList<Integer> arr = new ArrayList<>();
	  arr.add(1);
	  arr.add(2);
	  arr.add(12);
	  arr.add(14);
	  arr.add(10);
	  
	 
	  
	  
	  
		
		//sort the list of strings by length
//        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "pear", "grape");
//        Collections.sort(strings, (a, b) -> {
//            if (a.length() == b.length()) {
//                return a.compareTo(b);
//            }
//            return a.length() - b.length();
//        });
//        System.out.println(strings);

		
		//find duplicates in an ArrayLists
//		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 50);
//		HashSet<Integer> seen = new HashSet<>();
//		HashSet<Integer> duplicate = new HashSet<>();
//		
//		for(int i=0; i<list.size(); i++) {
//			int number = list.get(i);
//			if(seen.contains(number)) {
//				duplicate.add(number);
//			}
//			else {
//				seen.add(number);
//			}
//		}
//			
//			if(duplicate.isEmpty()) {
//				System.out.println("No Duplicates");
//			}else {
//				System.out.println("Duplicates: " + duplicate);
//		}
//			
		
		
		
		

	}

}
