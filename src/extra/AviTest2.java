package extra;

public class AviTest2 {
    public static void main(String[] args) {
        int[] x = nearestSmaller(new int[]{2,4,5,1,7});
        for (Integer y:x) {
            System.out.println(y);
        }
    }
    public static int[] nearestSmaller(int[] arr) {
        int[] result = new int[arr.length];
        if (arr == null || arr.length == 0) {
            return arr;
        }

        // do for each element
        for (int i = 0; i < arr.length; i++) {
            // keep track of the previous smaller element for element `arr[i]`
            int prev = -1;

            // process elements on the left of the element `arr[i]`
            for (int j = i - 1; j >= 0; j--) {
                // break the inner loop at the first smaller element on the
                // left of the element `arr[i]`
                if (arr[j] < arr[i]) {
                    prev = arr[j];
                    break;
                }
            }
            result[i] = prev;

        }
        return result;
    }
}
