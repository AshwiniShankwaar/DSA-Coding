package LeetCode;
//https://leetcode.com/problems/coin-change/
import java.util.Arrays;

public class problem322 {
    public static void main(String[] args) {
        problem322 p = new problem322();
        int x = p.coinChange(new int[]{186,419,83,408},6249);
        System.out.println(x);
    }
    public int coinChange(int[] coins, int amount) {
        if(amount == 0){
            return 0;
        }
        Arrays.sort(coins);
        int x = coins.length+1;
        int y = amount+1;
        int dp[][] = new int[x][y];
        for(int i = 0;i<y;i++){
            dp[0][i] = -1;
        }
        for(int i = 0;i<x;i++){
            dp[i][0] = 0;
        }
        for(int i = 1;i<x;i++){
            for(int j = 1;j<y;j++){
                if(coins[i-1]>j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    if(dp[i-1][j]==-1){
                        dp[i][j] = 1+dp[i][j-coins[i-1]];
                    }else dp[i][j] = Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
                }
            }
        }
        if(dp[x-1][y-1] == 0){
            return -1;
        }else{
            return dp[x-1][y-1];
        }
    }
}
