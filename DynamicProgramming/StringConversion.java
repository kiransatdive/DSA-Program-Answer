package DynamicProgramming;

public class StringConversion {
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
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    // Characters are the same
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // Characters are different
                    int add = dp[i][j - 1] + 1; // Insert
                    int del = dp[i - 1][j] + 1; // Delete
                    
                    dp[i][j] = Math.min(add, del);
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String word1 = "abcdefg";
        String word2 = "aceg";

        System.out.println(editstring(word1, word2));
    }

}
