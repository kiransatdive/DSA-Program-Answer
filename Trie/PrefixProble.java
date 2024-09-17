package Trie;

public class PrefixProble {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        int frequency;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            frequency = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {

        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].frequency++;
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static void findprefix(Node root,String ans) {
        if (root == null) {
            return;
        }
        if (root.frequency == 1) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                findprefix(root.children[i], ans + (char) (i + 'a'));
            }

        }
    } 

    public static void main(String[] args) {
        String arr[] = { "zebra", "dog", "duck", "dove" };
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);

        }
        root.frequency = -1;
        findprefix(root, "");
    }
}
