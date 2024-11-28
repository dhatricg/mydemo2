package com.cg.collections;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

interface Bank {
    void assignLoans(int[] loans);
    void averageLoan();
    void maxLoan();
    void minLoan();
}

// Abstract class to encapsulate common functionality
abstract class AbstractLoanDept implements Bank {
    protected int[] loanAmounts;

    @Override
    public void assignLoans(int[] loans) {
        int minLength = Math.min(loanAmounts.length, loans.length);
        System.arraycopy(loans, 0, loanAmounts, 0, minLength);
    }

    @Override
    public void averageLoan() {
        double sum = Arrays.stream(loanAmounts).sum();
        double average = sum / loanAmounts.length;
        System.out.printf("Average loan amount for clients is %.2f%n", average);
    }

    @Override
    public void maxLoan() {
        int max = Arrays.stream(loanAmounts).max().orElse(0);
        System.out.printf("Maximum loan amount amongst clients is %d%n", max);
    }

    @Override
    public void minLoan() {
        int min = Arrays.stream(loanAmounts).min().orElse(0);
        System.out.printf("Minimum loan amount amongst clients is %d%n", min);
    }
}

class PersonalLoanDept extends AbstractLoanDept {
    public PersonalLoanDept(int clients) {
        this.loanAmounts = new int[clients];
        Arrays.fill(this.loanAmounts, 0);
    }

    @Override
    public void assignLoans(int[] loans) {
        super.assignLoans(loans);
        if (loans.length != loanAmounts.length) {
            System.out.println("Loans for clients processed");
        }
    }
}

class BusinessLoanDept extends AbstractLoanDept {
    public BusinessLoanDept(int businesses) {
        this.loanAmounts = new int[businesses];
    }

    @Override
    public void assignLoans(int[] loans) {
        super.assignLoans(loans);
        if (loans.length != loanAmounts.length) {
            System.out.println("Loans for businesses processed");
        }
    }

    @Override
    public void averageLoan() {
        double sum = Arrays.stream(loanAmounts).sum();
        double average = sum / loanAmounts.length;
        System.out.printf("Average loan amount for businesses is %.2f%n", average);
    }

    @Override
    public void maxLoan() {
        int max = Arrays.stream(loanAmounts).max().orElse(0);
        System.out.printf("Maximum loan amongst businesses is %d%n", max);
    }

    @Override
    public void minLoan() {
        int min = Arrays.stream(loanAmounts).min().orElse(0);
        System.out.printf("Minimum loan amongst businesses is %d%n", min);
    }
}

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] count = sc.nextLine().split(" ");

        PersonalLoanDept p = new PersonalLoanDept(Integer.parseInt(count[0]));
        BusinessLoanDept b = new BusinessLoanDept(Integer.parseInt(count[1]));

        count = sc.nextLine().split(" ");

        int[] loansClients = new int[count.length];
        for (int i=0; i<count.length; i++) {
            loansClients[i] = Integer.parseInt(count[i]);
        }
        p.assignLoans(loansClients);

        count = sc.nextLine().split(" ");
        int[] loansBusinesses = new int[count.length];
        for (int i=0; i<count.length; i++) {
            loansBusinesses[i] = Integer.parseInt(count[i]);
        }
        b.assignLoans(loansBusinesses);

        p.averageLoan();
        p.maxLoan();
        p.minLoan();

        b.averageLoan();
        b.maxLoan();
        b.minLoan();
    }
}

abstract class LoanDept implements Bank {
    protected int[] loanAmounts;

    // Constructor to initialize loanAmounts
    public LoanDept(int numClients) {
        this.loanAmounts = new int[numClients];
    }

    // Assign loans to the loanAmounts array
    public void assignLoans(int[] loans) {
        int length = Math.min(loanAmounts.length, loans.length);
        for (int i = 0; i < length; i++) {
            loanAmounts[i] = loans[i];
        }
        System.out.println("Loans for clients processed");
    }

    // Calculate the average loan
    public void averageLoan() {
        double sum = 0;
        int count = 0;
        for (int loan : loanAmounts) {
            sum += loan;
            count++;
        }
        double average = sum / count;
        System.out.printf("average loan amount is %.2f\n", average);
    }

    // Find the maximum loan amount
    public void maxLoan() {
        int max = Integer.MIN_VALUE;
        for (int loan : loanAmounts) {
            if (loan > max) {
                max = loan;
            }
        }
        System.out.println("maximum loan amount is " + max);
    }

    // Find the minimum loan amount
    public void minLoan() {
        int min = Integer.MAX_VALUE;
        for (int loan : loanAmounts) {
            if (loan < min) {
                min = loan;
            }
        }
        System.out.println("minimum loan amount is " + min);
    }
}



class BusinessLoanDept extends LoanDept {
    public BusinessLoanDept(int businesses) {
        super(businesses);
    }

    @Override
    public void assignLoans(int[] loans) {
        super.assignLoans(loans);
        System.out.println("Loans for businesses processed");
    }

    @Override
    public void averageLoan() {
        super.averageLoan();
    }

    @Override
    public void maxLoan() {
        super.maxLoan();
    }

    @Override
    public void minLoan() {
        super.minLoan();
    }
}






code in java: Given an interface termed Bank, list the following functions:
void assign Loans(int[] loans);
void averageLoan();
void maxLoan();
void minLoan();


Create  2 classes, called PersonalLoanDept and BusinessLoanDept implementing the Bank interface. The specifications are given below.


The class PersonalLoanDept should include an integer-type array termed loan Ammounts of clients length is initialized in this classz, where clients is the count of loan recipients .
the initilized in this class, where clients is the count of loan recqipients. The initial loan ammount assigned is zero.

void assignLoans(int[]loans); the loans array is linked to loan ammounts. if the lengths of the two arrays differ, 
as many values as possible are assigned, and then stop allocating more and print "loans for clients processed".

void averageLoan(); this displays the loan average in the pattern "average loan ammount for clients is {avaerageLoan}". 
The average computation should consider any zero value present in loanAmountsn and should be rounded to 2 decimal places.

void maxLoan(); This displays "maximum loan ammount amoungst clients is {maximumLoan}" reflecting the largest loan.

void minLoan(); Thia displays "Minimum loan amount clients is {minimumLoan}" reflecting the smallest loan given.



The businessLoanDept class necessitates an int[] as a variable denoted loanAmounts and should implement subsequent methods:


BusinessLoanDept(int businesses): This initializes an empty array loanAmounts of length businesses which signifies the number of business recipients.


void assignLoans(int[]loans): This assigns loans array to loanAmounts. This system discontinues further allocation is the lengths of arrays 
do not match post the assignment of possible values and prints "Loans for businesses processed".


void averageLoan(): This prints "Maximum loan amongst businesses is {maximumLoan" reflecting th highest loan.


void minLoan(): This prints "Minimum loan amongst businesses is {minimumLoan}" reflecting the lowest loan value.


Ensure the usage of inheritance and encapsulation  to prevent redundant code. 
Implementation of the PersonalLoanDept and BussinessLoanDept is checked using 
the interface Bank provided in the locked code stub.   import java.io.;

import java.util.;
import java.text.;
import java.math.;
import java.util.regex.;
import java.util.stream.;


interface Bank {
void assignLoans(int[] loans);
void averageLoan();
void maxLoan();
void minLoan();
}


//WRITE your code here
public class Solution {
public static void main(String args[] ) throws Exception {
Scanner sc = new Scanner(System.in);


    String[] count = sc.nextLine().split(" ");

    PersonalLoanDept p = new PersonalLoanDept(Integer.parseInt(count[0]));
    BusinessLoanDept b = new BusinessLoanDept(Integer.parseInt(count[1]));

    count = sc.nextLine().split(" ");

    int[] loansClients = new int[count.length];
    for (int i=0; i<count.length; i++) {
        loansClients[i] = Integer.parseInt(count[i]);
    }
    p.assignLoans(loansClients);

    count = sc.nextLine().split(" ");
    int[] loansBusinesses = new int[count.length];
    for (int i=0; i<count.length; i++) {
        loansBusinesses[i] = Integer.parseInt(count[i]);
    }
    b.assignLoans(loansBusinesses);

    p.averageLoan();
    p.maxLoan();
    p.minLoan();

    b.averageLoan();
    b.maxLoan();
    b.minLoan();
}

}


Input (stdin)
4 4
2348 929 1284 5543
3117 5196 3352 7068


Your Output (stdout)
Loans for clients processed
Loans for clients processed
Loans for businesses processed
average loan amount is 2526.00
maximum loan amount is 5543
minimum loan amount is 929
average loan amount is 4683.25
maximum loan amount is 7068
minimum loan amount is 3117

Expected Output
Loans for clients processed
Loans for businesses processed
Average loan amount for clients is 2526.00
Maximum loan amount amongst clients is 5543
Minimum loan amount amongst clients is 929
Average loan amount for businesses is 4683.25
Maximum loan amongst businesses is 7068
Minimum loan amongst businesses is 3117

