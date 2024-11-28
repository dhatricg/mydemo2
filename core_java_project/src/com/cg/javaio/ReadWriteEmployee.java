package com.cg.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteEmployee {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employeej emp1 = new Employeej(1, "Dhatri", 30000);
		FileOutputStream fos = new FileOutputStream("emp.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		try {
			oos.writeObject(emp1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileInputStream fis = new FileInputStream("emp.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.println(ois.readObject());
	
		
	

	}

}
