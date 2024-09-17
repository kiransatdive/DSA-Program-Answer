package ArrayList;

import java.util.ArrayList;


public class MultiDimentional {
    public static void main(String[] args){
     ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
    ArrayList<Integer> list1=new ArrayList<>();
    /*/  list.add(1);
    //  list.add(2);
    //  mainlist.add(list);

    //  ArrayList<Integer> list2=new ArrayList<>();
    //  list2.add(3);
    //  list2.add(4);
    //  mainlist.add(list2);

    //  for(int i=0;i<mainlist.size();i++){
    //     ArrayList<Integer> currList=mainlist.get(i);
          
    //     for( int j=0;j<currList.size();j++){
    //         System.out.println(currList.get(j)+ " ");

    //     }
    //       System.out.println();

    //  }
    //         System.out.println(mainlist);/* */
    


      ArrayList<Integer> list2=new ArrayList<>();
      ArrayList<Integer> list3=new ArrayList<>();

      for(int i=1;i<=5;i++){
        list1.add(i*1);
        list2.add(i*2);
        list3.add(i*3);

      }

      mainlist.add(list1);
      mainlist.add(list2);
      mainlist.add(list3);



    System.out.println(mainlist);

    //nested loops
    for(int i=0;i<mainlist.size();i++){
        ArrayList<Integer> currList=mainlist.get(i);
        for(int j=0;j<currList.size();j++){
            System.out.println(currList.get(j)+ " ");
        }
        System.out.println();
    }
         
  }

}
