package Tree;

//--------------------------------------------------------------------
//Binary Tree has complexity of O(N) whereas Binary Search Tree has a complexity of O(H); N means Nodes , H means Height of the tree
//in average cases H<N ;means (logn)
//--------------------------------------------------------------------
//Note :- In BST , inOrder traversal always gives increasing order sequence
//Worst Case Sceanario :- O(N) = O(H) ; height becomes equal to the no of nodes.
//Like , Linear Search = Binary Search ; Binary Tree = Binary Search Tree
//90% questions are solved using recursion
//--------------------------------------------------------------------

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // -----------------------------------------------------------------

    // function to build BST
    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (root.data > data) {
            // left subtree
            root.left = insert(root.left, data);
        } else {
            // right subtree
            root.right = insert(root.right, data);
        }
        return root;
    }

    // -----------------------------------------------------------------
    // function to check BST using inOrder traversal(gives Sequencial Order)
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // -----------------------------------------------------------------
    // function to search in a BST
    public static boolean searchBST(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return searchBST(root.left, key);
        }
        if (root.data < key) {
            return searchBST(root.right, key);
        }
        if (root.data == key) {
            return true;
        }
        return false;
    }

    // -----------------------------------------------------------------
    public static void main(String[] args) {
        int nodes[] = { 5, 1, 3, 4, 2, 7 };
        Node rootNode = null;
        for (int i = 0; i < nodes.length; i++) {
            rootNode = insert(rootNode, nodes[i]);
        }
        inOrder(rootNode);
        System.out.println(searchBST(rootNode, 6));
    }
}
