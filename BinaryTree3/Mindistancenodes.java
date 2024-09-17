package BinaryTree3;

public class Mindistancenodes {
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

    public static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        // leftlca =val rightlca=null

        if (rightLca == null) {
            return leftLca;

        }
        if (leftLca == null) {
            return rightLca;
        }
        return root;
    }

    public static int lcadist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;

        }
        int leftdist = lcadist(root.left, n);
        int rightdist = lcadist(root.right, n);

        if (leftdist == -1 && rightdist == -1) {
            return -1;

        } else if (leftdist == -1) {
            return rightdist + 1;

        } else {
            return leftdist + 1;
        }
    }

    public static int mindist(Node root, int n1, int n2) {
        Node Lca = lca(root, n1, n2);
        int dist1 = lcadist(Lca, n1);
        int dist2 = lcadist(Lca, n2);
        return dist1 + dist2;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4, n2 = 6;

        System.out.println(mindist(root, n1, n2));
    }

}
