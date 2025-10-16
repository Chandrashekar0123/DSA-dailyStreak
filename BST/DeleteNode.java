public class DeleteNode {

    // Node class remains the same
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static Node deleteNode(Node root, int value) {
        // Base Case: If the tree is empty, return null.
        if (root == null) {
            return null;
        }

        // --- Step 1: Search for the node to delete ---
        if (value < root.data) {
            // If value is smaller, it's in the left subtree.
            root.left = deleteNode(root.left, value);
        } else if (value > root.data) {
            // If value is larger, it's in the right subtree.
            root.right = deleteNode(root.right, value);
        } else {
            // --- Step 2: Node found. Now, perform deletion. ---

            // Case 1: Node is a leaf (no children)
            if (root.left == null && root.right == null) {
                return null; // The node is simply removed.
            }

            // Case 2: Node has one child
            if (root.left == null) {
                return root.right; // Replace node with its right child.
            }
            if (root.right == null) {
                return root.left; // Replace node with its left child.
            }

            // Case 3: Node has two children
            // Find the inorder successor (smallest value in the right subtree).
            Node inorderSuccessor = findInorderSuccessor(root.right);
            // Copy the successor's data to this node.
            root.data = inorderSuccessor.data;
            // Recursively delete the inorder successor from the right subtree.
            root.right = deleteNode(root.right, inorderSuccessor.data);
        }
        return root;
    }

    /**
     * Finds the inorder successor (the leftmost node in a subtree).
     * @param root The root of the subtree to search in.
     * @return The node with the minimum value in the given subtree.
     */
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    /**
     * Helper function to print the tree inorder.
     */
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        /*
         * Construct the following BST:
         * 5
         * / \
         * 3   6
         * / \   \
         * 2   4   7
         */
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(7);

        System.out.print("Original Tree (Inorder): ");
        inorder(root);
        System.out.println();

        int valueToDelete = 3; // Deleting a node with two children
        System.out.println("\nDeleting node: " + valueToDelete);
        root = deleteNode(root, valueToDelete);

        System.out.print("Modified Tree (Inorder): ");
        inorder(root);
        System.out.println();
    }
}

/*
 * OUTPUT:
 * 
Original Tree (Inorder): 2 3 4 5 6 7 

Deleting node: 3
Modified Tree (Inorder): 2 4 5 6 7 

Time Complexity: O(h), where h is the height of the tree. In the worst case (unbalanced tree), it can be O(n).
 */