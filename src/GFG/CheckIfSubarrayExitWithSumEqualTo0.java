package GFG;

import java.util.HashMap;
import java.util.Iterator;

public class CheckIfSubarrayExitWithSumEqualTo0 {
    public static void main(String[] args) {
        int[] arr = {10,-10};
        boolean check = findsum(arr, arr.length);
        if(check){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean findsum(int arr[],int n)
    {
        //Your code here
        if(n==1){
            if(arr[0]==0){
                return true;
            }else{
                return false;
            }
        }
        if(n==0){
            return false;
        }
        boolean check = false;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                return true;
            }
            sum +=arr[i];
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        Iterator itr = map.values().iterator();
        while(itr.hasNext()){
            if((int)itr.next() >=2){
                check = true;
            }
        }
        return check;
    }
}
