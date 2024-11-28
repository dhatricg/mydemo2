package com.cg.imp;
//que5
class ListNode {
    int val;
    ListNode next;

    // Constructor to initialize the node
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycleDetection {

    // Method to detect if a cycle exists and return the node where the cycle starts
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // No cycle if the list is empty or has only one node
        }

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect if a cycle exists using the tortoise and hare approach
        while (fast != null && fast.next != null) {
            slow = slow.next;             // Move slow pointer one step
            fast = fast.next.next;        // Move fast pointer two steps

            if (slow == fast) {
                // Step 2: A cycle is detected, now find the starting node of the cycle
                ListNode start = head;
                while (start != slow) {
                    start = start.next;  // Move the start pointer one step at a time
                    slow = slow.next;     // Move slow pointer one step at a time
                }
                return start; // The node where the cycle starts
            }
        }

        // No cycle found
        return null;
    }

    public static void main(String[] args) {
        // Sample Input: Create a linked list with a cycle for testing
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Create a cycle (points back to node with value 2)

        LinkedListCycleDetection detector = new LinkedListCycleDetection();
        ListNode cycleStartNode = detector.detectCycle(head);

        if (cycleStartNode != null) {
            System.out.println("Cycle detected at node with value: " + cycleStartNode.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}






















Given an interface termed Bank, list the following functions:
void assign Loans(int[] loans);
void averageLoan();
void maxLoan();
void minLoan();

Create  2 classes, called PersonalLoanDept and BusinessLoanDept implementing the Bank interface. The specifications are given below. 

1. The class PersonalLoanDept should include an integer-type array termed loan Ammounts of clients length is initialized in this classz, where clients is the count of loan recipients . the initilized in this class, where clients is the count of loan recqipients. The initial loan ammount assigned is zero.
void assignLoans(int[]loans); the loans array is linked to loan ammounts. if the lengths of the two arrays differ, as many values as possible are assigned, and then stop allocating more and print "loans for clients processed".
void averageLoan(); this displays the loan average in the pattern "average loan ammount for clients is {avaerageLoan}". The average computation should consider any zero value present in loanAmountsn and should be rounded to 2 decimal places.

void maxLoan(); This displays "maximum loan ammount amoungst clients is {maximumLoan}" reflecting the largest loan.

void minLoan(); Thia displays "Minimum loan amount clients is {minimumLoan}" reflecting the smallest loan given.
    
2. The businessLoanDept class necessitates an int[] as a variable denoted loanAmounts and should implement subsequent methods:

BusinessLoanDept(int businesses): This initializes an empty array loanAmounts of length businesses which signifies the number of business recipients.

void assignLoans(int[]loans): This assigns loans array to loanAmounts. This system discontinues further allocation is the lengths of arrays do not match post the assignment of possible values and prints "Loans for businesses processed".

void averageLoan(): This prints "Maximum loan amongst businesses is {maximumLoan" reflecting th highest loan.

void minLoan(): This prints "Minimum loan amongst businesses is {minimumLoan}" reflecting the lowest loan value.

Ensure the usage of inheritance and encapsulation  to prevent redundant code. Implementation of the PersonalLoanDept and BussinessLoanDept is checked using the interface Bank provided in the locked code stub.    













