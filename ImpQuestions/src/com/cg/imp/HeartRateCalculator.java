package com.cg.imp;
//que1

//-Arjun is a new intern at Capgemini. He is responsible for creating a Heart Rate calculator which takes resting heart rate and age as input. But there is a catch here - the input is given as a string.
//Sample Input
//• The part before @ is the resting heart rate and - represents decimal points(.).
//• The part after @ is the age.
//• So, the Resting Heart Rate = 72.5 and Age = 25.
//Max Heart Rate = 220 - Age
//Target Heart Rate = (Max Heart Rate - Resting Heart Rate) * 0.7 + Resting Heart Rate
//Your task here is to implement a Java code based on the following specifications. Note that your code should match the specification in a precise manner. Consider default visibility of classes, data fields, and methods as public unless mentioned otherwise.
//Specifications
//Tasks. You have to help Arjun complete the following functions:
//Class Definitions:
//Class HeartRateCalculator.
//• Method Definitions:
//o retumRestingHeartRate(String str): Method takes data in String str and returns the Resting Heart Rate in decimal format.
//• Return type: float

public class HeartRateCalculator {

    // Method to return resting heart rate
    public float returnRestingHeartRate(String str) {
        // Split the input string at '@'
        String[] parts = str.split("@");
        // Replace '-' with '.' in the resting heart rate part to convert it to decimal
        String restingHeartRateStr = parts[0].replace('-', '.');
        // Convert to float and return
        return Float.parseFloat(restingHeartRateStr);
    }

    // Method to return age
    public int returnAge(String str) {
        // Split the input string at '@' to get the age part
        String[] parts = str.split("@");
        // Convert and return the age part
        return Integer.parseInt(parts[1]);
    }

    // Method to calculate max heart rate
    public int calculateMaxHeartRate(int age) {
        // Max heart rate formula: 220 - age
        return 220 - age;
    }

    // Method to calculate target heart rate
    public float calculateTargetHeartRate(float restingHeartRate, int maxHeartRate) {
        // Target heart rate formula
        return (maxHeartRate - restingHeartRate) * 0.7f + restingHeartRate;
    }

    // Method to check fitness level based on target heart rate
    public String checkFitnessLevel(float targetHeartRate) {
        // If target heart rate is between 120 and 160, return "Fit", otherwise "Unfit"
        if (targetHeartRate >= 120 && targetHeartRate <= 160) {
            return "Fit";
        } else {
            return "Unfit";
        }
    }

    public static void main(String[] args) {
        // Sample input
        String input = "72-5@25";

        // Create an instance of HeartRateCalculator
        HeartRateCalculator calculator = new HeartRateCalculator();

        // Get the resting heart rate
        float restingHeartRate = calculator.returnRestingHeartRate(input);
        System.out.println("Resting Heart Rate: " + restingHeartRate);

        // Get the age
        int age = calculator.returnAge(input);
        System.out.println("Age: " + age);

        // Calculate the max heart rate
        int maxHeartRate = calculator.calculateMaxHeartRate(age);
        System.out.println("Max Heart Rate: " + maxHeartRate);

        // Calculate the target heart rate
        float targetHeartRate = calculator.calculateTargetHeartRate(restingHeartRate, maxHeartRate);
        System.out.println("Target Heart Rate: " + targetHeartRate);

        // Check fitness level
        String fitnessLevel = calculator.checkFitnessLevel(targetHeartRate);
        System.out.println("Fitness Level: " + fitnessLevel);
    }
}

