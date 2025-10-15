public class TreeDiameter {

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

    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo Diameter(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = Diameter(root.left);
        TreeInfo right = Diameter(root.right);

        int height = Math.max(left.height, right.height) + 1;

        // The diameter is the maximum of these three:
        // 1. Diameter of the left subtree
        int d1 = left.diameter;
        // 2. Diameter of the right subtree
        int d2 = right.diameter;
        // 3. Path passing through the root (left height + right height + 1)
        int d3 = left.height + right.height + 1;

        int diameter = Math.max(d1, Math.max(d2, d3));

        return new TreeInfo(height, diameter);
    }

    public static void main(String args[]) {
        /*
                  1
                 / \
                2   3
               / \   \
              4   5   6
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // Corrected line: Access the .diameter property of the returned object
        System.out.println("Diameter of the tree: " + Diameter(root).diameter); // Output: 5
    }
}

/*
OUTPUT :
Diameter of the tree: 5
*/