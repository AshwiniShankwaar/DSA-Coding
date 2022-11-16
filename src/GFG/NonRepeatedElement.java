package GFG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedElement {
    public static void main(String[] args) {
        String test = "-1 -17 -12 8 16 -17 -13 -14 -3 -6 -5 -11 -10 -12 -5 19 -17 -5 -1 12";
        String[] d = test.split(" ");
        int[] arr = new int[d.length];
        int i = 0;
        for (String x : d) {
            arr[i] = Integer.parseInt(x);
            i++;
        }
        System.out.println(firstNonRepeating(arr, arr.length));
    }

    public static int firstNonRepeating(int arr[], int n) {
        // Complete the function
//        int firstNonRepeatedElement = n;
//        ArrayList<Integer> num = new ArrayList<>();
//        ArrayList<Integer> data = new ArrayList<>();
        Map<Integer, Integer> mp = new LinkedHashMap<>();
        for (int a : arr) {
            if (mp.containsKey(a)) {
                mp.put(a, mp.get(a) + 1);
            } else {
                mp.put(a, 1);
            }
        }
        for (Map.Entry<Integer, Integer> m : mp.entrySet()) {
            if (m.getValue() == 1) {
                return m.getKey();
            }
        }
        return 0;
    }
}
//
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int a:arr) {
//            if(map.containsKey(a)){
//                map.put(a,map.get(a)+1);
//            }else{
//                map.put(a,1);
//            }
//        }
//        for (int x=0;x<n;x++) {
//
//        }
//        if(firstNonRepeatedElement == n){
//            return 0;
//        }else{
//            return arr[firstNonRepeatedElement];
//        }

//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int a:arr) {
//            if(map.containsKey(a)){
//                map.put(a,map.get(a)+1);
//            }else{
//                map.put(a,1);
//            }
//        }
//        map.forEach((k,v)->{
//            if(v==1){
//                num.add(k);
//            }
//        });
//        for (int y:num) {
//            if(firstNonRepeatedElement>data.indexOf(y)){
//                firstNonRepeatedElement = data.indexOf(y);
//            }
//        }
//        if(firstNonRepeatedElement == n){
//            return 0;
//        }else{
//            return arr[firstNonRepeatedElement];
//        }
//    }
//}
