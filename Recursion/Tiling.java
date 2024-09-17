class Tiling{
    public static int tilingproblem(int n)
{
    if(n==0 || n==1){
        return 1;

    }
    // vertical case
    int fnm1=tilingproblem(n-1);

    // Horizontal case
    int fnm2=tilingproblem(n-2);
      
    int totalways=fnm1+fnm2;

              return totalways;
     }
     public static  void main(String[] args){
        System.out.println(tilingproblem(4));
     }
}