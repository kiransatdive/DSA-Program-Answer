package Hashing;

import java.util.HashSet;

public class HashSetopearation {
    public static void main(String args[]) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1);
        hs.add(2);
        
        System.out.println(hs);
        System.out.println(hs.size());


        if (hs.contains(2)) {
            System.out.println("set Contains 2");

        }

    }

}
