package com.cg.Yasho;

import java.util.Scanner;

//import com.cg.Encrypter;
//import com.Validator;
 
/*
* Create the Encrypter class here.
*/
class Encrypter {
    public static String getEncryptedName(String name) throws IllegalArgumentException {
        Validator valid = new Validator();

        if (!valid.validate(name)) {
            throw new IllegalArgumentException("Try again with valid name");
        }
 
       
        StringBuilder encName = new StringBuilder(name);
        encName.reverse(); 
        return encName.toString().toLowerCase(); 
    }
}
 
class Validator {
    public boolean validate(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
                return false;
            }
        }
        return true;  
    }
}
 
/*public class Solution {
    private static final Scanner INPUT_READER = new Scanner(System.in);
    public static void main(String[] args) {
        String name = INPUT_READER.nextLine();
        try {
            System.out.println(Encrypter.getEncryptedName(name));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}*/
