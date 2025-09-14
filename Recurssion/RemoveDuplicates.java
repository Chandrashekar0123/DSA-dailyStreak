public class RemoveDuplicates {
    static boolean[] map = new boolean[26];

    public static void removeDup(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (!map[currChar - 'a']) {
            map[currChar - 'a'] = true;
            removeDup(str, idx + 1, newStr + currChar);
        } else {
            removeDup(str, idx + 1, newStr);
        }
    }

    public static void main(String[] args) {
        removeDup("abbccda", 0, "");
    }
}

/*

Output :  abcd

Time Complexity:

O(n)

Space Complexity: O(n) (recursion stack) + O(26) for the map (constant)
 */