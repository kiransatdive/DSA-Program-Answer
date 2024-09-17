package BinaryTree;

public class PreorderTraversal {

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
            if (idx>=nodes.length || nodes[idx] == -1) {
                return null;

            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void porder(Node root) {
            if (root == null) {
                return;

            }
            System.out.print(root.data + "");
            porder(root.left);
            porder(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        tree.porder(root);
    }
}
