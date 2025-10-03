import java.util.Stack;

public class addAtBottom {

    //===============================================================
    // Recursive function to add element at the bottom of stack
    public static void addEleAtBottom(int x, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        int top = s.pop();
        addEleAtBottom(x, s);
        s.push(top);
    }
    //===============================================================

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Pushing elements: 10, 20, 30 Normally");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Pushing an element '40' at Bottom of Stack");
        addAtBottom.addEleAtBottom(40, stack);

        System.out.println("Current Stack: " + stack);
        System.out.println("Top element: " + stack.peek());

        System.out.println("\nPopping elements:");
        while (!stack.isEmpty()) {
            int popped = stack.pop();
            System.out.println("Popped: " + popped + " | Current Stack: " + stack);
        }

        System.out.println("\nStack empty? " + stack.isEmpty());
        System.out.println("Peek after empty stack: " + (stack.isEmpty() ? "N/A" : stack.peek()));
    }
}

/*
OUTPUT : 
//javac addAtBottom.java
//java addAtBottom
Pushing elements: 10, 20, 30 Normally
Pushing an element '40' at Bottom of Stack
Current Stack: [40, 10, 20, 30]
Top element: 30

Popping elements:
Popped: 30 | Current Stack: [40, 10, 20]
Popped: 20 | Current Stack: [40, 10]
Popped: 10 | Current Stack: [40]
Popped: 40 | Current Stack: []

Stack empty? true
Peek after empty stack: N/A
 */
