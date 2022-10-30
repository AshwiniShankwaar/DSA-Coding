package GFG;

public class MinMaxInArray {
    class pair{
        long max = 0;
        long min = 0;
        public pair(long max, long min) {
            this.max = max;
            this.min = min;
        }
    }
    public static void main(String[] args) {
        MinMaxInArray m = new MinMaxInArray();
        MinMaxInArray.pair pair = getMinMax(new long[]{1, 345, 234, 21, 56789},5);
        System.out.println(pair.max+" "+ pair.min);
    }

    private static pair getMinMax(long a[], long n) {
        MinMaxInArray m = new MinMaxInArray();
        MinMaxInArray.pair p = null;
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
       // long i = 0;
        for (long k:a) {
            if(k>max){
                max = k;
            }
            if(k<min){
                min = k;
            }
        }
        p = m.new pair(max,min);
        return p;
    }
}
