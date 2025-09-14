import java.util.HashSet;

public class UniqueSubsequences {
    static HashSet<String> set = new HashSet<>();

    public static void uniqueSubseq(String str, int idx, String newStr) {
        if (idx == str.length()) {
            if (!set.contains(newStr)) {
                System.out.println(newStr);
                set.add(newStr);
            }
            return;
        }

        // include char
        uniqueSubseq(str, idx + 1, newStr + str.charAt(idx));
        // exclude char
        uniqueSubseq(str, idx + 1, newStr);
    }

    public static void main(String[] args) {
        uniqueSubseq("aaa", 0, "");
    }
}

/*
Output :
aaa
aa
a

Time Complexity:

O(2ⁿ) (worst case)

Space Complexity: O(n) recursion depth + O(2ⁿ) for the HashSet
 */