package DynamicProgramming;

public class EditDistance {
    public static int editstring(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                if (j == 0) {
                    dp[i][j] = i;
                }
            }
        }

        // Bottom-up dynamic programming
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    // Characters are the same
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // Characters are different
                    int add = dp[i][j - 1] + 1; // Insert
                    int del = dp[i - 1][j] + 1; // Delete
                    int rep = dp[i - 1][j - 1] + 1; // Replace
                    dp[i][j] = Math.min(add, Math.min(del, rep));
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";

        System.out.println(editstring(word1, word2));
    }
}
