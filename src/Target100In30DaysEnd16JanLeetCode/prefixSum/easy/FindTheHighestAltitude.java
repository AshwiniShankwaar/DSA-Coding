package Target100In30DaysEnd16JanLeetCode.prefixSum.easy;
/**
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
 * The biker starts his trip on point 0 with altitude equal 0.
 *
 * You are given an integer array gain of length n where gain[i] is the net gain in altitude
 * between points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
 * */
public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int high = 0;
        int left = 0;
        for(int i=0;i<gain.length;i++) {
            int x = left+gain[i];
            if(x>high){
                high = x;
            }
            left = x;
        }
        return high;
    }
}
