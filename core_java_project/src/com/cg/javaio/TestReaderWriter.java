package com.cg.javaio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReaderWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("empp.txt");
		
			fw.write("Welcome Dhatri!");
			fw.close();
		
			
		FileReader fr = new FileReader("empp.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}

	}

	
	//Assignment: add, view, update, delete, search a book
}
