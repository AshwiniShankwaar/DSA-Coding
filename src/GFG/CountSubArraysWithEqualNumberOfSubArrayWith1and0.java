package GFG;

import java.util.HashMap;

public class CountSubArraysWithEqualNumberOfSubArrayWith1and0 {
    public static void main(String[] args) {
        System.out.println(countSubarrWithEqualZeroAndOne(new int[]{1,1,1,1,0},5));
    }
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        int num = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int a: arr) {
            if(a == 1){
                sum +=1;
            }else if(a ==0){
                sum -=1;
            }
            if(map.containsKey(sum)){
                num = num+map.get(sum);
                map.put(sum, map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        return num;
    }
}
