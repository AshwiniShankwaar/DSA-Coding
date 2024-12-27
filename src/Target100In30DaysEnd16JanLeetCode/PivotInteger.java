package Target100In30DaysEnd16JanLeetCode;

public class PivotInteger {

    public int pivotInteger(int n) {
        if(n==1) return 1;
        int pivot = -1;
        //perform prefix sum
        //[1,2,3,4,5,6,7,8]  -> [1,3,6,10,15,21,28,36] ->
        int totalsum = (n*(n+1))/2;
        int left = 0;
        for (int i = 1; i <=n; i++) {
            left+=i;
            int right = totalsum-left+i;
            if(left==right){
                return i;
            }
        }

        return pivot;
    }
//    public int pivotInteger(int n) {
//        if(n==1) return 1;
//        int pivot = -1;
//        //perform prefix sum
//        //[1,2,3,4,5,6,7,8]  -> [1,3,6,10,15,21,28,36] ->
//        int[] arr = new int[n];
//        arr[0] = 1;
//        for (int i = 1; i < n; i++) {
//            arr[i] = arr[i-1]+(i+1);
//        }
//        for (int i = 1; i < n; i++) {
//            if((arr[n-1]-arr[i]) == arr[i-1]){
//                pivot = i+1;
//            }
//        }
//        return pivot;
//    }
}
