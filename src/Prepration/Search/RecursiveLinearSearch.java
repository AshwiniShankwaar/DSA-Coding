package Prepration.Search;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int pos = linearsearch(arr,arr.length,23,0);
        if(pos>=0 && pos<arr.length){
            System.out.println("found " +pos);
        }else{
            System.out.println("not found");
        }
    }

    private static int linearsearch(int[] arr, int n, int x, int i) {
        if(i<0 || i>=n){
            return -1;
        }else{
            if(arr[i]==x){
                return i;
            }else{
                return linearsearch(arr,n,x,i+1);
            }
        }
    }
}
