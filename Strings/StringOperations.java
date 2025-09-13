class StringOperations {
    public static void main(String[] args) {
        // 1. String addition (concatenation)
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2; // using + operator
        System.out.println("Concatenation: " + s3);
        System.out.println();

        // 2. Comparison
        String s4 = "Apple";
        String s5 = "Banana";
        System.out.println("Comparison (compareTo): " + s4.compareTo(s5)); // negative because "Apple" < "Banana"
           System.out.println();

        // 3. Copying strings
        String s6 = new String(s4); // copy using constructor
        System.out.println("Copied String: " + s6);

        // 4. charAt
        System.out.println("Character at index 1 of s6: " + s6.charAt(1));
           System.out.println();


        // 5. Equality check
        String s7 = "Apple";
        System.out.println("Using '==': " + (s4 == s7));          // compares reference
        System.out.println("Using equals(): " + s4.equals(s7)); // compares content
           System.out.println();
        // 6. Substring
        System.out.println("Substring of s3 (0,5): " + s3.substring(0,5));
           System.out.println();

        // 7. Immutability
        s1.concat(" Everyone"); // original s1 unchanged
        System.out.println("After concat, s1: " + s1);
           System.out.println();

        // 8. indexOf
        System.out.println("Index of 'World' in s3: " + s3.indexOf("World"));
           System.out.println();

        // 9. length
        System.out.println("Length of s3: " + s3.length());
    }
}

/*

Output

Concatenation: Hello World

Comparison (compareTo): -1

Copied String: Apple
Character at index 1 of s6: p

Using '==': true
Using equals(): true

Substring of s3 (0,5): Hello

After concat, s1: Hello

Index of 'World' in s3: 6

Length of s3: 11

Addition: + operator for concatenation

Comparison: compareTo()

Copy: new String(original)

charAt(): Access specific character

Equality: == vs equals()

Substring: substring(start, end)

Immutability: Original string unchanged after modification

Index: indexOf()

Length: length()
*/