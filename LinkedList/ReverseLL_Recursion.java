class ReverseLL_Recursion {

    // Define Node (custom LinkedList)
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Recursive reverse logic (your approach)
    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // Print LinkedList
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Manually create LL using Node
        Node head = new Node("This");
        head.next = new Node("is");
        head.next.next = new Node("a");
        head.next.next.next = new Node("LL");

        System.out.println("Linked List Before Reversing:");
        printList(head);

        head = reverse(head);

        System.out.println("Linked List After Reversing:");
        printList(head);
    }
}


/*
OUTPUT : 
Linked List Before Reversing:
This -> is -> a -> LL -> NULL
Linked List After Reversing:
LL -> a -> is -> This -> NULL
 */