package GFG;

import java.util.ArrayList;

public class RearrangeNegativeAndPositive {
    public static void main(String[] args) {
        int [] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        rearrange(arr,arr.length);
        for (int i:arr) {
            System.out.println(i);
        }
    }
    static void rearrange(int[] arr,int n){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i] >=0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }
        int k = 0;
        int l = 0;

        for (int i = 0; i < n; i++) {
            if(k==pos.size() || l== neg.size()){
                if (k == pos.size()) {
                    arr[i] = neg.get(l);
                    l++;
                } else if (l == neg.size()) {
                    arr[i] = pos.get(k);
                    k++;
                }
            }else {
                if(i%2!=0){
                    arr[i] = neg.get(l);
                    l++;
                }
                else{
                    arr[i] = pos.get(k);
                    k++;
                }

            }
        }
    }
}
