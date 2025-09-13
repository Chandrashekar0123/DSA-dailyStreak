// Bitwise.java
class Bitwise {
    public static void main(String[] args) {
        int a = 5;   // 0101 in binary
        int b = 3;   // 0011 in binary

        // Bitwise AND
        int andResult = a & b;  // 0101 & 0011 = 0001 (1)
        System.out.println("a & b = " + andResult);

        // Bitwise OR
        int orResult = a | b;   // 0101 | 0011 = 0111 (7)
        System.out.println("a | b = " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b;  // 0101 ^ 0011 = 0110 (6)
        System.out.println("a ^ b = " + xorResult);

        // Bitwise NOT (Unary)
        int notA = ~a;          // ~0101 = 1010 (in 2’s complement = -6)
        System.out.println("~a = " + notA);

        // Left Shift (multiply by 2 for each shift)
        int leftShift = a << 1; // 0101 << 1 = 1010 (10)
        System.out.println("a << 1 = " + leftShift);

        // Right Shift (divide by 2 for each shift, keeps sign)
        int rightShift = a >> 1; // 0101 >> 1 = 0010 (2)
        System.out.println("a >> 1 = " + rightShift);

        // Unsigned Right Shift (>>>)
        int unsignedRightShift = -8 >>> 1; // shifts without sign extension
        System.out.println("-8 >>> 1 = " + unsignedRightShift);

        // Bitwise assignment operators
        int c = 5; // 0101
        c &= 3;    // c = c & 3 (0011) => 0001
        System.out.println("c &= 3 : " + c);

        c = 5;
        c |= 3;    // c = c | 3 => 0111
        System.out.println("c |= 3 : " + c);

        c = 5;
        c ^= 3;    // c = c ^ 3 => 0110
        System.out.println("c ^= 3 : " + c);

        c = 5;
        c <<= 1;   // c = c << 1 => 1010
        System.out.println("c <<= 1 : " + c);

        c = 5;
        c >>= 1;   // c = c >> 1 => 0010
        System.out.println("c >>= 1 : " + c);

        c = -8;
        c >>>= 1;  // unsigned right shift
        System.out.println("c >>>= 1 : " + c);
    }
}


/*

Output

a & b = 1
a | b = 7
a ^ b = 6
~a = -6
a << 1 = 10
a >> 1 = 2
-8 >>> 1 = 2147483644
c &= 3 : 1
c |= 3 : 7
c ^= 3 : 6
c <<= 1 : 10
c >>= 1 : 2
c >>>= 1 : 2147483644

& AND

| OR

^ XOR

~ NOT

<< Left Shift

>> Right Shift

>>> Unsigned Right Shift

&=, |=, ^=, <<=, >>=, >>>= (bitwise assignment versions)

 */