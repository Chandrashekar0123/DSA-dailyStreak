class TrieCreation {
    static final int ALPHABET_SIZE = 26;

    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++) {
                children[i] = null;
            }
        }
    }

    static class Trie {
        TrieNode root;

        Trie() {
            root = new TrieNode();
        }

    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        System.out.println("Trie created."); // Simpler output as requested
    }
}

/*
OUTPUT:
Trie created.
*/