// File: NonStaticMethodDemo.java
public class NonStaticMethodDemo {

    // Non-static method: requires object to call
    void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome to Non-Static Method Demo.");
    }

    public static void main(String[] args) {
        // Create objects to call non-static method
        NonStaticMethodDemo obj1 = new NonStaticMethodDemo();
        NonStaticMethodDemo obj2 = new NonStaticMethodDemo();

        obj1.greet("Alice");
        obj2.greet("Bob");
    }
}
