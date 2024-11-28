package com.lib;

public class UseLibrary {

	public static void main(String[] args) {
		LibraryItem[] libraryItems = new LibraryItem[15];
		
		libraryItems[0] = new Book(1, null, null, 200, null);
		libraryItems[1] = new Magzine(2, null, null, 300);
		libraryItems[2] = new Journal(3, null, null, 300, 0);
		
		
		for(LibraryItem item : libraryItems) {
			if (item != null) {
				item.displayInfo();
				System.out.println();
			}
		}
		// TODO Auto-generated method stub
        
		System.out.println(LibraryItem.getItemCount());
	}

}
