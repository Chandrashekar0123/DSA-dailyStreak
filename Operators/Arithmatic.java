class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        // Display initial values
        System.out.println("a = " + a + ", b = " + b);

        // Addition
        int sum = a + b;
        System.out.println("Addition (a + b) = " + sum);

        // Subtraction
        int diff = a - b;
        System.out.println("Subtraction (a - b) = " + diff);

        // Multiplication
        int product = a * b;
        System.out.println("Multiplication (a * b) = " + product);

        // Division (integer)
        int quotient = a / b;
        System.out.println("Division (a / b) = " + quotient);

        // Modulus (remainder)
        int remainder = a % b;
        System.out.println("Modulus (a % b) = " + remainder);

        // Increment operators
        int x = 5;
        System.out.println("\nInitial x = " + x);
        System.out.println("Post-increment (x++) = " + (x++)); // uses x then increments
        System.out.println("After post-increment x = " + x);
        System.out.println("Pre-increment (++x) = " + (++x)); // increments then uses

        // Decrement operators
        int y = 5;
        System.out.println("\nInitial y = " + y);
        System.out.println("Post-decrement (y--) = " + (y--)); // uses y then decrements
        System.out.println("After post-decrement y = " + y);
        System.out.println("Pre-decrement (--y) = " + (--y)); // decrements then uses
    }
}


/*

Output:
a = 15, b = 4
Addition (a + b) = 19
Subtraction (a - b) = 11
Multiplication (a * b) = 60
Division (a / b) = 3
Modulus (a % b) = 3

Initial x = 5
Post-increment (x++) = 5
After post-increment x = 6
Pre-increment (++x) = 7

Initial y = 5
Post-decrement (y--) = 5
After post-decrement y = 4
Pre-decrement (--y) = 3


+ Addition

- Subtraction

* Multiplication

/ Division (integer)

% Modulus (remainder)

++ Pre & Post Increment

-- Pre & Post Decrement

 */