package com.cg.imp;

import java.util.Scanner;

interface Bank {
    void assignLoans(int[] loans);
    void averageLoan();
    void maxLoan();
    void minLoan();
}

class PersonalLoanDept implements Bank {
    private int[] loanAmounts;

    @Override
    public void assignLoans(int[] loans) {
        this.loanAmounts = loans;
    }

    @Override
    public void averageLoan() {
        if (loanAmounts == null || loanAmounts.length == 0) {
            System.out.println("No loans assigned.");
            return;
        }
        int total = 0;
        for (int amount : loanAmounts) {
            total += amount;
        }
        double average = (double) total / loanAmounts.length;
        System.out.println("Average Loan Amount: " + average);
    }

	@Override
	public void maxLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void minLoan() {
		// TODO Auto-generated method stub
		
	}
}

class BusinessLoanDept implements Bank {
    private int[] loanAmounts;

    @Override
    public void assignLoans(int[] loans) {
        this.loanAmounts = loans;
    }

    @Override
    public void averageLoan() {
        if (loanAmounts == null || loanAmounts.length == 0) {
            System.out.println("No loans assigned.");
            return;
        }
        int total = 0;
        for (int amount : loanAmounts) {
            total += amount;
        }
        double average = (double) total / loanAmounts.length;
        System.out.println("Average Business Loan Amount: " + average);
    }

	@Override
	public void maxLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void minLoan() {
		// TODO Auto-generated method stub
		
	}
}


public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Read the number of personal and business loan recipients
        String[] count = sc.nextLine().split(" ");
        PersonalLoanDept p = new PersonalLoanDept(Integer.parseInt(count[0]));
        BusinessLoanDept b = new BusinessLoanDept(Integer.parseInt(count[1]));

        // Read the loan amounts for clients
        count = sc.nextLine().split(" ");
        int[] loansClients = new int[count.length];
        for (int i = 0; i < count.length; i++) {
            loansClients[i] = Integer.parseInt(count[i]);
        }
        p.assignLoans(loansClients);

        // Read the loan amounts for businesses
        count = sc.nextLine().split(" ");
        int[] loansBusinesses = new int[count.length];
        for (int i = 0; i < count.length; i++) {
            loansBusinesses[i] = Integer.parseInt(count[i]);
        }
        b.assignLoans(loansBusinesses);

        // Output the results for PersonalLoanDept
        p.averageLoan();
        p.maxLoan();
        p.minLoan();

        // Output the results for BusinessLoanDept
        b.averageLoan();
        b.maxLoan();
        b.minLoan();
    }
}

