package Hashing;

import java.util.HashMap;
import java.util.Set;

public class InterationHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 58);

        // Iterrate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.print("Key = " + k + ",value = " + hm.get(k));

        }

    }
}
