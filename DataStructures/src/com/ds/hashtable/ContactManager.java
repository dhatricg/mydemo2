package com.ds.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class ContactManager {
	public void addContact(String email, String name, long phoneNum, String address ){
		
		
		
	}
	
	public void updateContact() {
		
	}
      

	public static void main(String[] args) {
		Hashtable<String, Contact> contacts = new Hashtable<>();
		Contact c1 = new Contact("Dhatri", "99999", "Dhamtari");
		Contact c2 = new Contact("Priti", "88888", "Shirdi");
		Contact c3 = new Contact("Ashwini","77777", "Pune");
		
		contacts.put("dhatrisahu@gmail.com", c1);
		contacts.put("Priti@gmail.com", c2);
		contacts.put("Ashwini2gmail.com", c3);
		
		System.out.println(contacts);
		
		
		
		Enumeration<Contact> e = contacts.elements();
		while(e.hasMoreElements()) {
			Contact val = e.nextElement();
			
			
		}
				
		// TODO Auto-generated method stub

	}

}
