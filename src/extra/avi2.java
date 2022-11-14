package extra;

import java.util.Scanner;

public class avi2 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        int diff = Integer.MIN_VALUE;
        if (nums == null || nums.length == 0) {
            System.out.println(diff);
        }
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = nums.length - 1; j > i; j--)
            {
                if (nums[j] > nums[i] && diff < j - i) {
                    diff = j - i;
                }
            }
        }
        System.out.println(diff);
    }
}
