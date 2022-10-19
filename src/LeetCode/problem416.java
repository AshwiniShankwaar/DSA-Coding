package LeetCode;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class problem416 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader bf = new BufferedReader(new FileReader("test.txt"));
        String data = bf.readLine();
        String[] x = data.split(" ");
        for (int i = 0; i < x.length; i++) {
            String[] string = x[i].replaceAll("\\[", "")
                    .replaceAll("]", "")
                    .split(",");
            int[] arr = new int[string.length];
            for (int j = 0; j < string.length; j++) {
                arr[j] = Integer.valueOf(string[j]);
            }
            boolean r = new solution().canPartition(arr);
            if(r)System.out.println("true");
            else System.out.println("false");
        }
    }

}
class solution{
    public boolean canPartition(int[] nums){
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if ((sum & 1) == 1) {
            return false;
        }
        sum /= 2;

        int n = nums.length;
        boolean[] dp = new boolean[sum+1];
        Arrays.fill(dp, false);
        dp[0] = true;

        for (int num : nums) {
            for (int i = sum; i > 0; i--) {
                if (i >= num) {
                    dp[i] = dp[i] || dp[i-num];
                }
            }
        }

        return dp[sum];
    }
    //TLE
    /*public boolean canPartition(int[] nums) {
        boolean o =false;
        int sum = 0;
        for (int x:nums) {
            sum = sum+x;
        }
        int w = sum/2;
        if(sum%2 ==0){

            int x = check(nums,0,w,0);
            if (x == 2){
                o = true;
            }else if(x>=2){
                return true;
            }
            return o;
        }
        return false;
    }

    private static int check(int[] nums, int n,int w,int count) {
        if(w == 0 && n == nums.length){
            count++;
            return count;
        }else if(n==nums.length || w<0){
            return count;
        }
        int x =  check(nums,n+1,w-nums[n],count);
        int y = check(nums,n+1,w,count);
        x += y;
        return x;
    }*/
}