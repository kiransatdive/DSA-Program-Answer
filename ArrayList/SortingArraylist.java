package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class SortingArraylist {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();

        list.add(6);
        list.add(8);
        list.add(7);
        list.add(3);
        list.add(9);


         System.out.println(list);
         Collections.sort(list);
          System.out.println(list);

           //Descending Order
           Collections.sort(list,Collections.reverseOrder());
           System.out.println(list);
            //Comparator :- Function login in reverse Order or Descending function


        

    }
}
 