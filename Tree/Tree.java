//------------------------------
// a binary tree is a tree which has at max two children

//-----------------------------------------------------------------------------------
// BinaryTrees Implementation (Pre-order)

package Tree;

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
    // Order Traversal :-
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

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node rootNode = bt.buildTree(nodes);
        preOrder(rootNode);
        System.out.println();
        inOrder(rootNode);
        System.out.println();
        postOrder(rootNode);
    }
}
