// File: StaticMethodDemo.java
public class StaticMethodDemo {

    // Static method: can be called without creating an object
    static void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome to Static Method Demo.");
    }

    public static void main(String[] args) {
        // Call static method directly using class name
        StaticMethodDemo.greet("Alice");
        StaticMethodDemo.greet("Bob");
    }
}


/*
OUTPUT : 
Hello, Alice! Welcome to Static Method Demo.
Hello, Bob! Welcome to Static Method Demo.

*/