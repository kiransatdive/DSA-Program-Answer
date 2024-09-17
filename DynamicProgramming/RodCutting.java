package DynamicProgramming;

public class RodCutting {
    // length => weight, price => val, Rod => W
    public static int knapsack(int length[], int price[], int Rod) {
        int n = price.length;
        int dp[][] = new int[n + 1][Rod + 1];

        // Initialize the dp array for the base cases.
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Rod; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Rod; j++) {
                if (length[i - 1] <= j) {
                    // valid
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                } else {
                    // invalid
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][Rod];
    }

    public static void main(String[] args) {
        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int Rod = 8;

        System.out.println(knapsack(length, price, Rod));
    }
}
