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

    // Insertion In Trie
    public static void insert(String word) {
        Node curr = root; // root value should not be changed thats why we are using curr
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].endOfWord = true;
            }
            curr = curr.children[idx];
        }
    }

    // Search In Trie
    public static boolean Search(String word) {
        Node curr = root; // root value should not be changed thats why we are using curr
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            if (i == word.length() - 1 && curr.children[idx].endOfWord == false) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = { "the", "ab", "there", "their", "any" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(Search("their"));
        System.out.println(Search("thor"));
    }
}
