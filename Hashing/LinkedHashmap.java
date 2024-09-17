package Hashing;

import java.util.*;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();  //order maintain 
        lhm.put("India", 100);
        lhm.put("US", 160);
        lhm.put("China", 20);
        lhm.put("Itly", 145);
        System.out.println(lhm);
    }

}