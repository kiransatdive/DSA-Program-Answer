class UpdateBit{
    public static int updateIthbit(int n,int i, int newbit){
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
        System.out.println(updateIthbit(10,2,1));
    }
        
    }
}