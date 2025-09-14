public class KeypadCombinations {
    static String[] keypad = {
            ".", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tu", "vwx", "yz"
    };

    public static void printComb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        printComb("23", 0, "");
    }
}

/*
Output :
dg
dh
di
eg
eh
ei
fg
fh
fi

Time Complexity:

O(kⁿ) (k ~ 3 or 4 depending on digit, n = number of digits)

Space Complexity: O(n) recursion depth
 */