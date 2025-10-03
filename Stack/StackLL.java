class StackLL {
    static class Node{
        int data;
        Node next;
         
         Node(int data) {
            this.data = data;
            next = null;
         }
    }

         static class Stack {
            static Node head;
         public static boolean isEmpty()  {
            return head == null;
         }

         public static void Push(int x) {
            Node newNode = new Node(x);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
         }

         public static int Pop() {
              if(isEmpty()) {
                return -1;
            }
               int top = head.data;
               head = head.next;
               return top;
         }

         public static int Peek() {
                   if(isEmpty()) {
                return -1;
            }
               return head.data;
         }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.Push(1);
        s.Push(2);
        s.Push(3);
        s.Push(4);
        while(!s.isEmpty()) {
           System.out.println("Elements in Stack is : " +s.Peek());
        }
        s.Pop();
        System.out.println("Elements in Stack is : " + s.Peek());

    }
}

/*
OUTPUT : 

 */