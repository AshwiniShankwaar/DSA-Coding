package Target100In30DaysEnd16JanLeetCode.prefixSum.med;

import java.util.Random;

/**
 * You are given a 0-indexed array of positive integers w where w[i] describes the weight of the ith
 * index.
 *
 * You need to implement the function pickIndex(), which randomly picks an index in the range [
 * 0, w.length - 1](inclusive) and returns it. The probability of picking an index i is w[i] / sum(w).
 *
 * For example, if w = [1, 3], the probability of picking index 0 is 1 / (1 + 3) = 0.25
 * (i.e., 25%), and the probability of picking index 1 is 3 / (1 + 3) = 0.75 (i.e., 75%).
 * */
public class RandomPickWithWeight {
    double sum;
    double[] p;
    Random random = new Random();
    public RandomPickWithWeight(int[] w){
        this.p = new double[w.length];
        for (int j : w) sum = j + sum;
        p[0] = w[0]/sum;
        for (int i = 1; i < w.length; i++) p[i] = p[i - 1] + (w[i] / sum);
    }
    public int pickIndex() {
//        int index = -1;
//        if(sum.length == 1) return 0;
//        index = (int)Math.random()*(sum.length-0+1)*10;
//        index = random.nextInt(sum.length-1);

        double target = random.nextDouble();
        int low = 0;
        int high = p.length-1;
        while(low < high) {
            int mid = (low + high)/2;
            if(p[mid]<target) low = mid+1;
            else high = mid;
        }
        return low;
    }
}
