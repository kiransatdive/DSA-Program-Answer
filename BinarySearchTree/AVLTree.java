package BinarySearchTree;

public class AVLTree {
    static class Node {
        int data, height;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            height = 1;

        }
    }

    public static Node root;

    public static int height(Node root) {
        if (root == null) {
            return 0;
            return root.height;
        }

    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);

            if (key < root.data)
                root.left = insert(root.left, key);
            else if (key > root.data)
                root.right = insert(root.right, key);

            else
                return root; // Duplicate key is not allowed

        }
    }

    public static void main(String[] args){
        root=insert(root,key:10);
    }

}
