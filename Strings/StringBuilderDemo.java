public class StringBuilderDemo {
    public static void main(String[] args) {
        // Initialize StringBuilder
        StringBuilder sb = new StringBuilder("HelloWorld");
        System.out.println(sb);

        // 1. setCharAt - change character at specific index
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb);

        // 2. contains - check if substring exists (via toString)
        boolean hasWorld = sb.toString().contains("World");
        System.out.println("Contains 'World'? " + hasWorld);

        // 3. indexOf - find index of substring
        int index = sb.indexOf("World");
        System.out.println("Index of 'World': " + index);

        // 4. delete - remove substring from start to end index (end exclusive)
        sb.delete(5, 10); // deletes "World"
        System.out.println("After delete: " + sb);

        // 5. append - add text at the end
        sb.append("Java");
        System.out.println("After append: " + sb);
    }
}


/*
Output

HelloWorld
After setCharAt: helloWorld
Contains 'World'? true
Index of 'World': 5
After delete: hello
After append: helloJava


setCharAt(index, char) → modifies character at given index.

contains(substring) → use sb.toString().contains(...).

indexOf(substring) → returns start index of substring.

delete(start, end) → removes characters from start to end-1.

append(text) → adds text at the end.
 */