package com.ds.trees;

public class BinaryTree1 {
	Node root;
	 
    // Method to insert a new node with the given value
    void insert(int item) {
        root = insertRec(root, item);
    }
 
    Node insertRec(Node root, int item) {
        if (root == null) {
            System.out.println("New Node created: " + item);
            return new Node(item);
        }
        if (item < root.data) {
            root.left = insertRec(root.left, item);
            if (root.left != null) {
                System.out.println("Element on Left: " + root.left.data);
            }
        } else if (item > root.data) {
            root.right = insertRec(root.right, item);
            if (root.right != null) {
                System.out.println("Element on Right: " + root.right.data);
            }
        }
        return root;
    }
 
    // Method to delete a node with the given value
    void delete(int item) {
        root = deleteRec(root, item);
    }
 
   Node deleteRec(Node root, int item) {
        if (root == null) {
            System.out.println("Node not found: " + item);
            return root; // Node not found
        }
 
        if (item < root.data) {
            root.left = deleteRec(root.left, item);
        } else if (item > root.data) {
            root.right = deleteRec(root.right, item);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
 
            // Node with two children:
            //Get the inorder successor (smallest in the right subtree)
            Node succ = findMinimum(root.right);
            root.data = succ.data; // Copy the inorder successor's content to this node
            root.right = deleteRec(root.right, succ.data); // Delete the inorder successor
        }
        return root;
    }
   
 
    // Method to search for a node with the given value
    Node search(Node cur, int item, Node parent) {
        while (cur != null && cur.data != item) {
            parent = cur;
            if (item < cur.data) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return cur; // Will return null if not found
    }
 
    // Method to find the minimum value node in a subtree
    Node findMinimum(Node cur) {
        while (cur != null && cur.left != null) {
            cur = cur.left;
        }
        return cur;
    }
 
    // Method to perform in-order traversal of the tree
    void inorderTraversal(Node current) {
        if (current != null) {
            inorderTraversal(current.left);
            System.out.print(current.data + " ");
            inorderTraversal(current.right);
        }
    }
 
    // Utility method to start in-order traversal
    void inorder() {
        inorderTraversal(root);
        System.out.println();
    }
 
    // Method for pre-order traversal
    void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }
 
    // Utility method to start pre-order traversal
    void preorder() {
        preorderTraversal(root);
        System.out.println();
    }
 
    // Method for post-order traversal
    void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }
 
    // Utility method to start post-order traversal
    void postorder() {
        postorderTraversal(root);
        System.out.println();
    }


}
