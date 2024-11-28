package com.ds.trees;

import java.util.Scanner;

public class UseTree1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree1 tree = new BinaryTree1();
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("Menu:");
            System.out.println("1. Insert a node");
            System.out.println("2. Delete a node");
            System.out.println("3. Display in-order traversal");
            System.out.println("4. Display pre-order traversal");
            System.out.println("5. Display post-order traversal");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = scanner.nextInt();
                    tree.insert(value);
                    System.out.println("Inserted: " + value);
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    value = scanner.nextInt();
                    tree.delete(value);
                    System.out.println("Deleted: " + value);
                    break;
                case 3:
                    System.out.println("In-order traversal:");
                    tree.inorder();
                    break;
                case 4:
                    System.out.println("Pre-order traversal:");
                    tree.preorder();
                    break;
                case 5:
                    System.out.println("Post-order traversal:");
                    tree.postorder();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }


}


