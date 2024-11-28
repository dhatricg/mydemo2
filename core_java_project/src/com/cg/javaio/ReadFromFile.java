package com.cg.javaio;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class ReadFromFile {
 
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=null;
		try {
		File file=new File("A.txt");
		 fis=new FileInputStream(file);
		
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		while(bis.available()>0) {
			System.out.print((char)bis.read());
		}
	}
	catch(FileNotFoundException e) {
		System.out.print("Error:File not Found!!");
	}
		catch(IOException e1) {
			System.out.print(e1.getMessage());
		}
		finally {
			fis.close();
			
		}
 
	}
 
}
