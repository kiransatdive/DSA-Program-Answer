package GeedyApproachAlgorithms;

import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        Arrays.sort(coins, Comparator.reverseOrder());
        int countOfcoins = 0;
        int amount = 790;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countOfcoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];

                }
            }
        }
        System.out.println("Total min coins used =" + countOfcoins);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i) + "");
        }
    }

}
