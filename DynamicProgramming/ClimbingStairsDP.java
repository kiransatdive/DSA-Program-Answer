package DynamicProgramming;

import java.util.*;

public class ClimbingStairsDP {
    //Memozation - o(n) | recursion (2^n)->n=10^5
    public static int countways(int n, int ways[]) {
        if (n == 0) {
            return 1;

        }
        if (n < 0) { 
            return 0;
        }
        if (ways[n] != -1) { // already calculator
            return ways[n];
        }

        ways[n] = countways(n - 1, ways) + countways(n - 2, ways);
        return ways[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(countways(n, ways));

    }
}
