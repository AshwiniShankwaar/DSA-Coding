package GFG;

import java.util.List;
import java.util.ArrayList;

public class Distinct_subset {
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3};
        //find all distinct subsets in an array
        solution(input,0);
    }

    //decision function 1 include
    private static void helper(List<Integer> listSet,int[] input, int position) {
        if(position == input.length){
            if (!listSet.isEmpty()){
                System.out.println(listSet);
            }
            return;
        }

        //include
        listSet.add(input[position]);
        helper(listSet,input,position+1);
        //exclude
        listSet.remove(listSet.size()-1);
        helper(listSet,input,position+1);

    }

    private static void solution(int[] input,int pos) {
       List<Integer> list = new ArrayList();
       helper(list,input,pos);
    }
}
