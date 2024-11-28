package com.cg.nonBlocking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		String str = "I am Dhatri";
		String filePath = "data.txt";
		Files.writeString(Paths.get(filePath), str);
        System.out.println("the content is written to the file");

	}
	

}
