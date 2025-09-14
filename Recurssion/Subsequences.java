public class Subsequences {
    public static void subseq(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // include char
        subseq(str, idx + 1, newStr + str.charAt(idx));
        // exclude char
        subseq(str, idx + 1, newStr);
    }

    public static void main(String[] args) {
        subseq("abc", 0, "");
    }
}

/*
Output :
abc
ab
ac
a
bc
b
c

Time Complexity:

O(2ⁿ) (n = length of string)

Space Complexity: O(n) recursion depth + output strings

 */