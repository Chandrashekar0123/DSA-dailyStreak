public class MoveAllX {
    public static void moveX(String str, int idx, int count, String newStr) {
        if (idx == str.length()) {
            // append all x at the end
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            moveX(str, idx + 1, count + 1, newStr);
        } else {
            moveX(str, idx + 1, count, newStr + currChar);
        }
    }

    public static void main(String[] args) {
        moveX("axbcxxd", 0, 0, "");
    }
}

/*
Output : abcdxxx

Time Complexity:

O(n) (n = length of string)

Space Complexity: O(n) (recursion stack depth + new string building)

 */