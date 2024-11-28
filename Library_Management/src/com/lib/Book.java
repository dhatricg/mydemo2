package com.lib;

 class Book extends LibraryItem {
	int pages;
	String isbn;
	

    public Book(int id, String title, String author, int pages, String isbn) {
		super(id, title, author);
		this.pages = pages;
		this.isbn = isbn;
	}


	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println(isbn + " " + pages);
		
	}
}
