import java.util.Stack;

public class ReverseStack {

    // Function to insert element at the bottom of the stack
    public static void addEleAtBottom(int x, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        int top = s.pop();
        addEleAtBottom(x, s);
        s.push(top);
    }

    // Function to reverse the stack recursively
    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        addEleAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Pushing elements: 10, 20, 30 Normally");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Original Stack: " + stack);

        reverse(stack);

        System.out.println("\nReversed Stack: " + stack);
        System.out.println("Top element after reverse: " + stack.peek());

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
Pushing elements: 10, 20, 30 Normally
Original Stack: [10, 20, 30]

Reversed Stack: [30, 20, 10]
Top element after reverse: 10

Popping elements:
Popped: 10 | Current Stack: [30, 20]
Popped: 20 | Current Stack: [30]
Popped: 30 | Current Stack: []

Stack empty? true
Peek after empty stack: N/A
 */