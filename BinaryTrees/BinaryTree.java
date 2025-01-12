import java.util.*;

class BinaryTree {
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

    static int idx = -1;

    static Node pretreeBuilder(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = pretreeBuilder(nodes);
        newNode.right = pretreeBuilder(nodes);

        return newNode;
    }

    static void preTraversal(Node root, String str, boolean isLeft) {
        if (root != null) {

            System.out.println(str + (isLeft ? "├── " : "└── ") + root.data);
            preTraversal(root.left, str + (isLeft ? "│   " : "    "), true);
            preTraversal(root.right, str + (isLeft ? "│   " : "    "), false);
        }
    }

    static void inorderTraversal(Node root, String str, boolean isLeft) {

        if (root != null) {
            inorderTraversal(root.left, str + (isLeft ? "|   " : "    "), true);
            System.out.println(str + (isLeft ? "|-- " : "└── ") + root.data);
            inorderTraversal(root.right, str + (isLeft ? "|   " : "    "), false);
        }
    }

    static void postTraversal(Node root, String str, boolean isLeft) {

        if (root != null) {
            postTraversal(root.left, str + (isLeft ? "|   " : "    "), true);
            postTraversal(root.right, str + (isLeft ? "|   " : "    "), false);
            System.out.println(str + (isLeft ? "|-- " : "└── ") + root.data);
        }
    }

    static void levelWiseTraversal(Node root) {
        Queue<Node> q1 = new LinkedList<>();
        if (root != null) {
            q1.add(root);
            q1.add(null);
        }
        while (!q1.isEmpty()) {
            root = q1.remove();
            System.out.print(root == null ? "\n" : root.data);
            if (root != null) {
                if (root.left != null) {
                    q1.add(root.left);
                }
                if (root.right != null) {
                    q1.add(root.right);
                }
            }

            if (root == null && (!q1.isEmpty())) {
                q1.add(null);
            }
        }
    }

    static int depth(Node root) {

        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);

        return (left > right ? left : right) + 1;

    }

    static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return left + right + 1;
    }

    static int leafNodes(Node root) {

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return leafNodes(root.left) + leafNodes(root.right);
    }

    static boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.data == root2.data) {
            return (isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right));
        }
        return false;
    }

    static boolean isSubTree(Node root,Node subRoot){
        if(subRoot == null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(isIdentical(root, subRoot)){
            return true;
        }
        return (isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot));

    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = pretreeBuilder(nodes);
        preTraversal(root, "", false);
        inorderTraversal(root, "", false);
        System.err.println("");
        postTraversal(root, "", false);
        levelWiseTraversal(root);
        System.out.println(depth(root));
        System.out.println(leafNodes(root));
        System.out.println(isIdentical(root, root.left));
    }
}