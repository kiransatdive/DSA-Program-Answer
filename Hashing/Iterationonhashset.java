package Hashing;

import java.util.*;

public class Iterationonhashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("Mumbai");
        cities.add("Noida");

        Iterator it = cities.iterator(); //iterator method

        while (it.hasNext()) { 
            System.out.println(it.next());
        }

        for (String city : cities) {    //Enhansed method
            System.out.println(city);

        }
    }

}
