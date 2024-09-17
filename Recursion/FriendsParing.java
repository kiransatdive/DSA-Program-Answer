public class FriendsParing {
    public static int paring(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1=paring(n-1);

        int fnm2=paring(n-2);
            int pairways=(n-1) *fnm2;
        int totalways=fnm1+pairways;
        return totalways;

    }
    public static void main(String[] args){
                  System.out.println(paring(3));
    }
}
