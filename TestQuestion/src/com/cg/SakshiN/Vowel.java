package com.cg.SakshiN;
/*
 * a password detection system consist pssword with lowercase english letters only and vowels are(a,e,i,o,u)
to check the strength of password  in one operation any charater of string can either be incremented or 
decremented example 'f' can be incremented to 'g' or decremeneted to 'e' note thay character 'a' cannot 
be decremented and 'z' cannnot be incremented find minimum number of operations in which paswword can be 
made similar.
 
consider example
password=hack 
the 'h' can be changed to 'i' in one operation the resuktant string is "iack" which has 2 vowels ('i','a') and 2 consonants('c','k')
and hence string is similar. return 1, the miniumn nunmber of opertaion required;
paswword has length even
 
 */


/*private static boolean isVowel(char c) {
    return "aeiou".indexOf(c) != -1;
}
 
// Helper method to find the minimum number of operations to change a character to a vowel
private static int minOperationsToVowel(char c) {
    // Vowels: a, e, i, o, u
    int[] vowelDistances = {Math.abs(c - 'a'), Math.abs(c - 'e'), Math.abs(c - 'i'), 
                            Math.abs(c - 'o'), Math.abs(c - 'u')};
    Arrays.sort(vowelDistances);
    return vowelDistances[0];
}
 
// Helper method to find the minimum number of operations to change a character to a consonant
private static int minOperationsToConsonant(char c) {
    // Iterate through all characters and check for the nearest consonant
    int minDist = Integer.MAX_VALUE;
    for (char ch = 'a'; ch <= 'z'; ch++) {
        if (!isVowel(ch)) {
            minDist = Math.min(minDist, Math.abs(c - ch));
        }
    }
    return minDist;
}
 
public static int countMinimumOperations(String password) {
    int n = password.length();
    int vowelCount = 0;
    int consonantCount = 0;
 
    // Step 1: Count the vowels and consonants in the password
    for (char c : password.toCharArray()) {
        if (isVowel(c)) {
            vowelCount++;
        } else {
            consonantCount++;
        }
    }
 
    // Step 2: Determine the target number of vowels and consonants
    int target = n / 2;
 
    // If the password is already balanced, return 0
    if (vowelCount == target) {
        return 0;
    }
 
    int operations = 0;
 
    // If there are more vowels than needed, we need to convert excess vowels to consonants
    if (vowelCount > target) {
        int excessVowels = vowelCount - target;
        List<Integer> vowelChanges = new ArrayList<>();
 
        // Gather the minimum operations needed to convert vowels to consonants
        for (char c : password.toCharArray()) {
            if (isVowel(c)) {
                vowelChanges.add(minOperationsToConsonant(c));
            }
        }
 
        // Sort the operations to minimize the cost of transformation
        Collections.sort(vowelChanges);
        for (int i = 0; i < excessVowels; i++) {
            operations += vowelChanges.get(i);
        }
    } else {
        // If there are more consonants than needed, we need to convert excess consonants to vowels
        int excessConsonants = consonantCount - target;
        List<Integer> consonantChanges = new ArrayList<>();
 
        // Gather the minimum operations needed to convert consonants to vowels
        for (char c : password.toCharArray()) {
            if (!isVowel(c)) {
                consonantChanges.add(minOperationsToVowel(c));
            }
        }
 
        // Sort the operations to minimize the cost of transformation
        Collections.sort(consonantChanges);
        for (int i = 0; i < excessConsonants; i++) {
            operations += consonantChanges.get(i);
        }
    }
 
    return operations;
}

 
/*public class Solution {
public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
 
    String password = bufferedReader.readLine();
 
    int result = Result.countMinimumOperations(password);
 
    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();
 
    bufferedReader.close();
    bufferedWriter.close();
}
}*/