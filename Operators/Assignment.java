class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        int a = 10;    // Simple assignment
        int b = 5;

        // Display initial values
        System.out.println("Initial values: a = " + a + ", b = " + b);

        // += Add and assign
        a += b; // a = a + b
        System.out.println("After a += b : a = " + a);

        // -= Subtract and assign
        a -= b; // a = a - b
        System.out.println("After a -= b : a = " + a);

        // *= Multiply and assign
        a *= b; // a = a * b
        System.out.println("After a *= b : a = " + a);

        // /= Divide and assign
        a /= b; // a = a / b
        System.out.println("After a /= b : a = " + a);

        // %= Modulus and assign
        a %= b; // a = a % b
        System.out.println("After a %= b : a = " + a);

        // &= Bitwise AND and assign
        a &= b; // a = a & b
        System.out.println("After a &= b : a = " + a);

        // |= Bitwise OR and assign
        a |= b; // a = a | b
        System.out.println("After a |= b : a = " + a);

        // ^= Bitwise XOR and assign
        a ^= b; // a = a ^ b
        System.out.println("After a ^= b : a = " + a);

        // <<= Left shift and assign
        a <<= 1; // a = a << 1
        System.out.println("After a <<= 1 : a = " + a);

        // >>= Right shift and assign
        a >>= 1; // a = a >> 1
        System.out.println("After a >>= 1 : a = " + a);

        // >>>= Unsigned right shift and assign
        a >>>= 1; // a = a >>> 1
        System.out.println("After a >>>= 1 : a = " + a);
    }
}

/**
 Output :

Initial values: a = 10, b = 5
After a += b : a = 15
After a -= b : a = 10
After a *= b : a = 50
After a /= b : a = 10
After a %= b : a = 0
After a &= b : a = 0
After a |= b : a = 5
After a ^= b : a = 0
After a <<= 1 : a = 0
After a >>= 1 : a = 0
After a >>>= 1 : a = 0

= simple assignment

+= add and assign

-= subtract and assign

*= multiply and assign

/= divide and assign

%= modulus and assign

&=, |=, ^= bitwise AND, OR, XOR with assignment

<<=, >>=, >>>= shift and assign

 */