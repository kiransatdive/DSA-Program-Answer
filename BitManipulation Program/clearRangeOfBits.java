class clearRangeOfBits{
    public static int  clearRangeinbits(int n,int i,int j) {
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=1|b;
        return n & bitmask;

    }
    public static void main(String[] args) {
        System.out.println(clearRangeinbits(10,2,4));
        
    }
}