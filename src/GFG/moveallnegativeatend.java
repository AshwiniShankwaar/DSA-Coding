package GFG;

import java.util.ArrayList;

public class moveallnegativeatend {
    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6};
        segregateElement(arr, arr.length);
        for (int x:arr) {
            System.out.println(x);
        }
    }
    public static void segregateElement(int arr[],int n){
        ArrayList<Integer> g = new ArrayList<Integer>();
        ArrayList<Integer> s = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                g.add(arr[i]);
            }else{
                s.add(arr[i]);
            }
        }
        int index = 0;
        for (int i:g) {
            arr[index] = i;
            index++;
        }
        for (int i:s) {
            arr[index] = i;
            index++;
        }
    }
}
