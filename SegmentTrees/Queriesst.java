package SegmentTrees;

import Hashing.tree;

public class Queriesst {
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

    public static int getSumutil(int i, int si, int sj, int qi, int qj) {
        if (qj <= si || qi >= sj) { // non Overlapping
            return 0;

        } else if (si >= qi && sj <= qj) {
            // Complete Overalapping
            return tree[i];

        } else {
            // partial overlap
            int mid = (si + sj) / 2;
            int left = getSumutil(2 * i + 1, si, mid, qi, qj);
            int right = getSumutil(2 * i + 2, mid + 1, sj, qi, qj);
            return left + right;
        }
    }

    public static int getSum(int arr[], int qi, int qj) {
        int n = arr.length;
        return getSumutil(0, 0, n - 1, qi, qj);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        init(n);
        builtST(arr, 0, 0, n - 1);

        // for (int i = 0; i < tree.length; i++) {
        //     System.out.print(tree[i] + " ");
        // }
        System.out.println(getSum(arr, 2, 5));

    }
}
