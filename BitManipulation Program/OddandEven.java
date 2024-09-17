class OddandEven{
     
    public static void oddorEven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
           //even number
           System.out.println("Even number");

        }else{
            System.out.println("Odd Number");
        }
    }
        public static void main(String[] args) {
            oddorEven(3);
            oddorEven(11);
            oddorEven(14);
    }
    
}