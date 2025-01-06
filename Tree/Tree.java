//------------------------------
// a binary tree is a tree which has at max two children

//-----------------------------------------------------------------------------------
// BinaryTrees Implementation (Pre-order)

package Tree;

import java.util.*;

public class Tree {
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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // --------------------------------------------------------------
    // PreOrder Traversal :-
    // 1) Root
    // 2) Left SubTree
    // 3) Right SubTree
    // --------------------------------------------------------------

    public static void preOrder(Node root) {
        if (root == null) {
            // System.out.print(-1 + " "); // if you wanna print -1 too else no need
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    // --------------------------------------------------------------
    // inOrder Traversal :-
    // 1) Left SubTree
    // 2) Root
    // 3) Right SubTree
    // --------------------------------------------------------------

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    // --------------------------------------------------------------
    // postOrder Traversal :-
    // 1) Left SubTree
    // 2) Right SubTree
    // 2) Root
    // --------------------------------------------------------------

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data + " ");
    }

    // --------------------------------------------------------------
    // levelOrder Traversal :-
    // using queue we have to do this ;
    // in this we do BFS(Breadth First Search) means getting the nodes which are at
    // same level but in previous
    // three traversals we use DFS(Depth First Search)which means going in depth
    // first to get the nodes.
    // ----------------------------------------------------------------------------------

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

    }

    // --------------------------------------------------------------
    // Counting Nodes of a Binary TREE :-
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countNodes(root.left); // leftNodes is for traversing through the left nodes and returning 1 for
                                               // a single node similarly rightNodes for right ones
        int rightNodes = countNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    // --------------------------------------------------------------
    // Sum of Nodes:-
    public static int sumOFNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOFNodes(root.left); // leftNodes is for traversing through the left nodes and returning the
                                             // data for a single node similarly rightNodes for right ones
        int rightSum = sumOFNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    // --------------------------------------------------------------
    // Height of a tree:-
    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = heightOfTree(root.left); // leftNodes is for traversing through the left nodes and returning 1
                                                 // for a single node similarly rightNodes for right ones
        int rightNodes = heightOfTree(root.right);

        int height = Math.max(leftNodes, rightNodes) + 1;

        return height;
    }

    // --------------------------------------------------------------
    // Diameter Of Nodes(Number of nodes in the longest path between any two
    // nodes)(Complexity:-O(n*n):-
    public static int diameterOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diameterOfNodes(root.left); // calculating the diamter in the left subtree
        int diam2 = diameterOfNodes(root.right); // calculating the diamter in the right subtree
        int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1; // calculating the height in LST and also in
                                                                            // RST plus including the root node(which is
                                                                            // 1)

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    // --------------------------------------------------------------
    // Diameter Of Nodes(Number of nodes in the longest path between any two
    // nodes)(Complexity :O(n)):-
    // Optimal Solution
    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo diameterOfNodes2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameterOfNodes2(root.left);
        TreeInfo right = diameterOfNodes2(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height + right.height + 1;

        int myDiameter = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo info = new TreeInfo(myHeight, myDiameter);
        return info;
    }

    // ------------------------------------------------------------------
    // Check a subtree is part of another tree or not (asked by FAAANG)

    // isIdentical is called to check if two trees are identical when the root node
    // matches with subRoot's root
    public static boolean isIdentical(Node root, Node subRoot) {
        // If both root and subRoot are null, the trees are identical
        if (root == null && subRoot == null) {
            return true;
        }
        // If either root or subRoot is null (but not both), the trees are not identical
        if (root == null || subRoot == null) {
            return false;
        }
        // Check if the current nodes match and if the left and right subtrees are
        // identical
        if (root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        // If the current nodes do not match, the trees are not identical
        return false;
    }

    // Function to determine if subRoot is a subtree of the given tree rooted at
    // root
    public static boolean subtreeOfAnotherSubtreeOrNot(Node root, Node subRoot) {
        // If subRoot is null, it is always a subtree (an empty tree is a subtree of any
        // tree)
        if (subRoot == null) {
            return true;
        }
        // If root is null and subRoot is not null, subRoot cannot be a subtree
        if (root == null) {
            return false;
        }
        // If the current nodes of root and subRoot match, check if the trees rooted at
        // these nodes are identical
        if (root.data == subRoot.data) {
            // Use isIdentical to verify if the subtree rooted at root matches subRoot
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        // Recursively check the left and right subtrees of root for subRoot
        return subtreeOfAnotherSubtreeOrNot(root.left, subRoot) || subtreeOfAnotherSubtreeOrNot(root.right, subRoot);
    }

    // ------------------------------------------------------------------
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node rootNode = bt.buildTree(nodes);
        // preOrder(rootNode);
        // System.out.println();
        // inOrder(rootNode);
        // System.out.println();
        // postOrder(rootNode);
        // System.out.println();
        // levelOrder(rootNode);
        // System.out.println("Total Nodes :- " + countNodes(rootNode));
        // System.out.println();
        // System.out.println("Height :- " + heightOfTree(rootNode));
        // System.out.println(diameterOfNodes2(rootNode).diameter);
        // System.out.println(diameterOfNodes2(rootNode).height);

        // SUBTREE QUESTION(Here we didnt use buildTree to build the tree)
        // Root Tree
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        root.left.right.left = new Node(0);

        // SubRoot Tree
        Node subRoot = new Node(4);
        subRoot.left = new Node(1);
        subRoot.right = new Node(2);
        subRoot.right.left = new Node(0);

        // Check if subRoot is a subtree of root
        boolean result = subtreeOfAnotherSubtreeOrNot(root, subRoot);
        System.out.println("Is subRoot a subtree of root? " + result);

    }
}
