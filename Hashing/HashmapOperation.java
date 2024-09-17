package Hashing;

import java.util.HashMap;

public class HashmapOperation {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 58);

        System.out.println(hm);

        // get -0(1)
        int population = hm.get("India");
        System.out.println(population);

        // contains Key-0(1)

        System.out.println(hm.containsKey("India")); // true

        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // is empty

        System.out.println(hm.isEmpty());

        // clear function

        hm.clear();

    }

}
