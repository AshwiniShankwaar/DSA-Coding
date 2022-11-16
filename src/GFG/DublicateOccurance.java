package GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class DublicateOccurance {
    public static void main(String[] args) {
        String s = "14 7 14 6 1 11 3 16 16 8 7 4 11 15 17 6 1 13";
        String[] str = s.split(" ");
        int[] n = new int[str.length];
        for (int i = 0;i<n.length;i++) {
            n[i] = Integer.parseInt(str[i]);
        }
        ArrayList<Integer> out = duplicates(n,18);
        for (int o:out) {
            System.out.println(o);
        }
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
//        HashMap<Integer,Integer> data = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            Integer j = data.get(arr[i]);
//            if(j==null)
//                data.put(arr[i],1);
//            else {
//                data.put(arr[i], j + 1);
//                list.add(arr[i]);
//            }
//        }
//        if(list.size()>0)
//        return list;
//        else{
//            list.add(-1);
//            return list;
//        }
//        Arrays.sort(arr);
//        for (int i = 0; i < n-1; i++) {
//            if(arr[i] == arr[i+1]){
//                list.add(arr[i]);
//            }
//        }
//        if(list.size()>0)
//            return list;
//        else{
//            list.add(-1);
//            return list;
//        }
        HashMap<Integer,Integer> data = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(data.containsKey(arr[i])){
                int j = data.get(arr[i]);
                data.put(arr[i],j+1);
            }else{
                data.put(arr[i], 1);
            }
        }
        data.forEach((k,v)->{
            if(v>1){
                list.add(k);
            }
        });
        Collections.sort(list);
        if(list.size()>0)
            return list;
        else{
            list.add(-1);
            return list;
        }
    }
}
