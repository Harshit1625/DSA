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
    // function to Delete a node in a BST
    // there will be three cases :-
    // 1) No Child : Delete node and return to parent
    // 2) One child : Delete node and replace with child node
    // 3) Two Child : Replace value with inorder successor and Delete the node for
    // inorder successor(LEFT MOST NODE IN THE RIGHT SUBTREE)
    // -----------------------------------------------------------------
    public static Node deleteNode(Node root, int data) {
        // 82 to 85 is for searching the node
        if (root.data > data) {
            root.left = deleteNode(root.left, data);
        } else if (root.data < data) {
            root.right = deleteNode(root.right, data);
        } else {
            // root.data == data
            // case 1
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);
        }
        return root;
    }

    // function to get the inOrder Successor
    public static Node inOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // -----------------------------------------------------------------
    // function to print in range in a BST
    public static void printInRange(Node root, int X, int Y) {
        if (root == null) {
            return;
        }
        if (root.data >= X && root.data <= Y) {
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);
        } else if (root.data >= Y) {
            printInRange(root.left, X, Y);
        } else {
            printInRange(root.right, X, Y);
        }
    }

    // -----------------------------------------------------------------
    // function to get all the paths from root to leaf
     public static void pathCalculate(Node root){
        
     }
    // -----------------------------------------------------------------
    public static void main(String[] args) {
        int nodes[] = { 5, 1, 3, 4, 2, 7 };
        Node rootNode = null;
        for (int i = 0; i < nodes.length; i++) {
            rootNode = insert(rootNode, nodes[i]);
        }
        inOrder(rootNode);
        System.out.println();
        // System.out.println(searchBST(rootNode, 6));
        printInRange(rootNode, 3 , 8);
    }
}
