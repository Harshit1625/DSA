package Trie;

// also known as prefix tree , digital tree or retrival tree
//used to retrieve data from a string or something else
//its root node is an empty node
//prefix is not repeated

public class TrieDS {
    static class Node {
        Node[] children;
        boolean endOfWord;

        public Node() {
            children = new Node[26]; // 26 (a to z)
            // allocating memory for a node
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    static Node root = new Node(); // creating the root node , it will be null

    public static void insert(String word) {
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i);
            if (root.children[idx] == null) {
                root.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                root.endOfWord = true;
            }
            root = root.children[idx];
        }
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any" };
        for (int i = 0; i < words.length; i++) {

        }
    }
}
