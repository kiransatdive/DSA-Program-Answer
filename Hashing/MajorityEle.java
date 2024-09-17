//Given array of size n,find all elements that appear more than n/3 times  
package Hashing;

import java.util.*;

public class MajorityEle {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {

                hm.put(arr[i], hm.get(arr[i]) + 1);

            } else {
                hm.put(arr[i], 1);
            }

        }
        Set<Integer> keyset = hm.keySet();
        for (Integer key : keyset) {
            if (hm.get(key) > arr.length / 3) {
                System.out.println(key);
            }

        }
    }
}
