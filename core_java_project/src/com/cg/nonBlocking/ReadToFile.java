package com.cg.nonBlocking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadToFile {

	public static void main(String[] args) throws IOException {
	
	String filePath = "data.txt";
	String content = Files.readString(Paths.get(filePath));
	System.out.println(content);
	
	//append
	
	String content1 ="Marvel";
	Files.writeString(Paths.get(filePath), content1, StandardOpenOption.APPEND);
	System.out.println("Append done.");
	
	String content12= Files.readString(Paths.get(filePath));
	System.out.println(content);
     
	}

}
