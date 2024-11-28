package com.cg.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		Date currDate = new Date();
		System.out.println(currDate);
		String dateString = "2024-10-10";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date DOJ = sdf.parse(dateString);
		
		System.out.println(DOJ);
		
		// Formatting a date
        SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE, MMMM dd, yyyy 'at' hh:mm:ss a");
        String formattedDate = sdf2.format(currDate);
        System.out.println("Formatted Date: " + formattedDate);
		// TODO Auto-generated method stub
        
       

	}

}
