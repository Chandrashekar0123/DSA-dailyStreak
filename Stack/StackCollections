import java.util.Stack;

public class StackCollections {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Pushing elements: 10, 20, 30, 40");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

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
Pushing elements: 10, 20, 30, 40
Current Stack: [10, 20, 30, 40]
Top element: 40

Popping elements:
Popped: 40 | Current Stack: [10, 20, 30]
Popped: 30 | Current Stack: [10, 20]
Popped: 20 | Current Stack: [10]
Popped: 10 | Current Stack: []

Stack empty? true
Peek after empty stack: N/A
 */