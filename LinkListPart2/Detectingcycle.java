package LinkListPart2;

public class Detectingcycle {
    class Node{
        int data;
        Node next;
         public Node(int data){
            this.data=data;
            this.next=null;

         }
    }
       class LinkedList{
        Node head;

        public  LinkedList(){
            this.head=null;

        }
       }
       public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;

        }else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
       }
    public static  boolean iscycle(){
        Node slow=head;
        Node fast=head;

             while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return true;   //Cycle exist
                }

             }
             return false;   //cycle does  not exits
    }


           public static void main(String[] args){
           
            head=new Node(1);
            head.next=new Node(2);
            head.next.next=new Node(3);
            head.next.next.next=head;
                     //1->2->2->1
              System.err.println(iscycle());
           }


}
