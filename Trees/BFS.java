import java.util.*;

public class BFS {
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

    public static void bfs(Node root) {
    Queue<Node> queue = new java.util.LinkedList<>();
        if (root == null) {
            return;
        }
        queue.add(root);
        queue.add(null); // Level marker

        while (!queue.isEmpty()) {
            Node currNode = queue.remove();
            if (currNode == null) {
                System.out.println(); // End of current level
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null); // Add level marker for next level
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
        }
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

        System.out.println("BFS traversal:");
        bfs(root); 
    }
    
}

/*
OUTPUT :
BFS traversal:
1 
2 3 
4 5 6 
*/