import java.util.*;

public class RootToLeaf {
        // Node class remains the same
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void printRootToLeafPaths(Node root, List<Integer> path) {
        // Base Case: If the current node is null, return.
        if (root == null) {
            return;
        }

        // Add the current node's data to the path.
        path.add(root.data);

        // If it's a leaf node, print the path.
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            // Otherwise, continue to explore the left and right subtrees.
            printRootToLeafPaths(root.left, path);
            printRootToLeafPaths(root.right, path);
        }

        // Backtrack: Remove the current node's data from the path before returning to the caller.
        path.remove(path.size() - 1);
    }

    public static void printPath(List<Integer> path) {
        for (int value : path) {
            System.out.print(value + " -> ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /*
         * Construct the following BST:
         *     1                    
         *   /   \  
         *  2      3
         * / \      \
         * 4   5      6
         * / \        \
         * 7   8       9
         *              \
         *              10
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(8);
        root.right.right.right = new Node(9);
        root.right.right.right.right = new Node(10);

        System.out.println("Root-to-Leaf Paths:");
        printRootToLeafPaths(root, new ArrayList<>());
    }
    
}

/*
 * OUTPUT:
Root-to-Leaf Paths:
1 -> 2 -> 4 -> 7 -> 
1 -> 2 -> 4 -> 8 -> 
1 -> 2 -> 5 -> 
1 -> 3 -> 6 -> 9 -> 10 -> 
    
    * Time Complexity: O(n), where n is the number of nodes in the tree. Each node is visited once.
    * Space Complexity: O(h), where h is the height of the tree. This space is used by the recursion stack and the path list.
    */