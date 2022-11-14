package extra;

import java.util.ArrayList;
import java.util.Collections;

public class closedSum {
    public static void main(String[] args) {
        System.out.println(closureSum(678));
    }
    static int closureSum(int num){
        ArrayList<Integer> l = new ArrayList<>();
        int sum=0;
        String nums = Integer.toString(num);
        String temp = nums;
        if (temp.length()%2==0) {
            for (int i = 0, j = nums.length() - 1; i <= j; i++, j--) {
                String x = "" + nums.charAt(i) + nums.charAt(j);
                int v = Integer.valueOf(x);
                l.add(v);
            }
        }else{
            int i = 0,j = 0;
            for ( i = 0, j = nums.length() - 1; i < j; i++, j--) {
                String x = "" + nums.charAt(i) + nums.charAt(j);
                int v = Integer.valueOf(x);
                l.add(v);
            }
            String y = ""+nums.charAt(i);
            int key = Integer.valueOf(y);
            l.add(key);
        }
        for (int i = 0; i < l.size(); i++) {
            sum+=l.get(i);
        }
        return sum;
    }
}
