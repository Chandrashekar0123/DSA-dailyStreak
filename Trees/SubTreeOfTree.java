public class SubTreeOfTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean areIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return (root1.data == root2.data) &&
               areIdentical(root1.left, root2.left) &&
               areIdentical(root1.right, root2.right);
    }

    public static boolean isSubtree(Node mainRoot, Node subRoot) {
        if (subRoot == null) {
            return true; // An empty tree is a subtree of any tree
        }
        if (mainRoot == null) {
            return false; // Non-empty subtree can't be found in an empty tree
        }
        if (areIdentical(mainRoot, subRoot)) {
            return true;
        }
        return isSubtree(mainRoot.left, subRoot) || isSubtree(mainRoot.right, subRoot);
    }

    public static void main(String args[]) {
        /*
                1
               / \
              2   3
             / \   \
            4   5   6
        */
        Node mainRoot = new Node(1);
        mainRoot.left = new Node(2);
        mainRoot.right = new Node(3);
        mainRoot.left.left = new Node(4);
        mainRoot.left.right = new Node(5);
        mainRoot.right.right = new Node(6);

        /*
              2
             / \
            4   5
        */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        boolean result = isSubtree(mainRoot, subRoot);
        System.out.println("Is the second tree a subtree of the first? " + result); // Output: true
    }
    
}


/*
OUTPUT :
Is the second tree a subtree of the first? true
*/