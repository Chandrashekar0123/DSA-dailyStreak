public class SearchinBst {

    // The root of the Binary Search Tree
    Node root;

    /**
     * Node class representing a single node in the BST.
     * Making it a static nested class is a common practice.
     */
    public static class Node {
        int data;
        Node left, right;

        Node(int item) {
            this.data = item;
            left = right = null;
        }
    }
    public static boolean search(Node root, int key) {
        // Base Case 1: The tree (or subtree) is empty, so the key isn't here.
        if (root == null) {
            return false;
        }
        
        // Base Case 2: The key is found at the current node.
        if (root.data == key) {
            return true;
        }

        // Recursive Step: Decide whether to go left or right.
        if (key < root.data) {
            // If the key is smaller, it must be in the left subtree.
            return search(root.left, key);
        } else {
            // If the key is larger, it must be in the right subtree.
            return search(root.right, key);
        }
    }

    /**
     * The main method to test the search functionality.
     */
    public static void main(String[] args) {
        // Create an instance of the BST
        SearchinBst tree = new SearchinBst();

        /*
         * Construct the following BST:
         * 50
         * /  \
         * 30   70
         * / \   / \
         * 20 40 60  80
         */
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        // --- Test Cases ---

        // Test case 1: Key exists in the tree
        int key1 = 60;
        if (search(tree.root, key1)) {
            System.out.println("Key " + key1 + " found in the BST.");
        } else {
            System.out.println("Key " + key1 + " not found in the BST.");
        }

        // Test case 2: Key does not exist in the tree
        int key2 = 90;
        if (search(tree.root, key2)) {
            System.out.println("Key " + key2 + " found in the BST.");
        } else {
            System.out.println("Key " + key2 + " not found in the BST.");
        }
    }
}

/*
Output:
Key 60 found in the BST.
Key 90 not found in the BST.

time complexity: O(h) where h is the height of the tree.

 */