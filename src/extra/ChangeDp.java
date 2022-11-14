package extra;

import java.util.Scanner;

public class ChangeDp {
    private static int getChange(int m) {
        int[] coins = {1,3,4};
        int[][] dp = new int[coins.length+1][m+1];
        for (int i = 0; i < m+1; i++) {
            dp[0][i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < coins.length+1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i < coins.length+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if(coins[i-1]>j){
                    dp[i][j] = dp[i-1][j];
                } else if (coins[i-1]<=j) {
                    dp[i][j] = Math.min(dp[i][j-coins[i-1]]+1,dp[i-1][j]);
                }
            }
        }
        return dp[coins.length][m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}
