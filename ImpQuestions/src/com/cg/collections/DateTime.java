package com.cg.collections;


//	Write a Java program that takes a birthdate as input in the format yyyy-MM-dd and calculates the current age of the person using the LocalDate class.
//	Example:
//	•	Input: 1990-06-15
//	•	Output: 34 (assuming current year is 2024)
//	Hint: Use Period.between() method to find the difference in years between the birthdate and the current date.
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birthdate
        System.out.print("Enter your birthdate (yyyy-MM-dd): ");
        String birthDateInput = scanner.nextLine();

        // Parse the input to a LocalDate object
        LocalDate birthDate = LocalDate.parse(birthDateInput);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the difference in years using Period.between()
        Period period = Period.between(birthDate, currentDate);
        
        // Output the age (the number of full years)
        System.out.println("Your current age is: " + period.getYears());

        // Close the scanner
        scanner.close();
    }
}

//2. Find Day of the Week for a Given Date
//Write a program that prompts the user to input a date in the format yyyy-MM-dd and outputs the day of the week for that date.
//Example:
//•	Input: 2023-10-08
//•	Output: Sunday
//Hint: Use LocalDate.getDayOfWeek() to get the day.
public class DayOfWeekCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a date in the format yyyy-MM-dd
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parse the input string into a LocalDate object
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Get the day of the week
        String dayOfWeek = date.getDayOfWeek().toString();

        // Print the day of the week (in title case)
        System.out.println("The day of the week is: " + dayOfWeek);

        // Close the scanner
        scanner.close();
    }
}

//3. Time Difference Between Two Time Zones
//Write a program to calculate the time difference between two cities. The program should prompt the user to input the city names (e.g., "Asia/Kolkata" and "Europe/London") and calculate the time difference in hours.
//Hint: Use ZoneId and ZonedDateTime to get the current time for each city and find the difference using Duration.between().

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class TimeDifferenceCalculator {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first city (time zone)
        System.out.print("Enter the first city time zone (e.g., Asia/Kolkata): ");
        String city1 = scanner.nextLine();

        // Prompt the user for the second city (time zone)
        System.out.print("Enter the second city time zone (e.g., Europe/London): ");
        String city2 = scanner.nextLine();

        try {
            // Get the current time for both cities using ZonedDateTime and ZoneId
            ZonedDateTime timeInCity1 = ZonedDateTime.now(ZoneId.of(city1));
            ZonedDateTime timeInCity2 = ZonedDateTime.now(ZoneId.of(city2));

            // Calculate the time difference between the two cities
            Duration duration = Duration.between(timeInCity1, timeInCity2);

            // Get the time difference in hours
            long hoursDifference = duration.toHours();

            // Print the result
            System.out.println("The time difference between " + city1 + " and " + city2 + " is: " + hoursDifference + " hours.");
        } catch (Exception e) {
            // Handle any invalid time zone input
            System.out.println("Invalid time zone. Please ensure you enter a valid city time zone.");
        }

        scanner.close();
    }
}
//4. Add and Subtract Time
//Write a Java program that takes a date and time as input and adds or subtracts a given number of days, months, and hours. Use LocalDateTime for the operations.
//Example:
//•	Input: 2024-01-01T10:00, days to add: 5, months to subtract: 1, hours to add: 12
//•	Output: 2023-12-06T22:00
//Hint: Use plusDays(), minusMonths(), and plusHours() methods from LocalDateTime.

import java.time.LocalDateTime;
import java.util.Scanner;

public class DateTimeManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the initial date-time
        System.out.print("Enter the date-time (yyyy-MM-ddTHH:mm): ");
        String inputDateTime = scanner.nextLine();
        LocalDateTime dateTime = LocalDateTime.parse(inputDateTime);

        // Input the number of days to add or subtract
        System.out.print("Enter the number of days to add/subtract: ");
        int days = scanner.nextInt();

        // Input the number of months to add or subtract
        System.out.print("Enter the number of months to add/subtract: ");
        int months = scanner.nextInt();

        // Input the number of hours to add or subtract
        System.out.print("Enter the number of hours to add/subtract: ");
        int hours = scanner.nextInt();

        // Perform the operations
        dateTime = dateTime.plusDays(days);  // Add or subtract days
        dateTime = dateTime.minusMonths(months);  // Add or subtract months
        dateTime = dateTime.plusHours(hours);  // Add or subtract hours

        // Output the resulting date-time
        System.out.println("Resulting date-time: " + dateTime);
    }
}


//5. Find the Number of Days Between Two Dates
//Write a program that prompts the user to input two dates in the format yyyy-MM-dd and finds the number of days between them.
//Example:
//•	Input: 2024-01-01, 2024-12-31
//•	Output: 365
//Hint: Use ChronoUnit.DAYS.between() to calculate the number of days between two LocalDate objects.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysBetweenDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Date format to parse the input dates
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Input the first date
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateStr = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateStr, dateFormatter);

        // Input the second date
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateStr = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateStr, dateFormatter);

        // Calculate the number of days between the two dates
        long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);

        // Output the result
        System.out.println("Number of days between " + firstDate + " and " + secondDate + " is: " + daysBetween);
    }
}

//6. Check if a Year is a Leap Year
//Write a program that takes a year as input and checks if it is a leap year.
//Example:
//•	Input: 2024
//•	Output: true (since 2024 is a leap year)
//Hint: Use Year.isLeap() from java.time.Year.

import java.time.Year;
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year using Year.isLeap()
        boolean isLeapYear = Year.isLeap(year);

        // Output the result
        System.out.println("Is the year " + year + " a leap year? " + isLeapYear);
    }
}

//7. Format Current Date and Time in Custom Format
//Write a program that outputs the current date and time in the format: "dd-MM-yyyy HH:mm:ss".
//Hint: Use DateTimeFormatter to format LocalDateTime as per the required pattern.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define the desired format pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Format the current date-time using the formatter
        String formattedDateTime = currentDateTime.format(formatter);

        // Output the formatted date and time
        System.out.println("Current date and time in format dd-MM-yyyy HH:mm:ss: " + formattedDateTime);
    }
}

//8. Convert String to Date and Back to String in Different Format
//Write a program that takes a date string in the format yyyy/MM/dd and converts it into the format dd-MM-yyyy.
//Example:
//•	Input: 2024/01/01   •	Output: 01-01-2024
//Hint: Use DateTimeFormatter to parse and format the date string.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the date string in format yyyy/MM/dd
        System.out.print("Enter a date in format yyyy/MM/dd: ");
        String inputDateStr = scanner.nextLine();

        // Define the input and output format patterns
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Parse the input string into a LocalDate object
        LocalDate date = LocalDate.parse(inputDateStr, inputFormatter);

        // Format the LocalDate object into the desired string format
        String formattedDate = date.format(outputFormatter);

        // Output the formatted date
        System.out.println("Formatted date: " + formattedDate);
    }
}


//9. Schedule Event at Fixed Interval
//Write a program that simulates scheduling an event at a fixed interval, for example, every second Monday of the month at 10 AM for the next 6 months. Print the dates and times of the events.
//Hint: Use TemporalAdjusters to find the second Monday of the month and LocalTime.of() to set the time.
//
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class EventScheduler {
    public static void main(String[] args) {
        // Get the current month and start from the current date
        LocalDate currentDate = LocalDate.now();

        // Define the number of months for which the event needs to be scheduled
        int monthsToSchedule = 6;

        // Print the event details for the next 6 months
        System.out.println("Scheduled events (Second Monday of each month at 10:00 AM):");
        
        for (int i = 0; i < monthsToSchedule; i++) {
            // Get the first day of the current month
            LocalDate firstOfMonth = currentDate.plusMonths(i).withDayOfMonth(1);
            
            // Find the second Monday of the month using TemporalAdjusters
            LocalDate secondMonday = firstOfMonth.with(TemporalAdjusters.dayOfWeekInMonth(2, java.time.DayOfWeek.MONDAY));
            
            // Set the event time to 10:00 AM
            LocalTime eventTime = LocalTime.of(10, 0);

            // Combine the date and time
            System.out.println(secondMonday + " " + eventTime);
        }
    }
}


//10. Calculate Duration Between Two Time Instants
//Write a program that calculates the exact duration (in hours, minutes, and seconds) between two LocalDateTime inputs.
//Example:
//•	Input: 2024-01-01T08:00 and 2024-01-01T20:45
//•	Output: 12 hours, 45 minutes, 0 seconds
//Hint: Use Duration.between() to calculate the duration and break it down into hours, minutes, and seconds.

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DurationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define the format for the input date-time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        
        // Input the first date-time
        System.out.print("Enter the first date-time (yyyy-MM-dd'T'HH:mm): ");
        String firstDateTimeStr = scanner.nextLine();
        LocalDateTime firstDateTime = LocalDateTime.parse(firstDateTimeStr, formatter);
        
        // Input the second date-time
        System.out.print("Enter the second date-time (yyyy-MM-dd'T'HH:mm): ");
        String secondDateTimeStr = scanner.nextLine();
        LocalDateTime secondDateTime = LocalDateTime.parse(secondDateTimeStr, formatter);
        
        // Calculate the duration between the two date-times
        Duration duration = Duration.between(firstDateTime, secondDateTime);
        
        // Extract hours, minutes, and seconds from the duration
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;
        
        // Output the result
        System.out.printf("Duration: %d hours, %d minutes, %d seconds%n", hours, minutes, seconds);
    }
}









