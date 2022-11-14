package GFG;

import java.util.Arrays;

public class findmissingnumber {
    public static void main(String[] args) {
        System.out.println(miss(new int[]{2,3,4,1,6,7},7));
    }
    public static int miss(int[] array,int n){
        Arrays.sort(array);
        int missing = -1;
        for(int i = 0;i< array.length;i++){
            if(array[i]!=i+1){
               missing = i+1;
               break;
            }
        }
        if(missing == -1){
            if(array.length<n){
                missing = n;
            }
        }
        return missing;
    }
}
