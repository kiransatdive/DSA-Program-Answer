package Hashing;

import java.util.*;

public class Practice1 {

    public static void main(String[] args) {
        int arr[] = {3,2,4};
        int tar = 6;

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> indices = new ArrayList<>();
        indices.add(-1); // Initialize with -1 as a base case.
        map.put(0, indices);

        int sum = 0;
        int ans = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum - tar)) {
                List<Integer> prevIndices = map.get(sum - tar);
                for (int index : prevIndices) {
                    // Print the indices for subarray with sum equal to tar.
                    System.out.println("Subarray from index " + (index + 1) + " to " + j);
                    ans++;
                }
            }

            if (map.containsKey(sum)) {
                map.get(sum).add(j);
            } else {
                indices = new ArrayList<>();
                indices.add(j);
                map.put(sum, indices);
            }
        }

        System.err.println("Total subarrays with sum equal to " + tar + ": " + ans);
    }
}
