package com.cg.imp;
//que2

//The Meteorological Department has designed a simulation to bring awareness regarding extreme weather conditions. 
//In this simulation, the minimum acceptable temperature should be -30°C and the maximum should be 50°C. 
//Help them by writing a Java program to check the functionality of the simulation software. 
//If the input temperature is between -30 and 50, then return the message "Valid Temperature", 
//else the program should alert with the message "TemperaturelnvalidException" by throwing a user-defined exception TemperaturelnvalidException.

//Custom exception class to handle invalid temperatures
class TemperatureInvalidException extends Exception {
 // Constructor that accepts a custom error message
 public TemperatureInvalidException(String message) {
     super(message);
 }
}

//Class to represent an individual temperature
class Temperature {
 String temperature;
}

//Class that implements the logic for setting and validating temperatures
class TemperatureImplementation {

 // Method to set the temperature and validate it
 public String setTemperature(Temperature t, int temp) {
     try {
         // Validate if the temperature is within the valid range
         if (temp < -30 || temp > 50) {
             // If out of valid range, throw custom exception
             throw new TemperatureInvalidException("TemperatureInvalidException");
         } else {
             // If valid, set the temperature status as "Valid Temperature"
             t.temperature = "Valid Temperature";
         }
     } catch (TemperatureInvalidException e) {
         // If exception occurs, set the status as "Invalid Temperature"
         t.temperature = "Invalid Temperature";
     }
     // Return the temperature status
     return t.temperature;
 }
}

public class Main {
 public static void main(String[] args) {
     // Create an instance of Temperature and TemperatureImplementation
     Temperature t = new Temperature();
     TemperatureImplementation implementation = new TemperatureImplementation();

     // Test temperatures
     int[] testTemperatures = {20, -40, 60, -25, 45};

     // Iterate over the test temperatures
     for (int temp : testTemperatures) {
         // Print input temperature and the result of validation
         System.out.print("Input Temperature: " + temp + " => ");
         System.out.println(implementation.setTemperature(t, temp));
     }
 }
}

