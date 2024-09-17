package BinarySearchTree2;

import java.util.*;

public class ConvertBSTtoBalanced {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;

        }
        System.out.println(root.data + "");
        preorder(root.left);

        preorder(root.right);

    }

    public static void getinorder(ArrayList<Integer> inorder, Node root) {
        if (root == null) {
            return;

        }
        getinorder(inorder, root.left);
        inorder.add(root.data);
        getinorder(inorder, root.right);

    }

    public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid - 1);
        root.right = createBST(inorder, mid + 1, end);
        return root;

    }

    public static Node BalancedBST(Node root) {
        // inorder sequnced
        ArrayList<Integer> inorder = new ArrayList<>();
        getinorder(inorder, root);

        // sorted inorder ->balanced BST
        root = createBST(inorder, 0, inorder.size() - 1);
        return root;

    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);

        root.left.left = new Node(5);

        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        root = BalancedBST(root);
        preorder(root);

    }
}
