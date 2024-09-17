//Order using DLL 
//perfirmance TC o(1)

package Hashing;

import java.util.*;

public class LinkedHashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");

        System.out.println(cities);

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("delhi");
        lhs.add("Pune");
        lhs.add("Nagar");

        System.out.println(lhs);

        
    }

}
