package Trie;

// ================================================================================================
public class Practice {
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

    // ===============================================================================================================
    // Word Break Problem
    // Given an input string and a dictionary of words , find out if the input
    // string can be broken into a space separated sequence of dictionary words

    // fn for wordbreak
    // public static boolean wordBreak(String word) {
    // if (word.length() == 0) {
    // return true;
    // }
    // for (int i = 1; i <= word.length(); i++) {
    // String firstPart = word.substring(0, i);
    // String secondPart = word.substring(i);

    // /*
    // * Untill Search() returns true the recursive wont get called (i.e when we
    // will
    // * reach the end of word only then Search will be true)
    // */

    // // Since "sam" followed by "sung" did not successfully break the word,
    // because
    // // "sung" wasnt present in trie so we
    // // backtrack to the previous call (wordBreak("samsung")) and continue the
    // loop.
    // if (Search(firstPart) && wordBreak(secondPart)) {
    // return true;
    // }
    // }
    // return false;
    // }

    // public static void main(String[] args) {
    // String words[] = { "i", "like", "sam", "samsung", "mobile" };
    // String key = "ilikesamsung";
    // for (int i = 0; i < words.length; i++) {
    // insert(words[i]);
    // }
    // System.out.println(wordBreak(key));

    // }
    // }

    // -----------------------------------------------------------------
    // Starts With Problem
    // Returns true if there is a previously inserted string word that has the
    // prefix, and false otherwise

    public static boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String args[]) {
        String words[] = { "app", "apple", "mango", "man", "woman" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(startsWith("app"));
    }

}

// -----------------------------------------------------------------
// Count Unique Substrings
// Given a string of length n of lowercase alphabet characters , we need to
// count total number of distinct substrings of this string
