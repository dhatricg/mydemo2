package com.lib;

public class LibraryItem {
	int id = 1;
	String title = "";
	String author = "";
	static int itemCount = 0;
	
	public LibraryItem(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		itemCount++;
	}
	
	public static int getItemCount() {
		return itemCount;
	}
	
	public void displayInfo() {
		System.out.println(id);
		System.out.println(title);
		System.out.println(author);
		
	}
	
	

}
