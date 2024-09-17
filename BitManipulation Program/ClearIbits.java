// clear last ith bit 
class ClearIbits{
    public static int clearIbits(int n, int ,i){
        int bitmask=(~0)<<i;
        return n & bitmask;
// first Negation 
// Second 'and'  use 
// clear the bits using and operation

    }
     public static void main(String[] args){
        System.out.println(clearIbits(15,2));
     }


}

