package com.cg.imp;
//que8
//In the mystical realm of Enchanted Lexicon, brave adventurers 
//seek to unlock the ancient secrets hidden within the magical words 
//guarded by the Wordkeeper.Once such adventurer, Josh, embarks on a
//quest to decipher the mystical code of the Wordkeeper and unlock the 
//profound wisdom concealed within.Assist Josh with your C# skills to 
//code the secret word. Functionalities. In the class WordMaster, implement
//the below specified method:public int AcceptGuess(string secretWord, string codedWord):
//This method accepts the adventurer's attempt to decipher the coded 
//word and reveals its true form (The first letter of the secret word 
//must be capitalized and the last letter should be small).

//Custom Exception class
class InvalidGuessException extends Exception {
 // Constructor to pass the error message
 public InvalidGuessException(String message) {
     super(message);
 }
}

//WordMaster class to handle the secret word and guessing logic
class WordMaster {
 
 // Method to accept the guess and return the length of the secret word if the guess is correct
 public int acceptGuess(String secretWord, String codedWord) throws InvalidGuessException {
     // Process the secret word to generate the coded version
     String generatedCode = generateCodedWord(secretWord);
     
     // If the guess is correct, return the length of the secret word
     if (codedWord.equals(generatedCode)) {
         return secretWord.length();
     } else {
         // If the guess is incorrect, throw the custom exception
         throw new InvalidGuessException("Incorrect guess. Try again");
     }
 }

 // Helper method to generate the coded word from the secret word
 private String generateCodedWord(String secretWord) {
     // Trim spaces around the word
     secretWord = secretWord.trim();

     // Get the first letter, last letter and the middle part of the secret word
     char firstLetter = secretWord.charAt(0);
     char lastLetter = secretWord.charAt(secretWord.length() - 1);

     // Capitalize the first letter and make the last letter lowercase
     String formattedFirstLetter = String.valueOf(Character.toUpperCase(firstLetter));
     String formattedLastLetter = String.valueOf(Character.toLowerCase(lastLetter));
     
     // Get the middle part of the word (from the second to the second-last character)
     String middlePart = secretWord.substring(1, secretWord.length() - 1);

     // Calculate positions of the first letter
     int reverseAlphaPos = 26 - (Character.toUpperCase(firstLetter) - 'A' + 1);
     int alphaPos = Character.toUpperCase(firstLetter) - 'A' + 1;

     // Calculate the length of the word
     int wordLength = secretWord.length();

     // Generate the final coded word
     String codedWord = reverseAlphaPos + "" + alphaPos + wordLength + formattedLastLetter;

     return codedWord;
 }
}

//Main class to test the program
public class Wordkeeper {
 public static void main(String[] args) {
     WordMaster wordMaster = new WordMaster();
     
     try {
         // Read inputs from the user (In real use case, you can use Scanner or other input methods)
         String secretWord = "Word Game";  // Secret word example
         String codedWord = "4239e";       // Coded word guess example
         
         // Accept the guess and get the result
         int result = wordMaster.acceptGuess(secretWord, codedWord);

         // If the guess is correct, display the magical points
         System.out.println("Hurray! You've guessed right, You are earning " + (result * 10) + " magical points!");
     } catch (InvalidGuessException ex) {
         // Catch the exception and display the error message
         System.out.println(ex.getMessage());
     }
 }
}

