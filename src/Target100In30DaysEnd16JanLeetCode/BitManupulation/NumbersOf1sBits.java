package Target100In30DaysEnd16JanLeetCode.BitManupulation;

import java.util.ArrayList;
import java.util.List;

public class NumbersOf1sBits {
    List<Integer> list = new ArrayList<>();
    public int hammingWeight(int n) {

        int res = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                res += 1;
            }
        }
        return res;

//        convertDecimalToBinary(n);
//        int sum = 0;
//        for(Integer i : list){
//            sum += i.intValue();
//        }
//        return sum;
    }
    public void convertDecimalToBinary(int n){
        while(n>0){
            int i = n%2;
            n/=2;
            list.add(i);
        }
    }
}
