public class PrintInRange {
        // Node class remains the same
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void printInRange(Node root, int X, int Y) {
        // Base Case: If the current node is null, return.
        if (root == null) {
            return;
        }

        // If current node's data is greater than X, then only we can find nodes in the left subtree.
        if (root.data > X) {
            printInRange(root.left, X, Y);
        }

        // If current node's data lies within the range [X, Y], print it.
        if (root.data >= X && root.data <= Y) {
            System.out.print(root.data + " ");
        }

        // If current node's data is less than Y, then only we can find nodes in the right subtree.
        if (root.data < Y) {
            printInRange(root.right, X, Y);
        }
    }

    public static void main(String[] args) {
        /*
         * Construct the following BST:
         *        10
         *       /  \
         *      5    15
         *     / \     \
         *    3   7     18
         */
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(18);

        int X = 7, Y = 15;
        System.out.println("Nodes within range [" + X + ", " + Y + "]:");
        printInRange(root, X, Y); 
    }
}

/*
 * OUTPUT:
Nodes within range [7, 15]:
7 10 15

 * Time Complexity: O(h + k), where h is the height of the tree and k is the number of nodes in the range [X, Y].
 * Space Complexity: O(h) due to the recursion stack in the worst case (unbalanced tree).
 */