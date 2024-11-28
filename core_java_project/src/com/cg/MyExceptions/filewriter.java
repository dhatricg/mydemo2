package com.cg.MyExceptions;
import java.io.FileWriter;
public class filewriter {
	
	

	public static void main(String[] args) {
		
		String filePath = "output.txt";
		
		try (FileWriter writer = new FileWriter(filePath)){
			writer.write("Hello world");
			writer.write("\n"+"welcome");
			writer.write("bye");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("End");
		// TODO Auto-generated method stub

	}

}
