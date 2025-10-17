public class LongestWord {
    static class Node {
        Node[] children = new Node[26];
        boolean eow; // End of Word

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node(); 
       public static void insert(String word) { // O(L), L = length of word
        int level = 0;
        int len = word.length();
        int idx = 0;

        Node curr = root;
        for (; level < len; level++) {
            idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    // Use a static variable to track the answer, as originally intended.
    public static String ans = ""; 

public static void longestWordInDictionary(Node curr, StringBuilder temp) {

   for(int i=0; i<26; i++) {
       if(curr.children[i] != null && curr.children[i].eow == true) {
           temp.append((char)(i+'a'));
           if(temp.length() > ans.length()) {
               ans = temp.toString();
           }
           longestWordInDictionary(curr.children[i], temp);
           temp.deleteCharAt(temp.length()-1);
       }
   }


}
    public static void main(String args[]) {
        String words[] = {"a", "ap", "app", "appl", "apple", "apply"};
        for (String word : words) {
            insert(word);
        }


        longestWordInDictionary(root, new StringBuilder());
        System.out.println("Longest Word is: " + ans);
    }
}

/*
OUTPUT:
Longest Word is: apple
Time Complexity: O(N * L), where N is the number of words and L is the
length of the longest word.
*/