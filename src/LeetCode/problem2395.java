package LeetCode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class problem2395 {
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
            boolean r = new solution2395().findSubarrays(arr);
            if(r)System.out.println("true");
            else System.out.println("false");
        }
    }

}
class solution2395{
    public boolean findSubarrays(int[] nums) {
        //check for the subarray of same sum
        if(nums.length<=2) return false;
        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < nums.length-1; i++) {
            if(s.contains(nums[i]+nums[i+1])) return true;
            s.add(nums[i]+nums[i+1]);
        }
        return false;
    }
}
