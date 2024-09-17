package DynamicProgramming;

public class ClimbingStairsRecursion {
    public static int countways(int n) {
        if (n == 0) {
            return 1;

        }
        if (n < 0) {
            return 0;
        }

        return countways(n - 1) + countways(n - 2);   //using  1,2,3, stairs add +countways(n-3)
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(countways(n));
    }
}
