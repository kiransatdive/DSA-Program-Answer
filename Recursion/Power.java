class Power{
    public static int optimizedPower(int a, int n){
        if(n==0){
            return 1;

        }
        int halfPwerSq=optimizedPower(a, n/2)*optimizedPower(a, n/2);

        //n is odd
        if(n%2!=0){
            halfPwerSq=a*halfPwerSq;


        }
        return halfPwerSq;
    }
    public static void main(String[] args){
        int a=2;
        int n=10;
        System.out.println(optimizedPower(a, n));
    }
}