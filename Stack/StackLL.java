class StackLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void Push(int x) {
            Node newNode = new Node(x);
            newNode.next = head;
            head = newNode;
        }

        public static int Pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow! Cannot pop from empty stack.");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int Peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        System.out.println("Pushing elements: 1, 2, 3, 4");
        s.Push(1);
        s.Push(2);
        s.Push(3);
        s.Push(4);

        System.out.println("Top element after pushes: " + s.Peek());

        System.out.println("\nPopping elements from stack:");
        while (!s.isEmpty()) {
            int popped = s.Pop();
            System.out.print("Popped: " + popped);
            if (!s.isEmpty()) {
                System.out.println(" | New top: " + s.Peek());
            } else {
                System.out.println(" | Stack is now empty");
            }
        }

        System.out.println("\nIs Stack empty? " + s.isEmpty());
        System.out.println("Peek after empty stack: " + s.Peek());
    }
}



/*
OUTPUT : 
Pushing elements: 1, 2, 3, 4
Top element after pushes: 4

Popping elements from stack:
Popped: 4 | New top: 3
Popped: 3 | New top: 2
Popped: 2 | New top: 1
Popped: 1 | Stack is now empty

Is Stack empty? true
Peek after empty stack: -1
 */