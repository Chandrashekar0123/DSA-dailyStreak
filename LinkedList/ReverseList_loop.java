class ReverseList_loop {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Print Linked List
    public void printList() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL\n");
    }

    // Add element at Last
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Reverse Linked List (loop)
    public void Reverse(Node list) {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = null;
        Node currNode = head;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }

    public static void main(String[] args) {
        ReverseList_loop ls = new ReverseList_loop();

        ls.add("this");
        ls.add("is");
        ls.add("a");
        ls.add("LinkedList");

        System.out.println("Linked List Given is : ");
        ls.printList();

        ls.Reverse(ls.head);

        System.out.println("Linked List after Reversing is : ");
        ls.printList();
    }
}


/*
OUTPUT : 

Linked List Given is : 
this -> is -> a -> LinkedList -> NULL

Linked List after Reversing is : 
LinkedList -> a -> is -> this -> NULL

 */