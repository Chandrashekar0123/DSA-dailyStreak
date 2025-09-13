class LogicalOperatorsDemo {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // AND (&&) - true only if both are true
        System.out.println("x && y : " + (x && y)); // false

        // OR (||) - true if at least one is true
        System.out.println("x || y : " + (x || y)); // true

        // NOT (!) - reverses the boolean value
        System.out.println("!x : " + (!x));         // false
        System.out.println("!y : " + (!y));         // true

        // Combining relational with logical
        int a = 10, b = 20, c = 30;

        // Example: Check if 'a' is smallest
        System.out.println("(a < b) && (a < c): " + ((a < b) && (a < c))); // true

        // Example: Check if 'a' is greater than b OR c
        System.out.println("(a > b) || (a > c): " + ((a > b) || (a > c))); // false
    }
}

/*

Output: 

x && y : false
x || y : true
!x : false
!y : true
(a < b) && (a < c): true
(a > b) || (a > c): false

&& – Logical AND (true only if both conditions are true)

|| – Logical OR (true if at least one condition is true)

! – Logical NOT (inverts the boolean value)

 */