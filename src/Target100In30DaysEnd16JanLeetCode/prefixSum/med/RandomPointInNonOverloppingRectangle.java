package Target100In30DaysEnd16JanLeetCode.prefixSum.med;

import java.util.*;

/**
 *You are given an array of non-overlapping axis-aligned rectangles rects where rects[i] =
 * [ai, bi, xi, yi] indicates that (ai, bi) is the bottom-left corner point of the ith
 * rectangle and (xi, yi) is the top-right corner point of the ith rectangle. Design an
 * algorithm to pick a random integer point inside the space covered by one of the given
 * rectangles. A point on the perimeter of a rectangle is included in the space covered by
 * the rectangle.
 *
 * Any integer point inside the space covered by one of the given rectangles should be equally
 * likely to be returned.
 *
 * Note that an integer point is a point that has integer coordinates.
 *
 * Implement the Solution class:
 *
 * Solution(int[][] rects) Initializes the object with the given rectangles rects.
 * int[] pick() Returns a random integer point [u, v] inside the space covered by one of the
 * given rectangles.
 * */
public class RandomPointInNonOverloppingRectangle {
//    Set<int[]> rectsPoints = new TreeSet<>((p1, p2)->
//    {
//        int comx = Integer.compare(p1[0],p2[0]);
//        if(comx!=0) return comx;
//        return Integer.compare(p1[1],p2[1]);
//    });
    int[] sums;
    Random random = new Random();
    int[][] arr ;
    public RandomPointInNonOverloppingRectangle(int[][] rects){

        arr = rects;
        sums = new int[rects.length];
        int i = 0;
        int sum = 0;
        for(int[] rect:rects){
            int x1 = rect[0];
            int y1 = rect[1];
            int x2 = rect[2];
            int y2 = rect[3];
            sum += (x2-x1+1)*(y2-y1+1);
            sums[i] = sum;
            i++;
        }

        //time limit extended
//        for(int[] rect:rects){
//            int x1 = rect[0];
//            int y1 = rect[1];
//            int x2 = rect[2];
//            int y2 = rect[3];
//
//            while(x1<=x2){
//                if(y1==y2){
//                    rectsPoints.add(new int[]{x1,y1});
//                    x1++;
//                    y1 = rect[1];
//
//                } else {
//                    rectsPoints.add(new int[]{x1,y1});
//                    y1++;
//                }
//
//            }
//        }
    }
    public int[] pick() {

        int picked = random.nextInt(sums[sums.length - 1]);
        int low = 0, high = sums.length - 1;

        // Correct binary search implementation
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (picked < sums[mid]) high = mid;
            else low = mid + 1;
        }

        // Get the rectangle
        int[] rect = arr[low];
        int x1 = rect[0], y1 = rect[1], x2 = rect[2], y2 = rect[3];

        // Generate random point within the rectangle
        int x = x1 + random.nextInt(x2 - x1 + 1);
        int y = y1 + random.nextInt(y2 - y1 + 1);

        return new int[]{x, y};

//        Random random = new Random();
//
//        List<int[]> points = new ArrayList<int[]>(rectsPoints);
//
//        int point = random.nextInt(points.size());
//        return points.get(point);
    }


}
