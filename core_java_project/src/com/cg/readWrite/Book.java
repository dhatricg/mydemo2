package com.cg.readWrite;

public class Book {
	int id;
	String title;
	String publisher;
	
	public Book(int id, String title, String publisher) {
		super();
		this.id = id;
		this.title = title;
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", publisher=" + publisher + "]";
	}
	
	

	
}
