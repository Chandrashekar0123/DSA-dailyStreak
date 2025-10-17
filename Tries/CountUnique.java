public class CountUnique {
   static class Node {
       Node[] children = new Node[26];
       boolean eow;


       public Node() {
           for (int i=0; i<26; i++) {
               children[i] = null;
           }
       }
   }


   public static Node root = new Node();


   public static void insert(String word) { //O(n)
       int level = 0;
       int len = word.length();
       int idx = 0;


       Node curr = root;
       for(; level<len; level++) {
           idx = word.charAt(level)-'a';
           if(curr.children[idx] == null) {
               curr.children[idx] = new Node();
           }
           curr = curr.children[idx];
       }
       curr.eow = true;
   }

    public static int countUniqueSubstrings(Node root) {
         int count = 0;
         for (int i = 0; i < 26; i++) {
              if (root.children[i] != null) {
                count += countUniqueSubstrings(root.children[i]);
              }
         }
         return count + 1; // +1 for the current node
    }

   public static void main(String args[]) {
       String words = "ababca";
       System.out.println("Suffixes of the word is: ");
       for (int i = 0; i < words.length(); i++) {
           System.out.println(words.substring(i));
           insert(words.substring(i));
       }
         System.out.println("Count of unique substrings is: " + countUniqueSubstrings(root));
   }
}

/*
OUTPUT:
Suffixes of the word is: 
ababca
babca
abca
bca
ca
a
Count of unique substrings is: 18
Time Complexity: O(n^2) for inserting all suffixes, where n is the length of the word. Counting unique substrings takes O(m), where m is the number of nodes in the trie.
*/
