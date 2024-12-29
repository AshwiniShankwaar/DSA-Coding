package Target100In30DaysEnd16JanLeetCode.prefixSum.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates
 * the birth and death years of the ith person.
 *
 * The population of some year x is the number of people alive during that year. The ith
 * person is counted in year x's population if x is in the inclusive range
 * [birthi, deathi - 1]. Note that the person is not counted in the year that they die.
 *
 * Return the earliest year with the maximum population.
 * */
public class MaximumPopulationYear {
    public int maximumPopulation(int[][] logs) {

        int[] x = new int[101];
        for(int[] log:logs){
            x[log[0]-1950]++;
            x[log[1]-1950]--;
        }

        int max = x[0];
        int year = 1950;

        for (int i = 1; i < x.length; i++) {
            x[i] +=x[i-1];
            if(x[i]>max){
                max = x[i];
                year = 1950+i;
            }
        }
        return year;

        //my approch

//        Map<Integer,Integer> population = new HashMap<>();
//
//        for (int i = 0; i < logs.length; i++) {
//            int born = logs[i][0];
//            population.put(born, 1);
//            for (int j = 0; j < logs.length; j++) {
//                if(j==i) continue;
//                if(logs[j][0]<=born && logs[j][1]>born){
//                    population.put(born,
//                            population.get(born)+1);
//                }
//            }
//
//        }
//        int min_year = 2050;
//        int pop = 0;
//        for (Map.Entry<Integer,Integer> m:population.entrySet()) {
//            if((m.getValue()>pop)||(m.getValue() == pop && m.getKey()<min_year)){
//                pop = m.getValue();
//                min_year = m.getKey();
//            }
//        }
//        return min_year;
    }
}
