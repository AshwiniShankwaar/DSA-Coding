package GFG;

import java.util.ArrayList;
import java.util.HashMap;

public class firstRepeatingElement {
    public static void main(String[] args) {
        System.out.println(firstRepeated(new int[]{1, 3, 4,5,6,7,8,8,8},9));
    }
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int out = n;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x:arr) {
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        map.forEach((k,v)->{
            if(v>1){
                list.add(k);
            }
        });
        if(list.size()==0){
            return -1;
        }
        ArrayList<Integer> num = new ArrayList<>();
        for(int a:arr){
            num.add(a);
        }

        for (int l:list) {
            int index = num.indexOf(l);
            if(index<out){
                out = index;
            }
        }
        return out+1;
    }
}
