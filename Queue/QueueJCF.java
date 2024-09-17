package Queue;
import java.util.*;
public class QueueJCF {
    public static void main(String[] args){
        Queue<Integer> q=new ArrayDeque<>();
       // Queue<Integer> q=new LinkedList<>();
        //queue is a interface , not be created object
        //IIt is also using ArrayDeque and Linkedlist
        //O(1) TC
         q.add(1);
         q.add(2);
         q.add(3);

         while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
         }
    }
}
