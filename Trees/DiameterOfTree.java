public class DiameterOfTree {
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

    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

   public static int Diameter(Node root){
    if(root == null){
        return 0;
    }
        int diameterleft = Diameter(root.left);
        int diameterright = Diameter(root.right);
        int diameter = heightOfTree(root.left) + heightOfTree(root.right) + 1;
        return Math.max(diameter, Math.max(diameterleft, diameterright));

   }    
        /*
                1
               / \
              2   3
             / \   \
            4   5   6
        */
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Diameter of the tree: " + Diameter(root)); // Output: 5

} 
}
/*
OUTPUT :
Diameter of the tree: 5
*/

