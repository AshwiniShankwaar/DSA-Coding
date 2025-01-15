package Target100In30DaysEnd16JanLeetCode.HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * You're given strings jewels representing the types of stones that are jewels, and stones
 * representing the stones you have. Each character in stones is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 *
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * */
public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> count = new HashMap<Character,Integer>();
        char[] stonesSet = stones.toCharArray();
        for(char c:stonesSet){
            if(jewels.contains(String.valueOf(c))){
                if (count.containsKey(c)){
                count.put(c, count.getOrDefault(c,0)+1);
                }else{
                    count.put(c,1);
                }
            }
        }
        int sum = 0;
        for(Map.Entry<Character,Integer> entry:count.entrySet()){
            sum+=entry.getValue();
        }
        return sum;
    }
}
