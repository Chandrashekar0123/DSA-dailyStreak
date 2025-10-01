class SingleLL {
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
        System.out.println("NULL");
        System.out.println();
    }

    // Add element at First
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add element at Last
    public void addLast(String data) {
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

    // Delete first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Delete last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    // Get size of the list
    public int size() {
        int count = 0;
        Node currNode = head;
        while (currNode != null) {
            count++;
            currNode = currNode.next;
        }
        return count;
    }

    public static void main(String[] args) {
        SingleLL list = new SingleLL();
        list.addFirst("this");
        list.addLast("is");
        list.addLast("a");
        list.addLast("LinkedList");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println("The Size of the LinkedList is : " + list.size());
    }
}

/*

Output :

this -> is -> a -> LinkedList -> NULL

is -> a -> LinkedList -> NULL

is -> a -> NULL

The Size of the LinkedList is : 2

*/