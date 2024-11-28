package com.cg.javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class WritingFile {
 
 
	public static void main(String[] args) {
		
		FileOutputStream fos=null;
		try {
		File file= new File("A.txt");
		String myContent= "Welcome to JAVA";
		fos= new FileOutputStream(file);
		
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		byte b[]=myContent.getBytes();
		try {
			fos.write(b);
			//fos.flush();
			System.out.println("Success..");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		}
		catch(FileNotFoundException e) {
			System.out.println("Error: File Not Found..");
		}
		finally {
			if(fos!=null)
				try {
					fos.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
 
	}
 
}

	

	

