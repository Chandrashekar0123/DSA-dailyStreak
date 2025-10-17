public class WordBreak {
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


   public static boolean search(String key) { //O(n)
       int level = 0;
       int len = key.length();
       int idx = 0;


       Node curr = root;
       for(; level<len; level++) {
           idx = key.charAt(level)-'a';
           if(curr.children[idx] == null) {
               return false;
           }
           curr = curr.children[idx];
       }
       return curr.eow == true;
   }

   public static boolean wordBreak(String str) {
       int n = str.length();
       if (n == 0) return true;

       for (int i = 1; i <= n; i++) {
           String FirstPart = str.substring(0,i); // i is exclusive
           String SecondPart = str.substring(i);
           if (search(FirstPart) && wordBreak(SecondPart)) {
               return true;
           }
       }
       return false;
   }

   public static void main(String args[]) {
       String words[] = {"the", "a", "there", "their", "any", "thee"};
       for (String word : words) {
           insert(word);
       }
         String str = "theeany";
       System.out.println(wordBreak(str));
   }
}

/*
OUTPUT:
true
Time Complexity: O(n^m), where n is the length of the string and m is the number of words in the dictionary.
*/