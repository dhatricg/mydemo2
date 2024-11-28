package com.cg.imp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class que6 {
	public static List<Integer> findPermutationIndices(String s, String pattern){
		 List<Integer> result = new ArrayList<>();
		 if(s.length() < pattern.length()) {
			 return result;
		 }
		 
		 int[] patternfreq = new int[26];
		 int[] windowfreq = new int[26];
		 
		 for(char ch:pattern.toCharArray()) {
			 patternfreq[ch - 'a']++;
		 }
		 
		 for(int i=0; i<pattern.length(); i++) {
			 windowfreq[s.charAt(i) - 'a']++;
		 }
		 
		 if(matches(patternfreq, windowfreq)) {
			 result.add(0);
		 }
		 
		 for(int i=pattern.length(); i<s.length(); i++) {
			 windowfreq[s.charAt(i) - 'a']++;
			 
			 windowfreq[s.charAt(i - pattern.length()) - 'a']--;
			 
			 if(matches(patternfreq, windowfreq)) {
				 result.add(i-pattern.length() + 1);
			 }
		 }
		 return result;
	}
	
        
        
private static boolean matches(int[] patternfreq, int[] windowfreq) {
		for(int i=0; i<26; i++) {
			if(patternfreq[i] != windowfreq[i]) {
				return false;
			}
		}
		return true;
	}




public static void main(String[] args) {
  que6 source = new que6();
  String s = "cccaeabcdcd";
  String pattern = "abc";
  List<Integer> result = source.findPermutationIndices(s, pattern);
  System.out.println(result);
  
}
}
