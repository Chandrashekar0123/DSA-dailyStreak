public class FirstLastOccurrence {
    static int first = -1;
    static int last = -1;

    public static void findOccur(String str, int idx, char ch) {
        if (idx == str.length()) {
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == ch) {
            if (first == -1) {
                first = idx;
            }
            last = idx;
        }

        findOccur(str, idx + 1, ch);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccur(str, 0, 'a');
    }
}

/*
Output :
First occurrence: 0
Last occurrence: 10

Time Complexity:

O(n) (n = length of string)

Space Complexity: O(n) (recursion stack depth)

 */