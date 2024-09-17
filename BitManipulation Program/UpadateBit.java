class UpdateBit{
    public static int upadateIthbit(int n,int i, int newbit){
        // if(newbit=0){
        //     return ClearIthBit(n,i);
        // }else{
        //     return setIthBit(n,i);

        // } 
          n=clearIthBit(n,i);
          int BitMask=newBit<<i;
          return n|BitMask;


    }
    public static void main(String[] args){
        System.out.println(upadateIthbit(10,2,1));
    }
        
    }
}