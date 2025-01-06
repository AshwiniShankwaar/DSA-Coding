package Target100In30DaysEnd16JanLeetCode.HashTable;

import java.util.HashSet;

/**
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 *
 * ->Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * ->Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a
 * cycle which does not include 1.
 * ->Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 * */
public class HappyNumber {
    int[] sqr = new int[10];
    public HappyNumber(){
        sqr[0] = 0;
        for (int i = 1; i < sqr.length; i++) {
            sqr[i] = (int)Math.pow(i,2);
        }
    }
    HashSet<Integer> set = new HashSet<Integer>();
    public boolean isHappy(int n) {
        int sum = 0;
        while(n>9){
            int digit = n % 10;
            sum+=sqr[digit];
            n/=10;
        }
        sum+=sqr[n];
        if(sum == 1) return true;
        if(set.contains(sum)) return false;
        else set.add(sum);
        return isHappy(sum);
    }
}
