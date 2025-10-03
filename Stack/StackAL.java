import java.util.ArrayList;

class StackAL {
    static class Stack {
        private ArrayList<Integer> stackList = new ArrayList<>();

        // Check if stack is empty
        public boolean isEmpty() {
            return stackList.isEmpty();
        }

        // Push element onto stack
        public void push(int x) {
            stackList.add(x);
            System.out.println("Pushed: " + x);
        }

        // Pop element from stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow! Cannot pop from empty stack.");
                return -1;
            }
            int top = stackList.remove(stackList.size() - 1);
            System.out.println("Popped: " + top);
            return top;
        }

        // Peek top element
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return stackList.get(stackList.size() - 1);
        }

        // Display current stack
        public void display() {
            System.out.println("Current Stack: " + stackList);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        System.out.println("Pushing elements: 10, 20, 30, 40");
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();
        System.out.println("Top element: " + s.peek());

        System.out.println("\nPopping elements:");
        while (!s.isEmpty()) {
            s.pop();
            s.display();
        }

        System.out.println("\nStack empty? " + s.isEmpty());
        System.out.println("Peek after empty stack: " + s.peek());
    }
}

/*
OUTPUT : 
Pushing elements: 10, 20, 30, 40
Pushed: 10
Pushed: 20
Pushed: 30
Pushed: 40
Current Stack: [10, 20, 30, 40]
Top element: 40

Popping elements:
Popped: 40
Current Stack: [10, 20, 30]
Popped: 30
Current Stack: [10, 20]
Popped: 20
Current Stack: [10]
Popped: 10
Current Stack: []

Stack empty? true
Peek after empty stack: -1
 */