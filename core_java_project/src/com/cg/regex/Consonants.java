package com.cg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Consonants {
	public int countConsonants(String sentence) {
		String reg = "[^aeiouAEIOU]";
		int count = 0;
		Pattern p = Pattern.compile(reg);
		Matcher match = p.matcher(sentence);
		
		while(match.find()) {
			count++;
		}
		
		return count;
		
	}
	
	public int countVowels(String sentence) {
		String reg = "[aeiouAEIOU]";
		int count = 0;
		Pattern p = Pattern.compile(reg);
		Matcher match = p.matcher(sentence);
		
		while(match.find()) {
			count++;
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		Consonants word = new Consonants();
		System.out.println(word.countConsonants("Dhatri"));
		System.out.println(word.countVowels("Dhatri"));
		
		
		// TODO Auto-generated method stub

	}

}
