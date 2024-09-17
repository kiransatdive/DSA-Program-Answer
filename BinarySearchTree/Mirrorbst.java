package BinarySearchTree;

public class Mirrorbst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left=this.right=null;
        }
    }

    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }

        Node leftnode = mirror(root.left);
        Node rightnode = mirror(root.right);

        root.left = rightnode;
        root.right = leftnode;
        return root;

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;

        }
        System.out.println(root.data + "");
        preorder(root.left);

        preorder(root.right);

    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        root = mirror(root);
        preorder(root);

    }

}
