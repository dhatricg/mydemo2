package com.cg.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
	public static boolean isValidPhoneNumber(String phone) {
        String regex = "^\\d{9}$";    //d=dights and //D for non digits
        //s for while digits
        return Pattern.matches(regex, phone);
    }
	
	public boolean TestChar(String num){
		String regex1 = "[a-z]+$";
		return Pattern.matches(regex1, num);
				
	}
	
	public boolean TextAlpha(String val) {
		String regex2 = "^[a-zA-Z]+$";
		return Pattern.matches(regex2, val);
	}
	
	public boolean TestIPadd(String IP) {
		String regex3 = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
		return Pattern.matches(regex3, IP);
	}
	
	public boolean test(String t) {
		//return Pattern.matches("\\D", t);
		//return Pattern.matches("[a-z A-Z 0-9][6]", t);
		return Pattern.matches("[789]\\d{9}", t);
		
	}
	
	public boolean isValidSSN(String s) {
		return Pattern.matches("^\\d{3}-\\d{2}-\\d{4}", s);
	}
	
	public boolean password(String p) {
		return Pattern.matches("^[a-zA-Z].*[0-9]*{8,}", p);
		
	}
	
	public static List<String> wordsEndingWith(String str, String string) {
        String regex = "\\b\\w*" + string + "\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        List<String> words = new ArrayList<>();
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
	}
        
   
	
	
 

}
