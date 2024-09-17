package SegmentTrees;

public class ConstructSegTree {
    static int tree[];

    public static void init(int n) {
        tree = new int[4 * n];
    }

    public static int builtST(int arr[], int i, int start, int end) {
        if (start == end) {
            tree[i] = arr[start];
            return arr[start];
        }

        int mid = (start + end) / 2;
        int leftSum = builtST(arr, 2 * i + 1, start, mid); // Corrected the index for the left subtree
        int rightSum = builtST(arr, 2 * i + 2, mid + 1, end); // Corrected the index for the right subtree
        tree[i] = leftSum + rightSum;
        return tree[i];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        init(n);
        builtST(arr, 0, 0, n - 1);

        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
    }
}
